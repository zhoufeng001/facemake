package com.facemake.mybatis.genrator.plugins;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class MyPlugin extends PluginAdapter {

    @Override
	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(
			Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		return false;
	}

	@Override
	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(
			Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		return false;
	}

	@Override
	public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(
			Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		return false;
	}

	@Override
	public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(
			Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		return false;
	}
	

	@Override
	public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(
			Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		return false;
	}

	@Override
	public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(
			Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(
			XmlElement element, IntrospectedTable introspectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(
			XmlElement element, IntrospectedTable introspectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(
			XmlElement element, IntrospectedTable introspectedTable) {
		return false;
	}

	public boolean validate(List<String> warnings) {
        return true;
    }
    
    

}
