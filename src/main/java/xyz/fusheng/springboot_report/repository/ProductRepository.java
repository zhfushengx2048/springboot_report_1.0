/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: ProductRepository
 * Author:   25610
 * Date:     2020/2/19 17:15
 * Description: 项目仓库类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.fusheng.springboot_report.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
