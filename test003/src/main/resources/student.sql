/*
 Navicat Premium Data Transfer

 Source Server         : docker
 Source Server Type    : MySQL
 Source Server Version : 50651
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 50651
 File Encoding         : 65001

 Date: 22/05/2022 15:41:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `passwod` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (1, 'zhangsan', 18, '123456');
INSERT INTO `student` VALUES (3, 'wangwu', 14, '123456');
INSERT INTO `student` VALUES (4, '赵六', 34, '123456');
INSERT INTO `student` VALUES (5, '田七', 34, '123456');
INSERT INTO `student` VALUES (6, '111', 15, NULL);
INSERT INTO `student` VALUES (8, '张二麻子', 17, '123456');
INSERT INTO `student` VALUES (9, '张二麻子', 17, '123456');
INSERT INTO `student` VALUES (10, '????', 17, NULL);
INSERT INTO `student` VALUES (11, '????', 17, NULL);
INSERT INTO `student` VALUES (12, '张二麻子', 17, NULL);
INSERT INTO `student` VALUES (13, '张二麻子', 17, '123456');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
