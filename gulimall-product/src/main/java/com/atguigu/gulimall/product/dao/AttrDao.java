package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author cyz
 * @email sunlightcs@gmail.com
 * @date 2022-03-31 19:50:36
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
