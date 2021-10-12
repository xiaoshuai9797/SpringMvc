package com.pctc.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/intercept")
public class YourAction {



    @RequestMapping("/one")
    public String helloOne(){
        System.out.println("helloOne方法调用 InterceptAction");
        return "success";
    }


    @RequestMapping("/two")
    public String helloTwo(){
        System.out.println("helloTwo方法调用 InterceptAction");
        return "success";
    }
}
