package com.elastic.cn.indexmanager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.elastic.cn.indexmanager.Dao.IUserDao;
import com.elastic.cn.indexmanager.domain.User;
import com.elastic.cn.indexmanager.service.IUserService;

/**
 * Created by shushuwang on 2016-1-14
 */
@Component
public class UserService implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    
    public User selectByPrimaryKey(int userId) {  
        return this.userDao.selectByPrimaryKey(userId);
    }  
  
}
