/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Product
 * Author:   25610
 * Date:     2020/2/19 16:54
 * Description: 项目实体类 Product
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rp_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // 项目id
    private String name;     // 项目名
}
