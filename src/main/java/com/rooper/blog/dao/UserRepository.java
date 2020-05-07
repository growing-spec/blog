package com.rooper.blog.dao;

import com.rooper.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lipeng
 * @version 1.0
 * @date 2020/5/4 17:31
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);
}
