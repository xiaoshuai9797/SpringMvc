package com.pctc.action;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


//全局异常处理
@ControllerAdvice
public class ExceptionHandlerAdvice {


    private static Logger logger= Logger.getLogger(ExceptionHandlerAdvice.class.getName());

    //所有类的异常都处理，而CustHandleExceptiom类只处理自己的异常
    @ExceptionHandler({RuntimeException.class})
    public ModelAndView handleArithmeticException(Exception ex){
        System.out.println("出异常了全局全局异常: " + ex);
       // logger.debug("出异常了");
       // logger.info("");
        logger.warn("出异常了");
       // logger.error("");
      //  logger.fatal("");
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        return mv;
    }



}
