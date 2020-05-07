package com.rooper.blog.service;

import com.rooper.blog.dao.UserRepository;
import com.rooper.blog.po.User;
import com.rooper.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lipeng
 * @version 1.0
 * @date 2020/5/4 17:29
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User checkUser(String username, String password) {

        //System.out.println( MD5Utils.code(password));
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
