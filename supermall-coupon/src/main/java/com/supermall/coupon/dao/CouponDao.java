package com.supermall.coupon.dao;

import com.supermall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dengxin
 * @email dengxin0807@gmail.com
 * @date 2023-11-16 19:30:42
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
