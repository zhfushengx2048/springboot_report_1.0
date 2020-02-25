/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RoleRight
 * Author:   25610
 * Date:     2020/2/20 10:37
 * Description: 角色权限
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "rp_role_right")
public class RoleRight {
    @Column(name = "role_id")
    private Integer roleId;
    @Column(name = "right_id")
    private Integer rightId;
}
