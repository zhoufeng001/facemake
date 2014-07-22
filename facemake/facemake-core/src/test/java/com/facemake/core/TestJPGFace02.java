package com.facemake.core;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.facemake.util.JsonUtil;
import com.facemake.util.TimerUtil;
import com.zf.image.text.TextRegional;
import com.zf.image.text.TextableSourceFace;
import com.zf.image.text.maker.AbstractTextableFaceMaker;
import com.zf.image.text.maker.StaticImgTextableFaceMaker;

public class TestJPGFace02 {
	
	public TextableSourceFace getTextableSourceFace(){
		TextableSourceFace face = new TextableSourceFace();
		face.setWidth(20);
		face.setHeight(10);
		face.setDescripe("测试");
		
		String attributes = face.getAttributes() ;
		Map<String, Object> attributesMap = JsonUtil.toMap(attributes) ;
		
		List<TextRegional> regionals = face.getTextRegionals() ;
		
		TextRegional r1 = new TextRegional();
		r1.setFontSize(18);
		r1.setFontType("仿宋");
		r1.setPoint(new Point(20, 30));  
		r1.setMaxTextSize(3);  
		r1.setColor(Color.red.getRGB());
		

		TextRegional r2 = new TextRegional();
		r2.setFontSize(15);
		r2.setFontType("楷体");
		r2.setPoint(new Point(134, 142));  
		r2.setMaxTextSize(3);  
		r2.setColor(Color.green.getRGB());
		
		regionals.add(r1);
		regionals.add(r2);
		
		attributesMap.put(TextableSourceFace.REGIONALS_SIZE_KEY, regionals.size()) ;
		attributesMap.put(TextableSourceFace.REGIONALS_KEY, regionals) ;  
		
		attributes = JsonUtil.toJsonString(attributesMap) ;
		
		face.setAttributes(attributes);
		
		return face ;
	}
	

	public InputStream getSourceImage(){
		try {
			String imgPath = "C:/Users/Administrator/git/image4j/image4j/imgs/make1.jpg";
			return new FileInputStream(new File(imgPath)) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null ;
	}
	
	
	
	@Test
	public void testStaticImg(){
		
		TimerUtil.start("sss");
		
		AbstractTextableFaceMaker imgMaker = new StaticImgTextableFaceMaker() ;
		
		List<String> texts = new ArrayList<String>() ;
		texts.add("辉儿！！");
		texts.add("管儿~~~");
		
		InputStream result = imgMaker.format(getTextableSourceFace(), getSourceImage(), texts) ;

		try {
			IOUtils.copy(result, new FileOutputStream(new File("C:/Users/Administrator/git/image4j/image4j/imgs/make8.jpg"))) ;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long time = TimerUtil.timing() ;
		System.out.println(time);
		
	}
	
}
