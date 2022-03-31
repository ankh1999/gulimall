package com.atguigu.gulimall.gulimallmember.dao;

import com.atguigu.gulimall.gulimallmember.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author cyz
 * @email sunlightcs@gmail.com
 * @date 2022-03-31 22:15:05
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
