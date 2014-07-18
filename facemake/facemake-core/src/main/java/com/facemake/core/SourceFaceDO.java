package com.facemake.core;

/**
 * 源图 
 * @author is_zhoufeng
 */
public class SourceFaceDO {
	
	/* 图像宽度 */
	private int width ;
	/* 图像高度 */
	private int height ;
	/* 图像名称（DB）*/
	private String name ;
	/* 相对路劲 */
	private String relativePath ;
	/* 描述 */
	private String descripe ;
	/* 扩展字段（JSON格式） */
	private String attributes ;
	/* 标位 */
	private int flag ;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelativePath() {
		return relativePath;
	}
	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
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
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
}
