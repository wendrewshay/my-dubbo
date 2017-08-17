/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2017-08-17 17:29:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `soa_user`
-- ----------------------------
DROP TABLE IF EXISTS `soa_user`;
CREATE TABLE `soa_user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `age` int(3) DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of soa_user
-- ----------------------------
INSERT INTO `soa_user` VALUES ('1', '夏文强', '123456', '25', '男');
