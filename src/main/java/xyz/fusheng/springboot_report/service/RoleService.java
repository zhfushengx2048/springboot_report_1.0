/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RoleService
 * Author:   25610
 * Date:     2020/2/19 21:45
 * Description: 角色业务逻辑接口
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.service;

import xyz.fusheng.springboot_report.entity.Right;
import xyz.fusheng.springboot_report.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> buildRoleList();
}
