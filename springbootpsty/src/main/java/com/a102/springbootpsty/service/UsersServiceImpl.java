package com.a102.springbootpsty.service;

import com.a102.springbootpsty.entity.Users;
import com.a102.springbootpsty.mapper.UsersMapper;
import com.a102.springbootpsty.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author A102
 * @since 2021-12-28
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
