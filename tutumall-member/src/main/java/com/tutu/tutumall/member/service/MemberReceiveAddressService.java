package com.tutu.tutumall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tutu.common.utils.PageUtils;
import com.tutu.tutumall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author jhx
 * @email 1352427752@qq.com
 * @date 2020-09-28 14:43:06
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

