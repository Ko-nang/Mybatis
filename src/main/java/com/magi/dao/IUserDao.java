package com.magi.dao;

import com.magi.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Ko-nang
 * @date 2019/5/30 11:41
 */
public interface IUserDao {
    /**
     * 返回通过sql语句查询的user结果
     * @return 返回查询的所有结果集list
     */
    @Select("select * from user")
    List<User> findAll();
}
