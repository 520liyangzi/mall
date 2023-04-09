package com.lyz.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyz.common.utils.PageUtils;
import com.lyz.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:16:48
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

