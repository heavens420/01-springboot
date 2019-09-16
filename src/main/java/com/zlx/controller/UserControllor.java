package com.zlx.controller;

import com.zlx.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserControllor {

    @RequestMapping("/user")
    public String show(Model model){
        List<User> list = new ArrayList<User>();
        list.add(new User(001,"张胜男",20));
        list.add(new User(002,"王二小",25));
        list.add(new User(003,"毛泽东",24));
        list.add(new User(004,"邓小平",23));
        model.addAttribute("userlist",list);
        System.out.println("nnnnnnnnnnn");
        return "/mylist";
    }
}
