package com.lyz.mallware.dao;

import com.lyz.mallware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:20:57
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
