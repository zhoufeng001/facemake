package com.facemake.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.facemake.core.SourceFaceDO;

public class JsonUtilTest {

	@Test
	public void test01(){
		
		String jsonString1 = "{\"a\": \"aaa\",\"b\":{\"c\":\"xxx\",\"e\":\"eee\"}}";
		String jsonString2 = "{a: \"aaa\",b: \"bbb\"}"	;

		Map<String, String> map = JsonUtil.toMap(jsonString1) ;
		
		Iterator<Entry<String, String>> it =  map.entrySet().iterator() ;
		while(it.hasNext()){
			Entry<String, String> entry = it.next() ;
			System.out.printf("key:%s,value:%s%n"
					,entry.getKey() , entry.getValue());
		}

	}
	
	@Test
	public void test02(){
		
		SourceFaceDO faceDO = new SourceFaceDO() ;
		faceDO.setDescripe("ssssss");
		faceDO.setFlag(3);
		faceDO.setHeight(10);
		faceDO.setName("is_zhoufeng");
		faceDO.setRelativePath(null);
		
		String jsonString = JsonUtil.toJsonString(faceDO) ;
		
		System.out.println(jsonString);  
		
	}
	
	
	@Test
	public void test03(){
		String jsonString1 = "{\"a\": \"aaa\",\"b\":{\"c\":\"xxx\",\"e\":\"eee\"}}";
		
		String result = JsonUtil.getValueFromJsonString("b", jsonString1) ;
		
		System.out.println(result);
		
	}

}
