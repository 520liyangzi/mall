package com.lyz.mallware.dao;

import com.lyz.mallware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:20:57
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
