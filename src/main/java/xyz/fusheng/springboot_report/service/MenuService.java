/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: MenuService
 * Author:   25610
 * Date:     2020/2/19 19:27
 * Description: 资源业务逻辑接口
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.service;

import xyz.fusheng.springboot_report.entity.Menu;

import java.util.List;

public interface MenuService {
    // 初始化菜单列表
    List<Menu> buildMenuList();
}
