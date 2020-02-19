/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RightService
 * Author:   25610
 * Date:     2020/2/19 21:55
 * Description: 权限业务逻辑接口类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.service;

import xyz.fusheng.springboot_report.entity.Right;

import java.util.List;

public interface RightService {
    List<Right> buildRightList();
}
