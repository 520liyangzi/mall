package com.lyz.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyz.common.utils.PageUtils;
import com.lyz.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:16:48
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

