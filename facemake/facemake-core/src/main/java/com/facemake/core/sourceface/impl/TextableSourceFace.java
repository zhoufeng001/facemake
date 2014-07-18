package com.facemake.core.sourceface.impl;

import java.util.ArrayList;
import java.util.List;

import com.facemake.core.sourceface.AbstractTextableSourceFace;
import com.facemake.core.sourceface.TextRegional;
import com.facemake.util.JsonUtil;
import com.facemake.util.StringUtil;

/**
 * 源图 
 * @author is_zhoufeng
 */
public class TextableSourceFace implements AbstractTextableSourceFace {
	
	public static final String REGIONALS_KEY = "regionals";
	
	/* 图像宽度 */
	private int width ;
	/* 图像高度 */
	private int height ;
	/* 描述 */
	private String descripe ;
	/* 扩展字段（JSON格式） */
	private String attributes ;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getDescripe() {
		return descripe;
	}
	
	public void setDescripe(String descripe) {
		this.descripe = descripe;
	}
	public String getAttributes() {
		return attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	
	public List<TextRegional> getTextRegionals() {
		List<TextRegional> regionals = new ArrayList<TextRegional>() ;
		if(StringUtil.isNotBlank(attributes)){
			regionals = JsonUtil.getValueFromJsonString(REGIONALS_KEY, regionals.getClass()) ;
		}
		return regionals;
	}
	
}
