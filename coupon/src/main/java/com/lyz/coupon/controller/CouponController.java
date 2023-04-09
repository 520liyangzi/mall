package com.lyz.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.lyz.coupon.entity.CouponEntity;
import com.lyz.coupon.service.CouponService;
import com.lyz.common.utils.PageUtils;
import com.lyz.common.utils.R;



/**
 * 优惠券信息
 *
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:03:36
 */
@RestController
@RefreshScope
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;


    @GetMapping("/member/list")
    public R memberCoupons(){
        System.out.println("ll");
        CouponEntity coupon = new CouponEntity();
        coupon.setCouponName("aaa");
        return R.ok().put("coupons",Arrays.asList(coupon));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);
        System.out.println("123");

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
