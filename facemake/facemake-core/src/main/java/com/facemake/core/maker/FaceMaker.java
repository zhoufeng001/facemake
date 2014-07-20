package com.facemake.core.maker;

import java.io.InputStream;

import com.facemake.core.sourceface.AbstractSourceFace;

/**
 *格式化表情抽象接口 
 * @author Administrator
 * @param <T>  格式化携带的数据 , <D> 源图信息
 */
public abstract class FaceMaker <T , D extends AbstractSourceFace> {
	
	
	public abstract InputStream  format( D sourceFace , InputStream sourceImgStream , T data);

}
