/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Role
 * Author:   25610
 * Date:     2020/2/19 17:07
 * Description: 角色实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "rp_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;            // 角色id
    private String name;           // 角色名
    private String description;    // 角色描述
    private String rid;            // 权限id

    @Transient
    private List<Right> children;

}
