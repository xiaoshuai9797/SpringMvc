package com.pctc.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/otherHandleException")
public class OtherHandleException {

    @RequestMapping("/checkException1")
    public String checkException1(@RequestParam("divnum") int divnum) {
        System.out.println("商是: " + (100 / divnum));
        return "success";
    }


    @RequestMapping("/checkException2")
    public String checkException2() {
        String aString=null;
        aString.length();
        return "success";
    }


}
