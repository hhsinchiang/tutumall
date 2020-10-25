package com.tutu.tutumall.order.dao;

import com.tutu.tutumall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-28 14:51:01
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
