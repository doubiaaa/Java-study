package com.a102.springbootpsty.mapper;

import com.a102.springbootpsty.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author A102
 * @since 2021-12-28
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}
