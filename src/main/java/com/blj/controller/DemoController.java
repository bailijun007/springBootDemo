package com.blj.controller;

import com.blj.config.JdbcProperties;
import com.blj.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.Date;

@RestController
public class DemoController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/getDemo",produces = "application/json")
    public Demo getDemo(){
        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("张三");
        demo.setRemarks("这是备注信息");
        demo.setCreatTime(new Date());
        return demo;
    }


    @RequestMapping("/hello")
    public  String hello(){
        return "hello springboot!";
    }

}
