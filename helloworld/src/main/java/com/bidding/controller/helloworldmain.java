package com.bidding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloworldmain {

    private static final String TAG = "helloworldmain";

    //注入对象测试提交
    @Autowired
    private Environment env;


    @RequestMapping("/hello")
    @ResponseBody
    public  String helloWorld(){
        helloworldmain.class.getClass();
        //读取配置信息
        //ceshineirong
        String root = env.getProperty("com.cxytiandi.name");
        System.out.print(root);
        return root;
    }
}
