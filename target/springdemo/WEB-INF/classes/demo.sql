/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2015-08-20 11:58:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `AGE` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `studentId` int(10) NOT NULL AUTO_INCREMENT,
  `studentName` varchar(255) DEFAULT NULL,
  `studentHobby` varchar(255) DEFAULT NULL,
  `studentMobile` int(10) DEFAULT NULL,
  `studentDOB` date DEFAULT NULL,
  `studentSkills` longtext,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('84', '花果山大王', '掏耳朵', '76163163', '2000-12-13', '[Java Core, Spring Core, Spring MVC]');
INSERT INTO `student` VALUES ('100', 'ToDao', 'coding', '988787544', '1988-08-02', '[Spring Core, Spring MVC]');
INSERT INTO `student` VALUES ('101', 'maofy', 'sleep', '988765465', '1984-09-04', '[Spring Core, Spring MVC]');
INSERT INTO `student` VALUES ('102', 'tyu', 'tyu', '55555', '1990-12-13', '[Spring MVC]');
INSERT INTO `student` VALUES ('103', 'rty', 'bbb', '55555', '2015-12-13', '[Spring Core, Spring MVC]');
INSERT INTO `student` VALUES ('104', '康大大', 'bbb', '55555', '1990-12-13', '[Java Core, Spring Core]');

-- ----------------------------
-- Table structure for `t_message`
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(20) NOT NULL,
  `email` char(40) DEFAULT NULL,
  `msg` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_message
-- ----------------------------
INSERT INTO `t_message` VALUES ('1', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('2', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('3', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('4', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('5', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('6', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('7', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('8', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('9', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('10', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('11', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('12', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('13', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('14', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('15', 'qwe', 'wqe', 'we');
INSERT INTO `t_message` VALUES ('16', 'rty', 'rty', 'rty');
