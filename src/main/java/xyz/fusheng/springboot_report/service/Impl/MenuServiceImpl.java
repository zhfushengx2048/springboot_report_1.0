/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: MenuServiceImpl
 * Author:   25610
 * Date:     2020/2/19 19:27
 * Description: 菜单资源业务逻辑接口实现类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_report.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.springboot_report.entity.Menu;
import xyz.fusheng.springboot_report.repository.MenuRepository;
import xyz.fusheng.springboot_report.service.MenuService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> buildMenuList() {
        List<Menu> menus = menuRepository.findAllByPid(0);
        List<Menu> all = menuRepository.findAll();

        for (Menu menu : menus) {
            List<Menu> child = getChild(menu.getId(), all);
            menu.setChildren(child);
        }
        return menus;
    }

    /**
     * 获取子节点
     * @param id 父节点id
     * @param allMenu allMenu 所有菜单列表
     * @return 每个根节点下，所有子菜单列表
     */
    public List<Menu> getChild(int id,List<Menu> allMenu){
        //子菜单
        List<Menu> childList = new ArrayList<Menu>();
        for (Menu nav : allMenu) {
            // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
            //相等说明：为该根节点的子节点。
            if(nav.getPid()==id){
                childList.add(nav);
            }
        }
        //递归
        for (Menu nav : childList) {
            nav.setChildren(getChild(nav.getId(), allMenu));
        }
        Collections.sort(childList,order());//排序
        //如果节点下没有子节点，返回一个空List（递归退出）
        if(childList.size() == 0){
            return new ArrayList<Menu>();
        }
        return childList;
    }


    /**
     * 根据菜单id属性排序
     * @return
     */
    public Comparator<Menu> order(){
        Comparator<Menu> comparator = new Comparator<Menu>() {
            @Override
            public int compare(Menu o1, Menu o2) {
                if(o1.getId() != o2.getId()){
                    return o1.getId() - o2.getId();
                }
                return 0;
            }
        };
        return comparator;
    }
}
