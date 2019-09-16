package com.zlx.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.zlx.bean.User;
import com.zlx.service.UserService;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class AddUserController {

    @Resource
    private UserService service;

    @RequestMapping("input")
    public String input(User user,Model model){ //用于数据校验时 需要用到user对象 故传user
        model.addAttribute("user",user);
        System.out.println("input 中的 ："+user);
        return "input";
    }

    @RequestMapping("addUser")
    public String addUser(@Valid User user, BindingResult result){
        if (result.hasErrors()){
            return "redirect:input";
        }
        service.insertuser(user);

        System.out.println("addUser中的 ："+user);
        return "redirect:query";
    }

    @RequestMapping("query")
    public String query(Model model){
        List<User> list = service.queryall();
        model.addAttribute("list",list);

//        System.out.println(list);
        return "list";
    }

    @RequestMapping("searchById")
    public String searchById(Model model,int id){
        User list = service.sById(id);
        model.addAttribute("user",list);
        //return "list";   //遍历回显 只有一个数据  遍历不遍历都能显示结果
        return "update"; //按  id 查询 用于修改时回显 并能修改回显的值
//        return "oneuser"; //显示  按  id 查询的值  但不能修改
    }

    @RequestMapping("/deleteById")
    public String DbyId(int id){
        service.delete(id);
//        return "forward:query";
        return "redirect:query";
    }

    @RequestMapping("updateuser")
    public String updateUser(User user ){
        service.updateUser(user);
        return "redirect:query";
    }

    @RequestMapping("/myerror")
    public String ErrorDemo(){//自定义异常  BasicExecptionAdapter会默认处理异常 出现异常 所有异常 会自动跳转到 template/error.html
        int i = 9/0;
        return "input";
    }

    @RequestMapping("myerror1")
    public String ErrorDemo1(){
        String s = null;
        s.length();
        return "input";
    }

}
