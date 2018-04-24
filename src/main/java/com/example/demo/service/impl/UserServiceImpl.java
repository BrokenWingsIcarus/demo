package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.dao.UserJpaDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserJpaDao userJpaDao;


    @Override
    public User getUserName(Integer id) {

        return  userJpaDao.findById(id);
    }
}
