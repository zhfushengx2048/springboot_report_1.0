/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RightHandler
 * Author:   25610
 * Date:     2020/2/19 22:29
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fusheng.springboot_report.entity.Right;
import xyz.fusheng.springboot_report.repository.RightRepository;
import xyz.fusheng.springboot_report.service.RightService;

import java.util.List;

@RestController
@RequestMapping("/right")
public class RightHandler {

    @Autowired
    private RightRepository rightRepository;

    // 初始化权限列表 接口:[http://localhost:8181/right/rights]
    @GetMapping("/rights")
    public List<Right> rightList(){
        return rightRepository.findAll();
    }

}
