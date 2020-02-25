/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: MenuHandler
 * Author:   25610
 * Date:     2020/2/19 19:32
 * Description: 资源控制类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fusheng.springboot_report.entity.Menu;
import xyz.fusheng.springboot_report.repository.MenuRepository;
import xyz.fusheng.springboot_report.service.MenuService;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuService menuService;

    @GetMapping("/menus")
    public List<Menu> menuList(){
        return menuService.buildMenuList();
    }

}
