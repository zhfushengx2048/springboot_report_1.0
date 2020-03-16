/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RoleServiceImpl
 * Author:   25610
 * Date:     2020/2/19 21:46
 * Description: 角色业务逻辑接口实现类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import xyz.fusheng.springboot_report.entity.Right;
import xyz.fusheng.springboot_report.entity.Role;
import xyz.fusheng.springboot_report.repository.RightRepository;
import xyz.fusheng.springboot_report.repository.RoleRepository;
import xyz.fusheng.springboot_report.service.RightService;
import xyz.fusheng.springboot_report.service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RightService rightService;

    @Autowired
    private RightRepository rightRepository;



    @Override
    public List<Role> buildRoleList() {
        List<Role> roles = roleRepository.findAll();
        List<Right> rights = rightService.buildRightList();
        for (Role role : roles) {
            role.setChildren(rights);
        }
        return roles;
    }
}
