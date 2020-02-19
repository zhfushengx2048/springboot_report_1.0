/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Report
 * Author:   25610
 * Date:     2020/2/19 16:57
 * Description: 日报实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "rp_report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;         // 日报id
    private String title;       // 日报标题
    private String user;        // 姓名
    private Date time;          // 日报时间
    private String contents;    // 工作内容
    private String trouble;     // 遇到的问题
    private String method;      // 解决的方法
    private String harvest;     // 今日心得
    private String plan;        // 明日计划
    private String group;       // 组名

}

