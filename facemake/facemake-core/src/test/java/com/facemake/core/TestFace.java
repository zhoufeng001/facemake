package com.facemake.core;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.junit.Test;

import com.facemake.core.maker.TextableFaceMaker;
import com.facemake.core.sourceface.TextRegional;
import com.facemake.core.sourceface.impl.TextableSourceFace;
import com.facemake.util.JsonUtil;

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
		r1.setLeftDown(new Point(5, 8));
		r1.setLeftUp(new Point(15, 28));  
		r1.setRightDown(new Point(35, 48));
		r1.setRightUp(new Point(25, 38));
		r1.setMaxTextSize(3);  
		r1.setColor(Color.red.getRGB());
		
		TextRegional r2 = new TextRegional();
		r2.setFontSize(1);
		r2.setFontType("宋体");
		r2.setLeftDown(new Point(5, 8));
		r2.setLeftUp(new Point(15, 28));  
		r2.setRightDown(new Point(35, 48));
		r2.setRightUp(new Point(25, 38));
		r2.setMaxTextSize(3);  
		r2.setColor(Color.blue.getRGB());  
		
		regionals.add(r1);
		regionals.add(r2);
		
		attributesMap.put(TextableSourceFace.REGIONALS_KEY, regionals) ;  
		attributesMap.put(TextableSourceFace.REGIONALS_SIZE, regionals.size()) ;
		
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
	
	public Image getSourceImage(){
		try {
			String imgPath = "file:///C:/Users/Administrator/Desktop/make1.jpg";
			BufferedImage img = ImageIO.read(new URL(imgPath)) ;  
			return img ;
		} catch (MalformedURLException e) {
			e.printStackTrace();
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
	
	@Test
	public void test02(){
		TextableFaceMaker faceMaker = new TextableFaceMaker() ;
		Image sourceImage =  getSourceImage();
		TextableSourceFace sourceFace = getTextableSourceFace() ;
		List<String> texts = new ArrayList<String>() ;
		texts.add("辉儿！！");
		texts.add("管儿~~~");
		faceMaker.format(sourceFace, sourceImage, texts); 
		
		try {
			ImageIO.write((RenderedImage) sourceImage , "jpg", new File("C:/Users/Administrator/Desktop/make2.jpg")) ;
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
