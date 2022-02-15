package com.kuang.controller;


import com.kuang.mapper.UserMapper;

import com.kuang.pojo.Standard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author A102
 * @since 2021-12-28
 */
@Controller
public class StandardController {
    @Autowired(required = false)
    private UserMapper userMapper;

    @RequestMapping("/queryAll")
    public String queryAll(Model model) {
        model.addAttribute("user", userMapper.selectList(null));
        return "queryAll";
    }

    @RequestMapping("/toinsert")
    public String toinsert() {
        return "insert";
    }


}
