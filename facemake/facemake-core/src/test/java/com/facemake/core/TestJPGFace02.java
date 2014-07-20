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

import com.facemake.core.maker.text.AbstractTextableFaceMaker;
import com.facemake.core.maker.text.StaticImgTextableFaceMaker;
import com.facemake.core.sourceface.TextRegional;
import com.facemake.core.sourceface.impl.TextableSourceFace;
import com.facemake.util.JsonUtil;
import com.facemake.util.TimerUtil;

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
		r1.setLeftUp(new Point(20, 30));  
		r1.setMaxTextSize(3);  
		r1.setColor(Color.red.getRGB());
		

		TextRegional r2 = new TextRegional();
		r2.setFontSize(15);
		r2.setFontType("楷体");
		r2.setLeftUp(new Point(134, 142));  
		r2.setMaxTextSize(3);  
		r2.setColor(Color.green.getRGB());
		
		regionals.add(r1);
		regionals.add(r2);
		
		attributesMap.put(TextableSourceFace.REGIONALS_SIZE, regionals.size()) ;
		attributesMap.put(TextableSourceFace.REGIONALS_KEY, regionals) ;  
		
		attributes = JsonUtil.toJsonString(attributesMap) ;
		
		face.setAttributes(attributes);
		
		return face ;
	}
	

	public InputStream getSourceImage(){
		try {
			String imgPath = "C:/Users/Administrator/Desktop/make1.jpg";
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
			IOUtils.copy(result, new FileOutputStream(new File("C:/Users/Administrator/Desktop/make8.jpg"))) ;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long time = TimerUtil.timing() ;
		System.out.println(time);
		
	}
	
}
