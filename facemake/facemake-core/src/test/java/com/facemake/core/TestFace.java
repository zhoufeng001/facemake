package com.facemake.core;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.junit.Test;

import com.facemake.util.JsonUtil;
import com.zf.image.text.TextRegional;
import com.zf.image.text.TextableSourceFace;
import com.zf.image.text.maker.StaticImgTextableFaceMaker;

public class TestFace {
	
	@Test
	public void test01(){
		
		TextableSourceFace face = new TextableSourceFace();
		face.setWidth(20);
		face.setHeight(10);
		face.setDescripe("测试");
		
		String attributes = face.getAttributes() ;
		Map<String, Object> attributesMap = JsonUtil.toMap(attributes) ;
		attributesMap.put("isOpen", "1");
		
		List<TextRegional> regionals = face.getTextRegionals() ;
		
		TextRegional r1 = new TextRegional();
		r1.setFontSize(1);
		r1.setFontType("宋体");
		r1.setPoint(new Point(15, 28));  
		r1.setMaxTextSize(3);  
		r1.setColor(Color.red.getRGB());
		
		TextRegional r2 = new TextRegional();
		r2.setFontSize(1);
		r2.setFontType("宋体");
		r2.setPoint(new Point(15, 28));  
		r2.setMaxTextSize(3);  
		r2.setColor(Color.blue.getRGB());  
		
		regionals.add(r1);
		regionals.add(r2);
		
		attributesMap.put(TextableSourceFace.REGIONALS_KEY, regionals) ;  
		attributesMap.put(TextableSourceFace.REGIONALS_SIZE_KEY, regionals.size()) ;
		
		attributes = JsonUtil.toJsonString(attributesMap) ;
		
		face.setAttributes(attributes);
		
		System.out.println(attributes);
		
		
		List<TextRegional> resultRegionals =  JsonUtil.getValueFromJsonString(
				TextableSourceFace.REGIONALS_KEY, 
				attributes, 
				regionals.getClass()
		) ;
		
		System.out.println(resultRegionals);
		
		  
		List<TextRegional> xx =  face.getTextRegionals() ;
		TextRegional tr = xx.get(0);
		System.out.println(xx.size());
		
		System.out.println(face.getTextRegionalsSize());
		
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
	
	@Test
	public void test02(){
		StaticImgTextableFaceMaker faceMaker = new StaticImgTextableFaceMaker() ;
		InputStream sourceImage =  getSourceImage();
		TextableSourceFace sourceFace = getTextableSourceFace() ;
		List<String> texts = new ArrayList<String>() ;
		texts.add("辉儿！！");
		texts.add("管儿~~~");
		faceMaker.format(sourceFace, sourceImage, texts); 
		
		try {
			ImageIO.write((RenderedImage) sourceImage , "jpg", new File("C:/Users/Administrator/git/image4j/image4j/imgs/make2.jpg")) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test03(){
		List<String> list = new ArrayList<String>() ;
		
		System.out.println(list.getClass().getGenericSuperclass());
		System.out.println(list.getClass());
	}

}
