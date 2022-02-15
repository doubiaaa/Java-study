package com.a102.a102sbmptl.service;

import com.a102.a102sbmptl.entity.Dept;
import com.a102.a102sbmptl.mapper.UsersMapper;
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
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Dept> implements UsersService {

}
