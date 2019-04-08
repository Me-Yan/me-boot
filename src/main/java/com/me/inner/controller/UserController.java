package com.me.inner.controller;

import com.me.inner.entity.UserEntity;
import com.me.inner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Me on 2019/4/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String add(@ModelAttribute("userForm")UserEntity userForm) {
        return "add";
    }

    @RequestMapping("/insert")
    public String insert(@ModelAttribute("userForm")UserEntity userForm) {
        userService.insertUser(userForm);

        return "redirect:success";
    }

    @RequestMapping("/list")
    public String list(Model model) {

        List<UserEntity> userList = userService.listUser();
        model.addAttribute("userList", userList);

        return "list";
    }

    @RequestMapping("success")
    public String success() {
        return "success";
    }
}
