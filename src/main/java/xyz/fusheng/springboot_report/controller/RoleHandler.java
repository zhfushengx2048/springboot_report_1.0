/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RoleHandler
 * Author:   25610
 * Date:     2020/2/19 22:03
 * Description: 角色管理控制器
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.springboot_report.entity.Role;
import xyz.fusheng.springboot_report.repository.RoleRepository;
import xyz.fusheng.springboot_report.service.RightService;
import xyz.fusheng.springboot_report.service.RoleService;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleHandler {

    @Autowired
    private RoleService roleService;

    @Autowired
    private RoleRepository roleRepository;

    // 初始化角色列表 接口:[http://localhost:8181/role/roles]
    @GetMapping("/roles")
    public List<Role> roleList(){
        return roleService.buildRoleList();
    }
    // 通过id查询角色信息 接口:[http://localhost:8181/role/roles/findById/{id}]
    @GetMapping("/roles/findById/{id}")
    public Role findById(@PathVariable("id") Integer id){
        return roleRepository.findById(id).get();
    }

    // 添加角色操作 接口:[http://localhost:8181/role/roles/add]
    @PostMapping("/roles/add")
    public String addRole(@RequestBody Role role){
        Role result = roleRepository.save(role);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    // 删除角色操作 接口:[http://localhost:8181/role/roles/deleteById/{id}]
    @DeleteMapping("/roles/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        roleRepository.deleteById(id);
    }

    // 修改角色操作 接口:[http://localhost:8181/role/roles/edit]
    @PutMapping("/roles/edit")
    public String edit(@RequestBody Role role) {
        Role result = roleRepository.save(role);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }


}
