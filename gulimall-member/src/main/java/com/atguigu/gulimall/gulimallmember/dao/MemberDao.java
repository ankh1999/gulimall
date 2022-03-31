package com.atguigu.gulimall.gulimallmember.dao;

import com.atguigu.gulimall.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cyz
 * @email sunlightcs@gmail.com
 * @date 2022-03-31 22:15:05
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
