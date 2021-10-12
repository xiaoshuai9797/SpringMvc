package com.pctc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMvc {

    @RequestMapping("first")
    public String firstHandle(){
        System.out.println("hello first");
        return "first";
    }


    @RequestMapping("/second")//斜杠可要可不要
    public String secondHandle(){
        System.out.println("hello second");
        return "second";
    }


    @RequestMapping("/third")
    public String thirdHandle(){
        System.out.println("hello third");
        return "third";
    }
}
