/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : groupdemo_report

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 25/02/2020 15:30:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for rp_menu
-- ----------------------------
DROP TABLE IF EXISTS `rp_menu`;
CREATE TABLE `rp_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `level` int(11) NULL DEFAULT NULL,
  `path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 511 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rp_menu
-- ----------------------------
INSERT INTO `rp_menu` VALUES (100, '用户管理', 0, 'iconfont icon-user', 0, 'users');
INSERT INTO `rp_menu` VALUES (110, '用户列表', 100, NULL, 1, 'users');
INSERT INTO `rp_menu` VALUES (200, '权限管理', 0, 'iconfont icon-tijikongjian', 0, 'rights');
INSERT INTO `rp_menu` VALUES (210, '权限列表', 200, NULL, 1, 'rights');
INSERT INTO `rp_menu` VALUES (220, '角色列表', 200, NULL, 1, 'roles');
INSERT INTO `rp_menu` VALUES (300, '日报管理', 0, 'iconfont icon-shangpin', 0, 'reports');
INSERT INTO `rp_menu` VALUES (310, '日报列表', 300, NULL, 1, 'reports');
INSERT INTO `rp_menu` VALUES (400, '项目管理', 0, 'iconfont icon-danju', 0, 'projects');
INSERT INTO `rp_menu` VALUES (410, '项目列表', 400, NULL, 1, 'project');
INSERT INTO `rp_menu` VALUES (500, '数据统计', 0, 'iconfont icon-baobiao', 0, 'statistics');
INSERT INTO `rp_menu` VALUES (510, '数据报表', 500, NULL, 1, 'statistics');

-- ----------------------------
-- Table structure for rp_product
-- ----------------------------
DROP TABLE IF EXISTS `rp_product`;
CREATE TABLE `rp_product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rp_report
-- ----------------------------
DROP TABLE IF EXISTS `rp_report`;
CREATE TABLE `rp_report`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` datetime(0) NULL DEFAULT NULL,
  `contents` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `trouble` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `method` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `harvest` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `plan` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rp_report
-- ----------------------------
INSERT INTO `rp_report` VALUES (1, 'test', 'xxx', '2020-02-02 00:00:00', 'xxxxxxxxx', 'xxxxxxx', 'xxxxxxxx', 'xxxxxxxx', 'xxxxxxx');
INSERT INTO `rp_report` VALUES (2, 'xxxx', 'xxx', '2020-02-01 00:00:00', 'xxxxxxxxxxxxx', 'xxxxxx', 'xxxxxxx', 'xxxxxxxxxxxxxxxxxxxxxxx', 'xxxxxxxxxxxxxxxxxxxx');
INSERT INTO `rp_report` VALUES (3, 'yyyyy', 'yyy', '2020-01-01 00:00:00', 'yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy', 'yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy', 'yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy', 'yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy', 'yyyyyyyyyyyyyyyyyyyyyyyyyyy');
INSERT INTO `rp_report` VALUES (4, 'QQQ', 'qqqq', '2020-01-03 00:00:00', 'YYYYYYCCCC', 'wsdadasdw', 'wfwefwqweq', 'qqqqqqqq', 'qqqqqq');
INSERT INTO `rp_report` VALUES (5, '第N次周报', 'xx', '2020-02-19 00:00:00', 'vue 后台管理系统实战练习,根据提供的API接口文档自主通过spring boot开发后端,给前端提供调用接口.用户管理方面功能基本上实现,能够熟练的运用vue + element ui 开发前端.', '安装 Redis MongoDB环境遇到一定问题,目前尚未能掌握项目部署上线的经验和能力,有待学习', '先把手头的项目练熟,然后去完善日报系统,结合项目经验.另外考虑了解 spring Cloud微服务项目的一些基础知识.', '对于简单的操作,遇到的`简单问题.都能简单的解决.但是对于很多复杂问题没有人头绪,.解决起来找不到方法,总之,在项目实战操作的过程中,还是学习到了很多开发过成中的经验心得', '继续练习 Spring Bioot + Vue 实战项目,平时拓宽知识阅读面');
INSERT INTO `rp_report` VALUES (6, 'xxx', 'xxx', '2020-02-11 00:00:00', 'xxxxxx', 'xxxxxx', 'xxxxxx', 'xxxxxxx', 'xxxxxx');
INSERT INTO `rp_report` VALUES (8, 'xxxxxxx', 'xxxxx', NULL, 'xxxxxxx\nxxxxxxxx\nxxxxxxxx\nxxxxxxx', 'xxxxxxx\nxxxxxxx\nxxxxxx', '', '', '');
INSERT INTO `rp_report` VALUES (9, '', '', NULL, '', '', '', '', '');

-- ----------------------------
-- Table structure for rp_right
-- ----------------------------
DROP TABLE IF EXISTS `rp_right`;
CREATE TABLE `rp_right`  (
  `right_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  `level` int(11) NULL DEFAULT NULL,
  `path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`right_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 511 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rp_right
-- ----------------------------
INSERT INTO `rp_right` VALUES (100, '用户管理', 0, 0, 'users');
INSERT INTO `rp_right` VALUES (110, '用户列表', 100, 1, 'users');
INSERT INTO `rp_right` VALUES (111, '添加用户', 110, 2, 'users');
INSERT INTO `rp_right` VALUES (112, '删除用户', 110, 2, 'users');
INSERT INTO `rp_right` VALUES (113, '更新用户', 110, 2, 'users');
INSERT INTO `rp_right` VALUES (114, '获取用户详情', 110, 2, 'users');
INSERT INTO `rp_right` VALUES (115, '分配用户角色', 110, 2, 'users');
INSERT INTO `rp_right` VALUES (116, '设置管理状态', 110, 2, 'users');
INSERT INTO `rp_right` VALUES (200, '权限管理', 0, 0, 'rights');
INSERT INTO `rp_right` VALUES (210, '权限列表', 200, 1, 'rights');
INSERT INTO `rp_right` VALUES (211, '查看权限', 210, 2, 'rights');
INSERT INTO `rp_right` VALUES (220, '角色列表', 200, 1, 'roles');
INSERT INTO `rp_right` VALUES (221, '添加角色', 220, 2, 'roles');
INSERT INTO `rp_right` VALUES (222, '删除角色', 220, 2, 'roles');
INSERT INTO `rp_right` VALUES (223, '角色授权', 220, 2, 'roles');
INSERT INTO `rp_right` VALUES (224, '取消角色授权', 220, 2, 'roles');
INSERT INTO `rp_right` VALUES (225, '获取角色列表', 220, 2, 'roles');
INSERT INTO `rp_right` VALUES (226, '获取角色权限', 220, 2, 'roles');
INSERT INTO `rp_right` VALUES (227, '更新角色信息', 220, 2, 'roles');
INSERT INTO `rp_right` VALUES (228, '更新角色权限', 220, 2, 'roles');
INSERT INTO `rp_right` VALUES (300, '日报管理', 0, 0, 'reports');
INSERT INTO `rp_right` VALUES (310, '日报列表', 300, 1, 'reports');
INSERT INTO `rp_right` VALUES (311, '添加日报', 310, 2, 'reports');
INSERT INTO `rp_right` VALUES (312, '删除日报', 310, 2, 'reports');
INSERT INTO `rp_right` VALUES (313, '修改日报', 310, 2, 'reports');
INSERT INTO `rp_right` VALUES (314, '更新日报状态', 310, 2, 'reports');
INSERT INTO `rp_right` VALUES (315, '更新日报内容', 310, 2, 'reports');
INSERT INTO `rp_right` VALUES (316, '获取日报详情', 310, 2, 'reports');
INSERT INTO `rp_right` VALUES (400, '项目管理', 0, 0, 'projects');
INSERT INTO `rp_right` VALUES (410, '项目列表', 400, 1, 'project');
INSERT INTO `rp_right` VALUES (411, '添加项目', 410, 2, 'projects');
INSERT INTO `rp_right` VALUES (412, '删除项目', 410, 2, 'projects');
INSERT INTO `rp_right` VALUES (413, '修改项目', 410, 2, 'projects');
INSERT INTO `rp_right` VALUES (414, '获取项目详情', 410, 2, 'projects');
INSERT INTO `rp_right` VALUES (500, '数据统计', 0, 0, 'statistics');
INSERT INTO `rp_right` VALUES (510, '数据报表', 500, 1, 'statistics');

-- ----------------------------
-- Table structure for rp_role
-- ----------------------------
DROP TABLE IF EXISTS `rp_role`;
CREATE TABLE `rp_role`  (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rp_role
-- ----------------------------
INSERT INTO `rp_role` VALUES (1, '超级管理员', '项目设计开发维护');
INSERT INTO `rp_role` VALUES (2, '教师', '培养祖国的花朵');
INSERT INTO `rp_role` VALUES (3, '学生', '祖国的花朵');
INSERT INTO `rp_role` VALUES (4, 'test', 'test');
INSERT INTO `rp_role` VALUES (5, 'test1', 'test2');

-- ----------------------------
-- Table structure for rp_role_right
-- ----------------------------
DROP TABLE IF EXISTS `rp_role_right`;
CREATE TABLE `rp_role_right`  (
  `role_id` int(11) NOT NULL,
  `right_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`, `right_id`) USING BTREE,
  INDEX `fk_sysrolepermission_permissionId`(`right_id`) USING BTREE,
  INDEX `roleId`(`role_id`) USING BTREE,
  CONSTRAINT `rp_role_id2` FOREIGN KEY (`role_id`) REFERENCES `rp_role` (`role_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `rp_right_id2` FOREIGN KEY (`right_id`) REFERENCES `rp_right` (`right_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rp_role_right
-- ----------------------------
INSERT INTO `rp_role_right` VALUES (1, 100);
INSERT INTO `rp_role_right` VALUES (2, 100);
INSERT INTO `rp_role_right` VALUES (3, 100);
INSERT INTO `rp_role_right` VALUES (1, 110);
INSERT INTO `rp_role_right` VALUES (3, 110);
INSERT INTO `rp_role_right` VALUES (1, 111);
INSERT INTO `rp_role_right` VALUES (1, 112);
INSERT INTO `rp_role_right` VALUES (1, 113);
INSERT INTO `rp_role_right` VALUES (1, 114);
INSERT INTO `rp_role_right` VALUES (1, 200);
INSERT INTO `rp_role_right` VALUES (2, 200);
INSERT INTO `rp_role_right` VALUES (2, 210);
INSERT INTO `rp_role_right` VALUES (1, 300);
INSERT INTO `rp_role_right` VALUES (1, 400);
INSERT INTO `rp_role_right` VALUES (1, 500);

-- ----------------------------
-- Table structure for rp_user
-- ----------------------------
DROP TABLE IF EXISTS `rp_user`;
CREATE TABLE `rp_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mobile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qq` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `active` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rp_user
-- ----------------------------
INSERT INTO `rp_user` VALUES (1, 'test', 'test', '123456', 21, '男', '15115726712', '1273817650', '2561035977', '2020-02-02 00:00:00', NULL, b'1');
INSERT INTO `rp_user` VALUES (2, '张浩', 'zhanghao', 'zh1314520', 12, '男', '15115726712', '2561035977', '2561035977', NULL, NULL, NULL);
INSERT INTO `rp_user` VALUES (3, '张三', '张三', 'XXXXXXXX', 12, '男', '13973451758', '12312412', '1241241241', NULL, NULL, NULL);
INSERT INTO `rp_user` VALUES (4, 'XXXXX', 'XXXXX', 'XXXXXXX', 12, '女', '12345678', '212471928', '1234124@qwq', NULL, NULL, NULL);
INSERT INTO `rp_user` VALUES (5, 'aaaaa', 'aaaaaa', 'aaaaaaa', 12, '男', '1111111', '11111111', '1111111111', NULL, NULL, NULL);
INSERT INTO `rp_user` VALUES (6, 'bbbbbbbb', 'bbbbbb', 'bbbbbbbbbb', 13, '男', '11111111', '11231231', '12341241231', NULL, NULL, NULL);
INSERT INTO `rp_user` VALUES (7, 'cccccc', 'ccccc', 'ccccccc', 14, '男', '1231231', '1231231', '123123124', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for rp_user_role
-- ----------------------------
DROP TABLE IF EXISTS `rp_user_role`;
CREATE TABLE `rp_user_role`  (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`, `role_id`) USING BTREE,
  INDEX `fk_roleId`(`role_id`) USING BTREE,
  CONSTRAINT `rp_role_id1` FOREIGN KEY (`role_id`) REFERENCES `rp_role` (`role_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `rp_user_id1` FOREIGN KEY (`user_id`) REFERENCES `rp_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rp_user_role
-- ----------------------------
INSERT INTO `rp_user_role` VALUES (1, 1);
INSERT INTO `rp_user_role` VALUES (2, 2);
INSERT INTO `rp_user_role` VALUES (3, 2);
INSERT INTO `rp_user_role` VALUES (4, 2);
INSERT INTO `rp_user_role` VALUES (5, 3);

SET FOREIGN_KEY_CHECKS = 1;
