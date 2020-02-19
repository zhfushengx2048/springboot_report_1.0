/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: ReportHandler
 * Author:   25610
 * Date:     2020/2/19 23:26
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.springboot_report.entity.Report;
import xyz.fusheng.springboot_report.repository.ReportRepository;

@RestController
@RequestMapping("/report")
public class ReportHandler {

    @Autowired
    private ReportRepository reportRepository;

    // 初始化日报列表 接口:[http://localhost:8181/report/reports/{page}/{size}]
    @GetMapping("/reports/{page}/{size}")
    public Page<Report> reportList(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page, size);
        return reportRepository.findAll(request);
    }

    // 通过id查询日报信息 接口:[http://localhost:8181/report/reports]
    @GetMapping("/reports/findById/{id}")
    public Report findById(@PathVariable("id") Integer id){
        return reportRepository.findById(id).get();
    }

    // 添加日报操作 接口:[http://localhost:8181/report/reports/add]
    @PostMapping("/reports/add")
    public String save(@RequestBody Report report) {
        Report result = reportRepository.save(report);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    // 根据id删除日报操作 接口:[http://localhost:8181/report/reports/deleteById/{id}]
    @DeleteMapping("/reports/deleteById/{id}")
    public void deleteByID(@PathVariable("id") Integer id) {
        reportRepository.deleteById(id);
    }

    // 修改日报操作 接口:[http://localhost:8181/report/reports/edit]
    @PutMapping("/reports/edit")
    public String edit(@RequestBody Report report) {
        Report result = reportRepository.save(report);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

}
