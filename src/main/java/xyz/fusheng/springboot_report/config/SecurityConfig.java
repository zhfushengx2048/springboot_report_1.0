// /**
//  * Copyright (C), 2020-2020, code_fusheng
//  * FileName: SecurityConfig
//  * Author:   25610
//  * Date:     2020/2/20 10:54
//  * Description: Security安全配置类
//  * History:
//  * <author>        <time>      <version>       <desc>
//  * 作者姓名       修改时间       版本号         描述
//  */
// package xyz.fusheng.springboot_report.config;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
//
// import javax.sql.DataSource;
//
// @Configuration
// public class SecurityConfig {
//     @Autowired
//     DataSource dataSource;
//
//     // @Override
//     // protected void configure(HttpSecurity http) throws Exception{
//     //     http.authorizeRequests()
//     //             .antMatchers("http://localhost:8181/user/login/{username}/{password}").permitAll()
//     //             .anyRequest().authenticated();
//     // }
//
//     @Bean
//     public PasswordEncoder passwordEncoder(){
//         return new BCryptPasswordEncoder();
//     }
// }
