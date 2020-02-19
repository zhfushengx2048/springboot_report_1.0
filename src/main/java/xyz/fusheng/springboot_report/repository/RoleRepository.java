/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RoleRepository
 * Author:   25610
 * Date:     2020/2/19 17:13
 * Description: 角色仓库类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.fusheng.springboot_report.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
