package com.lyz.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyz.order.entity.MqMessageEntity;
import com.lyz.order.service.MqMessageService;
import com.lyz.common.utils.PageUtils;
import com.lyz.common.utils.R;



/**
 * 
 *
 * @author Yangzi
 * @email liyangzi1314@163.com
 * @date 2023-04-08 05:16:48
 */
@RestController
@RequestMapping("order/mqmessage")
public class MqMessageController {
    @Autowired
    private MqMessageService mqMessageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        System.out.println("123");
        PageUtils page = mqMessageService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{messageId}")
    public R info(@PathVariable("messageId") String messageId){
		MqMessageEntity mqMessage = mqMessageService.getById(messageId);

        return R.ok().put("mqMessage", mqMessage);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MqMessageEntity mqMessage){
		mqMessageService.save(mqMessage);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MqMessageEntity mqMessage){
		mqMessageService.updateById(mqMessage);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] messageIds){
		mqMessageService.removeByIds(Arrays.asList(messageIds));

        return R.ok();
    }

}
