package com.lyz.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyz.common.utils.PageUtils;
import com.lyz.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 03:55:08
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

