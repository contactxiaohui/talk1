package com.elastic.cn.indexmanager.service;

import com.elastic.cn.indexmanager.domain.User;

/**
 * Created by shushuwang on 2016-1-14
 */
public interface IUserService {  
    public User selectByPrimaryKey(int userId);  
}
