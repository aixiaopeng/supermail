package com.supermall.member.dao;

import com.supermall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dengxin
 * @email dengxin0807@gmail.com
 * @date 2023-11-16 19:32:30
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
