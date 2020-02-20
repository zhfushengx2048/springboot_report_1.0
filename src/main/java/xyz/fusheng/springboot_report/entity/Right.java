/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Right
 * Author:   25610
 * Date:     2020/2/19 17:02
 * Description: 权限实体类
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
@Table(name = "rp_right")
public class Right {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "right_id")
    private Integer id;             // 权限id
    private String name;       // 权限名
    @Column(columnDefinition="INT default 0")
    private int pid;           // 父级id
    @Column(columnDefinition="INT default 0")
    private int level;         // 权限等级
    private String path;

    @Transient
    private List<Right> children;

}
