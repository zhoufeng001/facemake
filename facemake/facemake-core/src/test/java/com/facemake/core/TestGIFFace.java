package com.facemake.core;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.junit.Test;

import com.facemake.core.maker.text.StaticImgTextableFaceMaker;
import com.facemake.core.sourceface.TextRegional;
import com.facemake.core.sourceface.impl.TextableSourceFace;
import com.facemake.util.JsonUtil;
import com.madgag.gif.fmsware.AnimatedGifEncoder;
import com.madgag.gif.fmsware.GifDecoder;

public class TestGIFFace {

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

	public InputStream getSourceImage(String imgName){
		try {
			String imgPath = "C:/Users/Administrator/Desktop/" + imgName;
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
		StaticImgTextableFaceMaker faceMaker = new StaticImgTextableFaceMaker() ;
		InputStream sourceImage =  getSourceImage("make3.gif");
		TextableSourceFace sourceFace = getTextableSourceFace() ;
		List<String> texts = new ArrayList<String>() ;
		texts.add("辉儿！！");
		texts.add("管儿~~~");
		faceMaker.format(sourceFace, sourceImage, texts); 

		try {
			ImageIO.write((RenderedImage) sourceImage , "gif", new File("C:/Users/Administrator/Desktop/make4.gif")) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test03(){

		AnimatedGifEncoder gifEncoder = new AnimatedGifEncoder();

		gifEncoder.start("C:/Users/Administrator/Desktop/make5.gif") ;

		//		gifEncoder.setDelay(1000);
		//		gifEncoder.setRepeat(1000000);
		//		gifEncoder.setQuality(3);
		//		gifEncoder.setFrameRate(3);

		try {
			gifEncoder.addFrame(ImageIO.read(getSourceImage("make3.gif"))) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		//		gifEncoder.addFrame(getSourceImage("make0.jpg")) ;


		System.out.println(gifEncoder.finish()); ;
	}

	@Test
	public void test04(){

		AnimatedGifEncoder gifEncoder = new AnimatedGifEncoder();
		
		gifEncoder.start("C:/Users/Administrator/Desktop/make6.gif") ;
		gifEncoder.setRepeat(1000);

		GifDecoder gifDecoder = new GifDecoder() ;
		try {
			gifDecoder.read(new FileInputStream(new File("C:/Users/Administrator/Desktop/111.gif"))) ;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int frameCount = gifDecoder.getFrameCount() ;
		System.out.println("frameCount:" + frameCount);
		for (int i =  0 ;i < frameCount ;i++) {
			
			BufferedImage bi = gifDecoder.getFrame(i);
//			
			Graphics graph = bi.getGraphics();
			graph.setColor(Color.red);
			graph.drawString("Hello World", 20, 20);
			
			gifEncoder.setDelay(gifDecoder.getDelay(i));  
			
			gifEncoder.addFrame(bi);

		}

		gifEncoder.finish();
	}

}
