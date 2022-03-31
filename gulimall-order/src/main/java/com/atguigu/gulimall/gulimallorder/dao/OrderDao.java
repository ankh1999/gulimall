package com.atguigu.gulimall.gulimallorder.dao;

import com.atguigu.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author cyz
 * @email sunlightcs@gmail.com
 * @date 2022-03-31 21:56:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
