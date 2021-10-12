package com.pctc.action;


import com.pctc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("first")
public class FirstAction {

    @RequestMapping(value = "checkMethod",method = RequestMethod.GET)
    public String checkMethod(){
        System.out.println("get Method");
        return "success";
    }

    @RequestMapping(value = "/checkParams",params = {"username","height=176"})
    /*jsp传入的height必须和此处的height一样才可行，否则报错400*/
    public String checkParam(){
        System.out.println("checkParams");
        return "success";
    }

    @RequestMapping(value = "/checkRequestParam")
    public String testRequestParam(@RequestParam(value = "username")String user,
                                   @RequestParam(value = "age",required = false,defaultValue = "10")int age){
        /*username一定要传入数据，不然会报400错误，而年龄可传可不传，因为设置了required为false，默认为true
        年龄默认值为10，如果不传则显示年龄为10*/
        System.out.println("checRequestParam,username:"+user+",age:"+age);
        return "success";
    }

    @RequestMapping(value = "/checkRequestParam1")
    public String testRequestParam1(@RequestParam(value = "username")String user,
                                    @RequestParam(value = "age",required = false,defaultValue = "10")int age,double salary){
        /*username一定要传入数据，不然会报400错误，而年龄可传可不传，因为设置了required为false，默认为true
        年龄默认值为10，如果不传则显示年龄为10
        此处因为多加了salary，不传入salary报500错误*/
        System.out.println("checRequestParam1,username:"+user+",age:"+age+",salary:"+salary);
        return "success";
    }

    /*用表单的方式进入POST方法*/
    @RequestMapping(value = "checkPojo",method = RequestMethod.POST)
    public String testPojoPost(Student student){
        System.out.println("Post:"+student);
        return "success";
    }


    /*超链接的方式进入get方法，即使传部分数据同样可以，其他显示null*/
    @RequestMapping(value = "checkPojo",method = RequestMethod.GET)
    public String testPojoGet(Student student){
        System.out.println("Get:"+student);
        return "success";
    }
}
