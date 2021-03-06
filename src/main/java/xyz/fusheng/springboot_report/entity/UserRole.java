/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserRole
 * Author:   25610
 * Date:     2020/2/20 10:32
 * Description: 用户角色关联表
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "rp_user_role")
public class UserRole {
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "role_id")
    private Integer roleId;
}
