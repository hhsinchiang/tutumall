package com.tutu.tutumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tutu.common.utils.PageUtils;
import com.tutu.tutumall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-25 15:37:04
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

