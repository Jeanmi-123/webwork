/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : mydatis_study

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 26/11/2020 11:47:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for subject_info
-- ----------------------------
DROP TABLE IF EXISTS `subject_info`;
CREATE TABLE `subject_info`  (
  `sub_id` int(11) NOT NULL AUTO_INCREMENT,
  `sub_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sub_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of subject_info
-- ----------------------------
INSERT INTO `subject_info` VALUES (1, 'java');
INSERT INTO `subject_info` VALUES (2, 'python');
INSERT INTO `subject_info` VALUES (3, 'php');
INSERT INTO `subject_info` VALUES (4, 'user1');
INSERT INTO `subject_info` VALUES (5, 'user1');
INSERT INTO `subject_info` VALUES (6, 'Jeanmi');
INSERT INTO `subject_info` VALUES (7, 'aaa');
INSERT INTO `subject_info` VALUES (8, 'aa');
INSERT INTO `subject_info` VALUES (9, 'lg');
INSERT INTO `subject_info` VALUES (10, 'qzh');
INSERT INTO `subject_info` VALUES (11, 'lhq');
INSERT INTO `subject_info` VALUES (12, 'fjy');
INSERT INTO `subject_info` VALUES (13, 'aa');

SET FOREIGN_KEY_CHECKS = 1;
