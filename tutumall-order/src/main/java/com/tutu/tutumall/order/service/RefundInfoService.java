package com.tutu.tutumall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tutu.common.utils.PageUtils;
import com.tutu.tutumall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-28 14:51:01
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

