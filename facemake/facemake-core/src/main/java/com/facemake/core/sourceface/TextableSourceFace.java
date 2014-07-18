package com.facemake.core.sourceface;

import java.util.List;

/**
 * 源图 
 * @author is_zhoufeng
 */
public class TextableSourceFace implements AbstractTextableSourceFace {
	
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
		return null;
	}
	
}
