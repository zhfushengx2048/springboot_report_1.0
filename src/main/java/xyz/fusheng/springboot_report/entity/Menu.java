/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Menu
 * Author:   25610
 * Date:     2020/2/19 16:48
 * Description: 资源类 menu 负责规定前端数据,导航样式
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
@Table(name = "rp_menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // 资源id
    private String name;        // 资源名[菜单]
    private int pid;           // 父级id
    private String icon;        // 资源图标
    private int level;          // 资源等级
    private String path;        // 资源路径

    @Transient
    private List<Menu> children;

}
