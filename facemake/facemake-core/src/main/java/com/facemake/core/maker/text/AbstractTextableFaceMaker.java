package com.facemake.core.maker.text;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.List;

import com.facemake.core.maker.FaceMaker;
import com.facemake.core.sourceface.AbstractTextableSourceFace;
import com.facemake.core.sourceface.TextRegional;
import com.facemake.util.StringUtil;

/**
 * 作为对图片文字编辑的抽象父类
 * @author Administrator
 */
public abstract class AbstractTextableFaceMaker extends FaceMaker<List<String> , AbstractTextableSourceFace>{

	/**
	 * 从TextRegional中获取定义的Font信息
	 */
	protected Font getFontFromRegional( TextRegional textRegional ){
		String fontType = textRegional.getFontType() ;
		int fontSize = textRegional.getFontSize() ;
		if(StringUtil.isBlank(fontType)){
			fontType = StaticImgTextableFaceMaker.DEFAULT_FONT_NAME;
		}
		if(fontSize <= 0){
			fontSize = StaticImgTextableFaceMaker.DEFAULT_FONT_SIZE ;
		}
		return new Font(
				fontType, 
				Font.BOLD , fontSize ) ;
	}

	/**
	 * 使用文字渲染图片特定区域
	 * @param image
	 * @param textRegionals
	 * @param texts
	 */
	protected void renderImage(BufferedImage image ,AbstractTextableSourceFace sourceFace , List<String> texts){

		List<TextRegional> textRegionals = sourceFace.getTextRegionals() ;
		int regionalsSize = sourceFace.getTextRegionalsSize() ;
		
		if(textRegionals == null ||  regionalsSize <= 0 ){
			return ;
		}

		if(regionalsSize < texts.size()){
			throw new RuntimeException(String.format("文字条数太多，【可编辑区域：%d，文字条数：%d】" + 
					regionalsSize , texts.size()));
		}

		Graphics graph = image.getGraphics() ;
		for (int i = 0; i < texts.size() ; i++) {
			TextRegional textRegional = textRegionals.get(i) ;
			Font font = getFontFromRegional(textRegional) ;
			graph.setFont(font);
			graph.setColor(new Color(textRegional.getColor()));  
			String text = texts.get(i);
			if(StringUtil.isBlank(text)){
				continue ;
			}
			Point leftUpPoint = textRegional.getLeftUp() ;
			graph.drawString(text, leftUpPoint.x, leftUpPoint.y); 
		}
	}


}
