/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: User
 * Author:   25610
 * Date:     2020/2/19 16:41
 * Description: 用户 User 实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "rp_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;         // 用户id
    private String name;            // 真实姓名
    private String username;        // 用户名
    private String password;        // 用户密码
    private Integer age;            // 年龄
    private String sex;             // 性别
    private String mobile;          // 手机号
    private String qq;              // QQ号码
    private String email;           // 邮箱
    private Date createTime;        // 创建时间
    private Date updateTime;        // 修改时间
    private Boolean active;         //  1 激活状态 or 0 非激活

    // @ManyToMany(cascade = {
    //         CascadeType.PERSIST,
    //         CascadeType.MERGE
    // })
    // @JoinTable(name = "rp_user_role",
    //         joinColumns = @JoinColumn(name = "user_id"),
    //         inverseJoinColumns = @JoinColumn(name = "role_id")
    // )
    // public Set<Role> roles;
}
