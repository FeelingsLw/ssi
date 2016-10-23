/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 60011
Source Host           : localhost:3306
Source Database       : myoa

Target Server Type    : MYSQL
Target Server Version : 60011
File Encoding         : 65001

Date: 2016-10-23 17:16:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `level` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '列兵', '1');
INSERT INTO `t_role` VALUES ('2', '士官', '2');
INSERT INTO `t_role` VALUES ('3', ' 少尉', '3');
INSERT INTO `t_role` VALUES ('4', ' 中尉', '4');
INSERT INTO `t_role` VALUES ('5', ' 上尉', '5');
INSERT INTO `t_role` VALUES ('6', ' 少校', '6');
INSERT INTO `t_role` VALUES ('7', ' 中校', '7');
INSERT INTO `t_role` VALUES ('8', ' 上校', '8');
INSERT INTO `t_role` VALUES ('9', ' 少将', '9');
INSERT INTO `t_role` VALUES ('10', ' 中将', '10');
INSERT INTO `t_role` VALUES ('11', ' 上将', '11');
INSERT INTO `t_role` VALUES ('12', '司令', '66');
