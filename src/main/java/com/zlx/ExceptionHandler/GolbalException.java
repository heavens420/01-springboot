package com.zlx.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GolbalException implements HandlerExceptionResolver {


   /* //处理除数为零异常
    @ExceptionHandler(value={java.lang.ArithmeticException.class})//可以添加处理的异常类型
    public ModelAndView MyException1(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        modelAndView.setViewName("error1");
        return modelAndView;
    }

    //处理空指针异常
     @ExceptionHandler(value={java.lang.NullPointerException.class})//可以添加处理的异常类型
        public ModelAndView MyException2(Exception e){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("error",e.toString());
            modelAndView.setViewName("error2");
            return modelAndView;
        }

*/
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();

        if (ex instanceof ArithmeticException) {
            modelAndView.setViewName("error1");
        }
        if (ex instanceof NullPointerException) {
            modelAndView.setViewName("error2");
        }
        modelAndView.addObject("error",ex.toString());
        return modelAndView;
    }
}
