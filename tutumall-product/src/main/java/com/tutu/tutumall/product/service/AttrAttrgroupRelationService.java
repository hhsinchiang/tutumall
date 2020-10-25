package com.tutu.tutumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tutu.common.utils.PageUtils;
import com.tutu.tutumall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-25 15:37:05
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

