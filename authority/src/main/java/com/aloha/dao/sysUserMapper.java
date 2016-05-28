package com.aloha.dao;

import com.aloha.entity.sysUser;

public interface sysUserMapper {
    int deleteByPrimaryKey(Integer sysUserId);

    int insert(sysUser record);

    int insertSelective(sysUser record);

    sysUser selectByPrimaryKey(Integer sysUserId);

    int updateByPrimaryKeySelective(sysUser record);

    int updateByPrimaryKey(sysUser record);
}