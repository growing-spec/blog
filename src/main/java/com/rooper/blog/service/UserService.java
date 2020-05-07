package com.rooper.blog.service;

import com.rooper.blog.po.User;

/**
 * @author lipeng
 * @version 1.0
 * @date 2020/5/4 17:26
 */
public interface UserService {
    public User checkUser(String username,String password);
}
