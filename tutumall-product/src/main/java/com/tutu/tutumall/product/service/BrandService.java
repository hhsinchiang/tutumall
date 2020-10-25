package com.tutu.tutumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tutu.common.utils.PageUtils;
import com.tutu.tutumall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-25 15:37:05
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

