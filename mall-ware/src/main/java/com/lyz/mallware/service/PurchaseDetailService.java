package com.lyz.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyz.common.utils.PageUtils;
import com.lyz.mallware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:20:57
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

