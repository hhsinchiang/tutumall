package com.tutu.tutumall.coupon.dao;

import com.tutu.tutumall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-27 14:40:23
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
