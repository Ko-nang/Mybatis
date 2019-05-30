package com.magi.dao;

import com.magi.User;

import java.util.List;

/**
 * @author Ko-nang
 * @date 2019/5/30 11:41
 */
public interface IUserDao {
    List<User> findAll();
}
