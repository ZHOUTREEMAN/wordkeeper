/*
Navicat MySQL Data Transfer

Source Server         : MySql8.0.15
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : word_keeper

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-02-08 20:03:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for punch
-- ----------------------------
DROP TABLE IF EXISTS `punch`;
CREATE TABLE `punch` (
  `id` bigint(9) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(9) NOT NULL,
  `date` datetime(2) NOT NULL,
  `nums` bigint(5) NOT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of punch
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `name` varchar(31) NOT NULL,
  `user_photo` varchar(255) DEFAULT NULL,
  `role_id` tinyint(1) DEFAULT NULL,
  `passw` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `tel` varchar(11) NOT NULL,
  `vocabulary` bigint(9) DEFAULT NULL,
  `num_everyday` bigint(5) DEFAULT NULL,
  `books` varchar(255) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for word_book
-- ----------------------------
DROP TABLE IF EXISTS `word_book`;
CREATE TABLE `word_book` (
  `id` bigint(9) NOT NULL AUTO_INCREMENT,
  `word` varchar(255) NOT NULL,
  `paraphrase` varchar(255) NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `user_id` bigint(9) NOT NULL,
  `date` datetime(2) NOT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of word_book
-- ----------------------------
