package com.tutu.tutumall.coupon.dao;

import com.tutu.tutumall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-27 14:40:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
