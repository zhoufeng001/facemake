package com.facemake.core.maker;

import java.awt.Font;
import java.io.InputStream;

import com.facemake.core.maker.text.StaticImgTextableFaceMaker;
import com.facemake.core.sourceface.AbstractSourceFace;
import com.facemake.core.sourceface.TextRegional;
import com.facemake.util.StringUtil;

/**
 *格式化表情抽象接口 
 * @author Administrator
 * @param <T>  格式化携带的数据 , <D> 源图信息
 */
public abstract class FaceMaker <T , D extends AbstractSourceFace> {
	
	
	public abstract InputStream  format( D sourceFace , InputStream sourceImgStream , T data);
	
	protected   Font getFontFromRegional( TextRegional textRegional ){
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

}
