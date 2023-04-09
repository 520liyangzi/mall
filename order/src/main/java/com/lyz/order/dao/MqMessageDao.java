package com.lyz.order.dao;

import com.lyz.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:16:48
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
