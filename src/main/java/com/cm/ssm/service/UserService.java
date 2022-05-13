package com.cm.ssm.service;

import com.cm.ssm.dao.UserDao;
import com.cm.ssm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryUserById(Integer id){
        return userDao.queryUserById(id);
    }
}
