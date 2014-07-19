package com.facemake.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Json相关操作
 * 使用Gson实现
 * @author is_zhoufeng
 */
public class JsonUtil {

	private static final Gson gson = new GsonBuilder().create() ;
	private static final JsonParser jsonParser = new JsonParser();

	/**
	 * Json字符串抓换为Map对象
	 * @param jsonString
	 * @return
	 */
	public static Map<String, Object> toMap(String jsonString){
		Map<String, Object> result = new HashMap<String, Object>() ;
		if(StringUtil.isBlank(jsonString)){  
			return result ; 
		}
		JsonObject jsonObjest = toJsonObject(jsonString);
		Iterator<Entry<String, JsonElement>> eleIts = jsonObjest.entrySet().iterator();
		while(eleIts.hasNext()){
			Entry<String, JsonElement> jsonEntry = eleIts.next() ;
			String key  = jsonEntry.getKey() ;
			String value = null ;
			if(jsonEntry.getValue() != null ){
				value = jsonEntry.getValue().toString();
			}else{
				value = jsonEntry.getValue().getAsJsonNull().getAsString();
			}
			result.put(key, value) ;
		}
		return result ;
	}
	

	/**
	 * 将实体对象转换为Json格式字符串
	 * @param obj
	 * @return
	 */
	public static String toJsonString(Object obj){
		if(obj == null){
			return "";
		}
		String jsonString = gson.toJson(obj) ;
		return  jsonString ;
	}


	/**
	 * 根据key从一个Json格式字符串中取出该key对应的值
	 * @param key
	 * @return
	 */
	public static String getValueFromJsonString(String key , String jsonString){
		if(StringUtil.isBlank(key , jsonString)){
			 return "" ;
		}
		JsonObject jsonObjest = toJsonObject(jsonString);
		JsonElement jsonElement = jsonObjest.get(key);
		if(jsonElement != null){
			return jsonElement.toString();
		}
		return "" ;
	}
	

	/**
	 * 根据key从一个json字符串中得到指定类型的的对象
	 * @param key
	 * @param valueType
	 * @return
	 */
	public static <T>T getValueFromJsonString(String jsonString , Class<T> valueType){
		if(StringUtil.isBlank(jsonString)){
			 return null ;
		}
		return gson.fromJson(jsonString, valueType) ;  
	}

	/**
	 * 根据key从一个json字符串中得到指定类型的的对象
	 * @param key
	 * @param valueType
	 * @return
	 */
	public static <T>T getValueFromJsonString(String key , String jsonString , Class<T> valueType){
		if(StringUtil.isBlank(key , jsonString)){
			 return null ;
		}
		String valueString = getValueFromJsonString(key , jsonString) ;
		return getValueFromJsonString(valueString , valueType) ;
	}
	
	
	private static JsonObject toJsonObject(String jsonString){
		if(StringUtil.isBlank(jsonString)){
			return new JsonObject() ;
		}
		JsonElement jsonElement = jsonParser.parse(jsonString) ;
		return jsonElement.getAsJsonObject();
	}

}
