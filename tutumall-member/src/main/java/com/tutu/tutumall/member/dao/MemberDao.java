package com.tutu.tutumall.member.dao;

import com.tutu.tutumall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-28 14:43:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
