package com.facemake.core.sourceface;

import java.util.List;

public interface AbstractTextableSourceFace extends AbstractSourceFace{
	
	/**
	 * 只用于读取
	 * 对返回的Result List的修改不会反映到DB
	 * @return
	 */
	List<TextRegional> getTextRegionals() ;

}
