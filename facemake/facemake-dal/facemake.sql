/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50616
Source Host           : localhost:3306
Source Database       : facemake

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2014-07-24 01:21:52
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `fm_user`
-- ----------------------------
DROP TABLE IF EXISTS `fm_user`;
CREATE TABLE `fm_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `nick` varchar(30) NOT NULL COMMENT '用户昵称',
  `password` char(32) NOT NULL COMMENT '用户密码',
  `come_from` tinyint(1) unsigned DEFAULT NULL COMMENT '用户来源',
  `icon` char(32) DEFAULT NULL COMMENT '用户头像',
  `status` tinyint(1) unsigned DEFAULT NULL COMMENT '状态',
  `flag` int(11) DEFAULT NULL COMMENT '标位',
  `attributes` text COMMENT '扩展字段',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fm_user
-- ----------------------------

-- ----------------------------
-- Table structure for `source_img`
-- ----------------------------
DROP TABLE IF EXISTS `source_img`;
CREATE TABLE `source_img` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` char(32) NOT NULL COMMENT '图片名',
  `descript` varchar(100) DEFAULT NULL COMMENT '描述',
  `width` int(4) unsigned DEFAULT NULL COMMENT '图片宽度',
  `height` int(4) unsigned DEFAULT NULL COMMENT '图片高度',
  `attributes` text COMMENT '扩展字段',
  `status` tinyint(1) unsigned DEFAULT NULL COMMENT '沉余字段',
  `flag` int(11) DEFAULT NULL COMMENT '标位',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `create_user_id` bigint(20) unsigned DEFAULT NULL COMMENT '创建用户id',
  `create_user_nick` varchar(30) DEFAULT NULL COMMENT '创建用户nick',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of source_img
-- ----------------------------
