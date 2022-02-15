package com.kuang.service;

import com.kuang.entity.Standard;
import com.kuang.mapper.StandardMapper;
import com.kuang.service.StandardService;
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
public class StandardServiceImpl extends ServiceImpl<StandardMapper, Standard> implements StandardService {

}
