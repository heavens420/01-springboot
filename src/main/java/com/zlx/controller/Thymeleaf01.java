package com.zlx.controller;

import com.zlx.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class Thymeleaf01 {

    @RequestMapping("/thy01")
    public String thymeleafdemo1(Model model){
        model.addAttribute("msg","这是一个入门测试qqqqUUUUUUUUUKklllllllll");
        model.addAttribute("date",new Date());

        model.addAttribute("sex", "男");
        //model.addAttribute("sex", "女");

        model.addAttribute("id",2);
        return "thymeleaf01";
    }

    @RequestMapping("/thy02")
    public String thymeleafdemo2(Model model){
        List<User> list = new ArrayList<>();
        Map<String,User> map = new HashMap<>();

        list.add(new User(10,"金三胖",30));
        list.add(new User(30,"金二",40));
        list.add(new User(50,"金正恩",60));
        list.add(new User(70,"金日成",50));
        map.put("u1",new User(01,"小习",66));
        map.put("u2",new User(02,"令计划",64));
        map.put("u3",new User(03,"王岐山",62));
        model.addAttribute("userlist", list);
        model.addAttribute("map",map);
        return "thymeleaf02";
    }


    @RequestMapping("thy03")
    public String filed(HttpServletRequest request, Model model){
        request.setAttribute("request","HttpRequestServlet");
        request.getSession().setAttribute("session","HttpSession");
        request.getSession().getServletContext().setAttribute("application","Application");
        return "tyhmeleaf03";
    }

    @RequestMapping("thy04/{s}/{name}/{i}") //访问方式 thy04/*/*
    public String UrlTest(@PathVariable String s, @PathVariable  String name,@PathVariable Integer i ){
        System.out.println(s+"  "+name+" "+i);
        //return s; //s = thymeleaf04 下浏览器输入 thymeleaf04访问
        return "thymeleaf04";
    }
}
