/**
 * Copyright (C), 2020-2020, Code_fusheng
 * FileName: ServletInitializer
 * Author:   fusheng
 * Date:     2020/3/8 23:16
 * Description:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间          1.0           描述
 */
package xyz.fusheng.springboot_report;


import javafx.application.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootReportApplication.class);
    }
}