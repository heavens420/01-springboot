package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
启动类可以和被运行类在同一个包下
启动类 不能 和被运行类 在平行包下 或在其子包下
 */
@SpringBootApplication
@ServletComponentScan  //扫描 @WebServlet注解 和 @Filter注解  和Listener 注解  实例化servlet 和 filter 和 Listener
@MapperScan("com.zlx.mapper")  //扫描mybatis的 mapper接口
@EnableScheduling    //定时任务支持
@Cacheable           //开启缓存支持
public class MainTest {
    public static void main(String[] args) {
        SpringApplication.run(MainTest.class,args);
    }
}
