package com.facemake.mybatis.genrator.plugins;

import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.Context;

public class MyPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public Context getContext() {
        // TODO Auto-generated method stub
        return super.getContext();
    }

    @Override
    public void setContext(Context context) {
        // TODO Auto-generated method stub
        super.setContext(context);
    }

    @Override
    public Properties getProperties() {
        // TODO Auto-generated method stub
        return super.getProperties();
    }

    @Override
    public void setProperties(Properties properties) {
        // TODO Auto-generated method stub
        super.setProperties(properties);
    }

    @Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles() {
        // TODO Auto-generated method stub
        return super.contextGenerateAdditionalJavaFiles();
    }

    @Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.contextGenerateAdditionalJavaFiles(introspectedTable);
    }

    @Override
    public List<GeneratedXmlFile> contextGenerateAdditionalXmlFiles() {
        // TODO Auto-generated method stub
        return super.contextGenerateAdditionalXmlFiles();
    }

    @Override
    public List<GeneratedXmlFile> contextGenerateAdditionalXmlFiles(IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.contextGenerateAdditionalXmlFiles(introspectedTable);
    }

    @Override
    public boolean clientCountByExampleMethodGenerated(Method method, Interface interfaze,
                                                       IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientCountByExampleMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientCountByExampleMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                       IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientCountByExampleMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientDeleteByExampleMethodGenerated(Method method, Interface interfaze,
                                                        IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientDeleteByExampleMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientDeleteByExampleMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                        IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientDeleteByExampleMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientDeleteByPrimaryKeyMethodGenerated(Method method, Interface interfaze,
                                                           IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientDeleteByPrimaryKeyMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientDeleteByPrimaryKeyMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                           IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientDeleteByPrimaryKeyMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientInsertMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientInsertMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientInsertMethodGenerated(Method method, TopLevelClass topLevelClass,
                                               IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientInsertMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method, Interface interfaze,
                                                                 IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientSelectByExampleWithBLOBsMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                 IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientSelectByExampleWithBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(Method method, Interface interfaze,
                                                                    IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientSelectByExampleWithoutBLOBsMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                    IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientSelectByExampleWithoutBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientSelectByPrimaryKeyMethodGenerated(Method method, Interface interfaze,
                                                           IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientSelectByPrimaryKeyMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientSelectByPrimaryKeyMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                           IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientSelectByPrimaryKeyMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientUpdateByExampleSelectiveMethodGenerated(Method method, Interface interfaze,
                                                                 IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByExampleSelectiveMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientUpdateByExampleSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                 IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByExampleSelectiveMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method method, Interface interfaze,
                                                                 IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByExampleWithBLOBsMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                 IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByExampleWithBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(Method method, Interface interfaze,
                                                                    IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByExampleWithoutBLOBsMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                    IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByExampleWithoutBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(Method method, Interface interfaze,
                                                                    IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByPrimaryKeySelectiveMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                    IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByPrimaryKeySelectiveMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(Method method, Interface interfaze,
                                                                    IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                    IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, Interface interfaze,
                                                                       IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                       IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                       IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        // TODO Auto-generated method stub
        return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
    }

    @Override
    public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass,
                                              IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        // TODO Auto-generated method stub
        return super.modelGetterMethodGenerated(method, topLevelClass, introspectedColumn, introspectedTable,
                                                modelClassType);
    }

    @Override
    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.modelPrimaryKeyClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.modelRecordWithBLOBsClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass,
                                              IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        // TODO Auto-generated method stub
        return super.modelSetterMethodGenerated(method, topLevelClass, introspectedColumn, introspectedTable,
                                                modelClassType);
    }

    @Override
    public boolean sqlMapResultMapWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapResultMapWithoutBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapCountByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapCountByExampleElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapDeleteByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapDeleteByExampleElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapDeleteByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapDeleteByPrimaryKeyElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    @Override
    public boolean sqlMapExampleWhereClauseElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapExampleWhereClauseElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapGenerated(sqlMap, introspectedTable);
    }

    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapInsertElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapResultMapWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapResultMapWithBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element,
                                                                     IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapSelectByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement element,
                                                                  IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapSelectByExampleWithBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapSelectByPrimaryKeyElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapUpdateByExampleSelectiveElementGenerated(XmlElement element,
                                                                  IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapUpdateByExampleSelectiveElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapUpdateByExampleWithBLOBsElementGenerated(XmlElement element,
                                                                  IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapUpdateByExampleWithBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(XmlElement element,
                                                                     IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeySelectiveElementGenerated(XmlElement element,
                                                                     IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapUpdateByPrimaryKeySelectiveElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeyWithBLOBsElementGenerated(XmlElement element,
                                                                     IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapUpdateByPrimaryKeyWithBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement element,
                                                                        IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapInsertSelectiveElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean clientInsertSelectiveMethodGenerated(Method method, Interface interfaze,
                                                        IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientInsertSelectiveMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientInsertSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                        IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientInsertSelectiveMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        super.initialized(introspectedTable);
    }

    @Override
    public boolean sqlMapBaseColumnListElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapBaseColumnListElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapBlobColumnListElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapBlobColumnListElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean providerGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerApplyWhereMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                     IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerApplyWhereMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerCountByExampleMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                         IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerCountByExampleMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerDeleteByExampleMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                          IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerDeleteByExampleMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerInsertSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                          IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerInsertSelectiveMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerSelectByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                   IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerSelectByExampleWithBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerSelectByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                      IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerSelectByExampleWithoutBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerUpdateByExampleSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                   IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerUpdateByExampleSelectiveMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerUpdateByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                   IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerUpdateByExampleWithBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerUpdateByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                      IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerUpdateByExampleWithoutBLOBsMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean providerUpdateByPrimaryKeySelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                                      IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.providerUpdateByPrimaryKeySelectiveMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientSelectAllMethodGenerated(Method method, Interface interfaze,
                                                  IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientSelectAllMethodGenerated(method, interfaze, introspectedTable);
    }

    @Override
    public boolean clientSelectAllMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                  IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.clientSelectAllMethodGenerated(method, topLevelClass, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectAllElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        return super.sqlMapSelectAllElementGenerated(element, introspectedTable);
    }

}
