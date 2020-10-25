package com.tutu.tutumall.order.dao;

import com.tutu.tutumall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-28 14:51:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
