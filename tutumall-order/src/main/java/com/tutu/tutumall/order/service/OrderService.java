package com.tutu.tutumall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tutu.common.utils.PageUtils;
import com.tutu.tutumall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-28 14:51:01
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

