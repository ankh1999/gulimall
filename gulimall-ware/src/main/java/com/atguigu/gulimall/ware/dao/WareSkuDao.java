package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author cyz
 * @email sunlightcs@gmail.com
 * @date 2022-03-31 21:59:25
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
