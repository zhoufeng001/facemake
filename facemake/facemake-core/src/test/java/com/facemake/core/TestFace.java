package com.facemake.core;

import java.awt.Point;
import java.util.List;
import java.util.Map;

import org.junit.Test;

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
		
		regionals.add(r1);
		
		attributesMap.put(TextableSourceFace.REGIONALS_KEY, regionals) ;  
		
		attributes = JsonUtil.toJsonString(attributesMap) ;  
		
		System.out.println(attributes);
		
		
		List<TextRegional> resultRegionals =  JsonUtil.getValueFromJsonString(
				TextableSourceFace.REGIONALS_KEY, 
				attributes, 
				regionals.getClass()
		) ;
		
		System.out.println(resultRegionals);
		
		
		face.setAttributes(attributes);
		  
		List<TextRegional> xx =  face.getTextRegionals() ;
		
		System.out.println(xx.size());
		
	}

}
