package com.zlx.scheduledTest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

//定时任务

@Component
public class scheduledDemo {

    @Scheduled(cron = "20/3 * * * * ?") //秒 分 时 日 月 周  * 代表 每（天，秒，日。。。）
    public void test(){
        System.out.println("Scheduled 执行了  "+ new Date());
    }
}
