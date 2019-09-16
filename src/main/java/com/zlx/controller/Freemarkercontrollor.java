package com.zlx.controller;

import com.zlx.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Freemarkercontrollor {
    @RequestMapping("/freemarker")
    public String freemaker(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(23,"小王",32));
        list.add(new User(21,"小李",12));
        list.add(new User(26,"小郑",46));
        model.addAttribute("userlist",list);
        return "freemarker";
    }
}
