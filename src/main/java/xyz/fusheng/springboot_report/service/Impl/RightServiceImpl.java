/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RightServiceImpl
 * Author:   25610
 * Date:     2020/2/19 21:56
 * Description: 权限业务逻辑接口实现类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.springboot_report.entity.Right;
import xyz.fusheng.springboot_report.repository.RightRepository;
import xyz.fusheng.springboot_report.service.RightService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class RightServiceImpl implements RightService {

    @Autowired
    private RightRepository rightRepository;

    @Override
    public List<Right> buildRightList() {
        List<Right> rights = rightRepository.findAllByPid(0);
        List<Right> all = rightRepository.findAll();

        for (Right right : rights) {
            List<Right> child = getChild(right.getId(), all);
            right.setChildren(child);
        }
        return rights;
    }

    /**
     * 获取子节点
     * @param id 父节点id
     * @param allRight allRight 所有菜单列表
     * @return 每个根节点下，所有子菜单列表
     */
    public List<Right> getChild(int id,List<Right> allRight){
        //子菜单
        List<Right> childList = new ArrayList<Right>();
        for (Right nav : allRight) {
            // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
            //相等说明：为该根节点的子节点。
            if(nav.getPid()==id){
                childList.add(nav);
            }
        }
        //递归
        for (Right nav : childList) {
            nav.setChildren(getChild(nav.getId(), allRight));
        }
        Collections.sort(childList,order());//排序
        //如果节点下没有子节点，返回一个空List（递归退出）
        if(childList.size() == 0){
            return new ArrayList<Right>();
        }
        return childList;
    }


    /**
     * 根据菜单id属性排序
     * @return
     */
    public Comparator<Right> order(){
        Comparator<Right> comparator = new Comparator<Right>() {
            @Override
            public int compare(Right o1, Right o2) {
                if(o1.getId() != o2.getId()){
                    return o1.getId() - o2.getId();
                }
                return 0;
            }
        };
        return comparator;
    }
}
