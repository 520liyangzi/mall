package com.lyz.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyz.common.utils.PageUtils;
import com.lyz.common.utils.Query;

import com.lyz.product.dao.CategoryDao;
import com.lyz.product.entity.CategoryEntity;
import com.lyz.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity -> {
            return categoryEntity.getParentCid() == 0;
        })).map((menu)->{
            menu.setChildren(getChildrens(menu,entities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort() == null ?0:menu1.getSort()) - (menu2.getSort() == null ?0:menu2.getSort());
        }).collect(Collectors.toList());

        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> list) {
        list.forEach(System.out::println);
        baseMapper.deleteBatchIds(list);
    }


    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map((categoryEntity -> {
            // 找到紫菜蛋
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
        })).sorted((menu1,menu2)->{
            //排序
            return (menu1.getSort() == null ?0:menu1.getSort()) - (menu2.getSort() == null ?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}