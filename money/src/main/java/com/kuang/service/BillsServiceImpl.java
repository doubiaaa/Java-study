package com.kuang.service;

import com.kuang.entity.Bills;
import com.kuang.mapper.BillsMapper;
import com.kuang.service.BillsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author A102
 * @since 2021-12-29
 */
@Service
public class BillsServiceImpl extends ServiceImpl<BillsMapper, Bills> implements BillsService {

}
