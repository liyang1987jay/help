package com.aloha.service;

import java.util.List;

/**
 * Created by liyang on 2016-05-27.
 */
public interface SysUserService {
    List<Object> getSysUserList();

    int updateSysUser();

    int deleteSysUser(int id);
}
