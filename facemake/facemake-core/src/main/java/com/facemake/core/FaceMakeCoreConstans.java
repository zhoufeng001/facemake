package com.facemake.core;

public enum FaceMakeCoreConstans {
	
	/* 源图片存储路径 */
	SOURCE_IMAGES_DIR(FaceMakeCoreProperties.getProperties("source_images_dir"));
	
	
	FaceMakeCoreConstans(String value){
		this.value = value ;
	}
	
	public String value ;

	public String getValue() {
		return value;
	}
	

}
