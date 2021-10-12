package com.pctc.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/antAction")
public class AntAction {

    /*
        Ant 风格资源地址支持 3 种匹配符：
        ?：匹配文件名中的一个字符
        *：匹配文件名中的任意字符
        **：匹配多层路径
    */


    @RequestMapping(value = "/*/createStudent",method = RequestMethod.GET)
    public String checkAntPath1(){
        System.out.println("/abc/createStudent、/xyz/createStudent");
        return "success";
    }

    @RequestMapping(value = "/**/createStudent1", method = RequestMethod.GET)
    public String checkAntPath2(){
        System.out.println("xyz/abc/createStudent1、/abc/xyz/createStudent1");
        return "success";
    }


    @RequestMapping(value = "/createStudent2??",method = RequestMethod.GET)
    public String checkAntPath3(){
        System.out.println("/createStudent2ab、/createStudent2xy");
        return "success";
    }
}
