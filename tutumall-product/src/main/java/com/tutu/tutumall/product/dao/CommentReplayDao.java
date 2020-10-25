package com.tutu.tutumall.product.dao;

import com.tutu.tutumall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-25 13:46:41
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
