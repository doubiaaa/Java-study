package com.kuang.store.mapper;


import com.kuang.store.entity.User;


public interface UserMapper {

    /**
     * 插入用户数据
     *
     * @param user
     * @return
     */
    Integer insert(User user);

    /**
     * @param username 插入姓名
     * @return
     */
    User findUsername(String username);
}
