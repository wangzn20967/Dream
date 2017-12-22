package com.wangzn.top.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.wangzn.top.dao.UserMapper;
import com.wangzn.top.model.User;
import com.wangzn.top.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public String list(Integer a){
        User user = userMapper.selectByPrimaryKey(a);
        return JSON.toJSONString(user);  
        
    }
}
