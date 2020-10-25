package com.tutu.tutumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tutu.common.utils.PageUtils;
import com.tutu.tutumall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-25 15:37:04
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

