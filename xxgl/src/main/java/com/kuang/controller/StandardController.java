package com.kuang.controller;


import com.kuang.service.StandardServiceImpl;
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
public class StandardController {
    @Autowired
    private StandardServiceImpl standardService;
    @RequestMapping("/queryAll")
    public String queryAll(Model model){
        model.addAttribute("user", standardService.list(null));
        return "queryAll";
    }

}
