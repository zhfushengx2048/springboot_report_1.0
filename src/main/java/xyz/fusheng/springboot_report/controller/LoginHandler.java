/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: LoginHandler
 * Author:   25610
 * Date:     2020/2/19 17:41
 * Description: 用户登录控制器
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fusheng.springboot_report.entity.User;
import xyz.fusheng.springboot_report.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class LoginHandler{

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login/{username}/{password}")
    public Boolean login(@PathVariable("username") String username, @PathVariable("password") String password){
        Iterable<User> users = userRepository.findAll();
        for(User u : users){
            if (u.getUsername().equals(username)&&u.getPassword().equals(password)){
                System.out.println("输出用户操作日志:"+username+"登录成功");
                return true;
            }
        }
        return false;
    }

}
