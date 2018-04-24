package com.example.demo.service;

import com.example.demo.bean.User;

public interface UserService {
    /**
     * 根据id来获得用户
     * @param id
     * @return
     */
    public User getUserName(Integer id);
}
