package com.zlx.junitTest;

import com.MainTest;
import com.zlx.service.UserService;
import org.assertj.core.internal.Classes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.annotation.security.RunAs;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MainTest.class})
public class springbootTest {

    @Resource
    private UserService service;

    @Test
    public void Test01(){
        System.out.println("Junit测试");
        System.out.println(service.queryall());
        System.out.println(service.sById(1));
    }
}
