package com.tutu.tutumall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tutu.common.utils.PageUtils;
import com.tutu.tutumall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-27 14:40:23
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

