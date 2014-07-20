package com.facemake.core.maker.text;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.imageio.ImageIO;

import com.facemake.core.sourceface.AbstractTextableSourceFace;

/**
 * 静态图片加入文字处理
 * @author Administrator
 */
public class StaticImgTextableFaceMaker extends AbstractTextableFaceMaker{
	
	public static final String IMAGE_FORMAT_NAME = "jpg" ;
	public static final String DEFAULT_FONT_NAME = "宋体";
	public static final int DEFAULT_FONT_SIZE = 12 ;

	public InputStream format(AbstractTextableSourceFace sourceFace ,InputStream sourceImgStream , List<String> texts){
		if(sourceImgStream == null){
			return null ;
		}
		
		BufferedImage sourceImg = null;
		try {
			sourceImg = ImageIO.read(sourceImgStream);
		} catch (IOException e) {
			e.printStackTrace();
			return sourceImgStream ;
		}
		
		if(sourceFace == null
				|| texts == null || texts.size() <= 0 ){
			return sourceImgStream ;
		}

		//渲染图片
		renderImage(sourceImg , sourceFace ,texts);
		
		ByteArrayOutputStream imageData = new ByteArrayOutputStream() ;
		try {
			ImageIO.write(sourceImg, IMAGE_FORMAT_NAME, imageData) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new ByteArrayInputStream(imageData.toByteArray()) ;
	}
	
}
