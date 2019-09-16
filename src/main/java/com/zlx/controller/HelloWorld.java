package com.zlx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
servlet 入门案例
 */


@Controller
public class HelloWorld {

   @RequestMapping("/hello")
   @ResponseBody
   public String hello(){
       return "hello world";
   }
}
