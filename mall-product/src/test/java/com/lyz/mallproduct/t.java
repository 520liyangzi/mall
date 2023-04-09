package com.lyz.mallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.lyz.product.MallProductApplication;
import com.lyz.product.entity.BrandEntity;
import com.lyz.product.service.BrandService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = MallProductApplication.class)
public class t {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("123");

        brandService.save(brandEntity);
        System.out.println("ok");
    }

    @Test
    void a() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("11111111");
        brandEntity.setBrandId(13L);

        brandService.updateById(brandEntity);
        System.out.println("ok");
    }

    @Test
    void b() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("11111111");
        brandEntity.setBrandId(13L);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",10L));
        System.out.println(list);
        list.forEach(System.out::println);

        System.out.println("ok");
    }
}
