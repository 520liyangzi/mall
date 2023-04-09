package com.lyz.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyz.common.utils.PageUtils;
import com.lyz.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:11:13
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

