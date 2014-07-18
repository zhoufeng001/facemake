package com.facemake.core.sourceface;

import java.awt.Point;

/**
 * 源图中可编辑区域
 * @author Administrator
 */
public class TextRegional {

	private Point leftUp ;
	private Point rightUp ;
	private Point leftDown ;
	private Point rightDown ;
	
	private String fontType ;
	private int fontSize ;
	private int maxTextSize ;
	
	public Point getLeftUp() {
		return leftUp;
	}
	public void setLeftUp(Point leftUp) {
		this.leftUp = leftUp;
	}
	public Point getRightUp() {
		return rightUp;
	}
	public void setRightUp(Point rightUp) {
		this.rightUp = rightUp;
	}
	public Point getLeftDown() {
		return leftDown;
	}
	public void setLeftDown(Point leftDown) {
		this.leftDown = leftDown;
	}
	public Point getRightDown() {
		return rightDown;
	}
	public void setRightDown(Point rightDown) {
		this.rightDown = rightDown;
	}
	public String getFontType() {
		return fontType;
	}
	public void setFontType(String fontType) {
		this.fontType = fontType;
	}
	public int getFontSize() {
		return fontSize;
	}
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}
	public int getMaxTextSize() {
		return maxTextSize;
	}
	public void setMaxTextSize(int maxTextSize) {
		this.maxTextSize = maxTextSize;
	}
	
}
