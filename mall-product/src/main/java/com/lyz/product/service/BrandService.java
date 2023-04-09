package com.lyz.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyz.common.utils.PageUtils;
import com.lyz.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 03:55:08
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

