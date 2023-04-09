package com.lyz.coupon.dao;

import com.lyz.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:03:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
