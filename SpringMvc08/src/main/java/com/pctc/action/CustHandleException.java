package com.pctc.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/custHandleException")
public class CustHandleException {

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


    //这里只处理ArithmeticException异常
    //@ExceptionHandler 局部异常处理，只能是当前的处理器
 /*   @ExceptionHandler({ArithmeticException.class })
    public ModelAndView executeArithmeticException(Exception ex) {
        System.out.println("出异常了00000: " + ex);
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        return mv;
    }*/



    //这里只处理NullPointerException异常
    //@ExceptionHandler 局部异常处理，只能是当前的处理器
    /*@ExceptionHandler({NullPointerException.class })
    public ModelAndView executeNullException(Exception ex) {
        System.out.println("出异常了11111: " + ex);
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        return mv;
    }*/


    //这里只处理RuntimeException异常，与它的子类异常
    //@ExceptionHandler 局部异常处理，只能是当前的处理器
    //只会目前该类所在的异常，而其他类的异常不处理
   @ExceptionHandler({RuntimeException.class})
    public ModelAndView executeException(Exception ex) {
        System.out.println("出异常了22222: " + ex);
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        return mv;
    }


}
