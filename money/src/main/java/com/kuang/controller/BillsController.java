package com.kuang.controller;


import com.kuang.entity.Bills;
import com.kuang.service.BillsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author A102
 * @since 2021-12-29
 */
@Controller
@RequestMapping("/bills")
public class BillsController {
    @Autowired
    private BillsServiceImpl billsService;

    @RequestMapping("/queryAll")
    public String queryAll(Model model) {
        model.addAttribute("user", billsService.list(null));
        return "queryAll";
    }


    @RequestMapping("toadd")
    public String toadd() {
        return "add";
    }

    @RequestMapping("/add")
    public String add(Bills bills) {
        if (billsService.save(bills)) {
            return "redirect:/bills/queryAll";
        } else {
            return "add";
        }
    }
@RequestMapping("toall")
    public String toall() {
        return "redirect:/bills/queryAll";
    }

}
