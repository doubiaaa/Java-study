package com.a102.springbootpsty.controller;


import com.a102.springbootpsty.entity.Users;
import com.a102.springbootpsty.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

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
      @RequestMapping("/list")
      public String selectlist(Model model){
          List<Users> list = usersService.list();
          model.addAttribute("users",list);
          return "list";
      }
      @RequestMapping("/del/{id}")
      public String del(@PathVariable int id){
          usersService.removeById(id);
          return "redirect:/users/list";
      }
      @RequestMapping("/toadd")
      public String toadd(){
          return "add";
      }
      @RequestMapping("/add")
      public String add(Users users){
          if (usersService.save(users)){
              return "redirect:/users/list";
          }else {
              return "add";
          }
      }
      @RequestMapping("/toupdata/{id}")
      public String toupdata(@PathVariable int id,Model model){
          model.addAttribute("u",usersService.getById(id));
          return "updata";
      }
      @RequestMapping("/updata")
    public String updata(Users users){
          if (usersService.updateById(users)) {
              return "redirect:/users/list";
          }else {
              return "updata";
          }
      }
}
