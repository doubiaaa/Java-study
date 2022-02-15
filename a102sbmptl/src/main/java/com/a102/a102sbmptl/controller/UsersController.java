package com.a102.a102sbmptl.controller;


import com.a102.a102sbmptl.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author A102
 * @since 2021-12-28
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersServiceImpl usersService;

    //获取所有数据的请求
    @RequestMapping("/all")
    public String queryAll(Model m){
        //调用查询所有数据的业务
        m.addAttribute("users",usersService.list());
        return "query";
    }
}
