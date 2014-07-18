package com.facemake.util;

public class StringUtil {
	
	/**
	 * 判断字符串是否全部为空，或全由空白字符组成
	 * @param strs
	 * @return
	 */
	public static boolean isBlank(String... strs){
		if(strs == null || strs.length <= 0){
			return true ;
		}
		for (String s : strs) {
			if(s == null || s.matches("(?sm)^\\s*$")){
				return true ;
			}
		}
		return false ;
	}
	
	/**
	 * 判断字符串是否全部不为空，并且不全由空白字符组成
	 * @param strs
	 * @return
	 */
	public static boolean isNotBlank(String... strs){
		return !isBlank(strs);
	}

}
