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
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.facemake.core.maker.text.DynamicImgTextableFaceMaker;
import com.facemake.core.sourceface.TextRegional;
import com.facemake.core.sourceface.impl.TextableSourceFace;
import com.facemake.util.JsonUtil;
import com.facemake.util.TimerUtil;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath*:core-beans.xml"})
public class SpringTest {

	@Autowired
	DynamicImgTextableFaceMaker faceMaker ;
	
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
		face.setRepeat(Integer.MAX_VALUE);  

		String attributes = face.getAttributes() ;
		Map<String, Object> attributesMap = JsonUtil.toMap(attributes) ;

		List<TextRegional> regionals = face.getTextRegionals() ;

		TextRegional r1 = new TextRegional();
		r1.setFontSize(25);
		r1.setFontType("仿宋");
		r1.setLeftUp(new Point(20, 30));  
		r1.setMaxTextSize(3);  
		r1.setColor(Color.red.getRGB());

		TextRegional r2 = new TextRegional();
		r2.setFontSize(25);
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
	public void testGIFImage(){
		
		TimerUtil.start("sss");
		
		List<String> texts = new ArrayList<String>() ;
		texts.add("辉儿，啊~~，哦~！！");
		texts.add("管儿！！。。~~~");
		
		InputStream result = faceMaker.format(getTextableSourceFace() ,getSourceImage("111.gif")
				, texts ) ;
		
		try {
			IOUtils.copy(result, new FileOutputStream(new File("C:/Users/Administrator/Desktop/make11.gif"))) ;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(TimerUtil.timing());
		
	}

	
}
