package com.zlx.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*

 */
//@WebFilter(filterName = "MyFilter",urlPatterns = {"*.do","*.jsp"}) 拦截多个url
@WebFilter(filterName = "MyFilter",urlPatterns = "/helloservlet")  //拦截单个url
public class MyFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("进入filter");
        chain.doFilter(req, resp);
        System.out.println("离开filter");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
