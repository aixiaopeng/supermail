package com.supermall.product.dao;

import com.supermall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dengxin
 * @email dengxin0807@gmail.com
 * @date 2023-11-16 18:25:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
