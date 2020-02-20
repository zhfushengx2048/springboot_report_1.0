/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserHandler
 * Author:   25610
 * Date:     2020/2/19 20:01
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.controller;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.springboot_report.entity.User;
import xyz.fusheng.springboot_report.repository.UserRepository;
import xyz.fusheng.springboot_report.service.UserService;

import javax.xml.transform.Result;
import java.security.MessageDigest;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    // 初始化用户列表操作 接口:[http://localhost:8181/user/users/{page}/{size}]
    @GetMapping("/users/{page}/{size}")
    public Page<User> userList(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageRequest request1 = PageRequest.of(page, size);
        return userRepository.findAll(request1);
    }
    // 查询用户信息通过Id 接口:[http://localhost:8181/user/users/findById/{id}]
    @GetMapping("/users/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }

    // 查询用户信息通过key字段 接口:[http://localhost:8181/user/users/query/{key}]
    @GetMapping("/users/query/{key}")
    public List queryUser(@PathVariable("key") String key){
        List<User> list =  userRepository.findAllByKey(key);
        return list;
    }

    // 添加用户列表操作 接口:[http://localhost:8181/user/users/add]
    @PostMapping("users/add")
    public String addUser(@RequestBody User user){
        // String password = user.getPassword();
        // BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        // String newPassword = encoder.encode(password);
        // user.setPassword(newPassword);
        User result = userRepository.save(user);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    // 删除用户列表操作 接口:[http://localhost:8181/user/users/deleteById/{id}]
    @DeleteMapping("users/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }

    // 修改用户列表操作 接口:[http://localhost:8181/user/users/edit]
    @PutMapping("users/edit")
    public String edit(@RequestBody User user) {
        User result = userRepository.save(user);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    // 修改用户状态操作 接口:[http://localhost:8181/user/users/editActive]
    @PutMapping("/users/update")
    public String editActive(@RequestBody User user) {
        User result = userRepository.save(user);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }


}
