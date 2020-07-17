/*
 Navicat Premium Data Transfer

 Source Server         : 10.168.1.10
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : 10.168.1.10:3306
 Source Schema         : project

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 17/07/2020 13:33:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `nid` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '平台id',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码盐',
  `dept_id` bigint(20) NULL DEFAULT NULL COMMENT '部门ID',
  `picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别（1:男,2:女）',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话号码',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_date` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(4) NULL DEFAULT 1 COMMENT '状态（1:正常,2:冻结,3:删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, '2', 'admin', '超级管理员', '123', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_user` VALUES (2, '2', 'zs', '管理员', '123', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-05-03 15:09:56', '2019-05-03 15:09:56', 1);
INSERT INTO `sys_user` VALUES (3, '2', '2', '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-16 14:42:44', '2020-07-16 14:42:44', 1);
INSERT INTO `sys_user` VALUES (4, '2', '3', '3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-16 14:42:54', '2020-07-16 14:42:54', 1);
INSERT INTO `sys_user` VALUES (5, '2', '4', '4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-16 14:43:03', '2020-07-16 14:43:03', 1);
INSERT INTO `sys_user` VALUES (6, '2', '5', '5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-16 14:43:26', '2020-07-16 14:43:26', 1);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` bigint(20) NOT NULL,
  `addr` int(11) NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (12, 1, 12, 'zhangsan');
INSERT INTO `t_user` VALUES (11, 2, 22, 'lishi');
INSERT INTO `t_user` VALUES (10, 3, 12, 'zhangsan');
INSERT INTO `t_user` VALUES (13, 4, 22, 'lishi');
INSERT INTO `t_user` VALUES (14, 5, 5, '5');
INSERT INTO `t_user` VALUES (15, 6, 6, '6');
INSERT INTO `t_user` VALUES (17, 6, 6, '6');

SET FOREIGN_KEY_CHECKS = 1;
