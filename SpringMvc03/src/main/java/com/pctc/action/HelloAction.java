package com.pctc.action;


import com.pctc.model.Address;
import com.pctc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Map;

@Controller
@RequestMapping("/first")
public class HelloAction {



    @RequestMapping("/checkServlet")
    public void checkServlet(HttpServletRequest request,
                             HttpServletResponse response, Writer out) throws IOException {
        System.out.println("checkServlet, " + request + ", " + response);
        System.out.println(request.getParameter("id"));
        System.out.println(request.getParameter("username"));
        out.write("hello springmvc");
    }


    @RequestMapping("/checkServlet1")
    public String checkServlet1(HttpServletRequest request,
                                HttpServletResponse response, Writer out) throws IOException {
        System.out.println("checkServlet1, " + request + ", " + response);
        System.out.println(request.getParameter("id"));
        System.out.println(request.getParameter("username"));
        return "success";
    }



    @RequestMapping("/checkModelAndView")
    public ModelAndView checkModelAndView(){

        //构建模型数据同时使用视图名
        ModelAndView modelAndView = new ModelAndView("success1");

        //添加模型数据到 ModelAndView 中.
        modelAndView.addObject("username","pkd");

        Student student=new Student();
        student.setId(100);
        student.setUsername("xs");
        Address address=new Address();
        address.setProvince("江西");
        address.setCity("南昌");
        student.setAddress(address);

        modelAndView.addObject("stu",student);


        return modelAndView;
    }




    @RequestMapping("/checkMap")
    public String checkMap(Map<String, Object> map){
        System.out.println(map.getClass().getName());

        map.put("usernames", Arrays.asList("song", "lisi", "wanger"));

        Student student=new Student();
        student.setId(100);
        student.setUsername("xs");
        Address address=new Address();
        address.setProvince("江西");
        address.setCity("南昌");
        student.setAddress(address);
        map.put("stu", student);


        map.put("username","xs");

        return "success2";
    }


    @RequestMapping("/checkModel")
    public String checkModel(Model model){
        System.out.println(model.getClass().getName());

        model.addAttribute("usernames", Arrays.asList("song", "lisi", "wanger"));

        Student student=new Student();
        student.setId(100);
        student.setUsername("xs");
        Address address=new Address();
        address.setProvince("江西");
        address.setCity("南昌");
        student.setAddress(address);
        model.addAttribute("stu", student);

        model.addAttribute("username","xs");

        return "success2";
    }



    @RequestMapping("/checkModelMap")
    public String checkModelMap(ModelMap model){
        System.out.println(model.getClass().getName());

        model.addAttribute("usernames", Arrays.asList("song", "lisi", "wanger"));

        Student student=new Student();
        student.setId(100);
        student.setUsername("xs");
        Address address=new Address();
        address.setProvince("江西");
        address.setCity("南昌");
        student.setAddress(address);
        model.addAttribute("stu", student);


        model.addAttribute("username","xs");

        return "success2";
    }


//用得很少，几乎不用
    @RequestMapping(value ="/checkPojo",method= RequestMethod.POST)
    public String testPojo(Student student,Map map) {
        System.out.println("testPojo: " + student);
        System.out.println(map.get("student"));
        return "success";
    }



    @RequestMapping("/checkPojoModelAttribute")
    public String checkPojo(@ModelAttribute Student student, Map map) {
        System.out.println("checkPojo: " + student);
        System.out.println(map.get("student"));
        return "success3";
    }




    ////没有返回值
   /* @ModelAttribute
    public void getStudent(@RequestParam(value="id",required=false) Integer id,
                           Map<String, Object> map){
        System.out.println("@modelAttribute 修饰方法上没有返回值");
        if(id != null){
            //模拟从数据库中获取对象
            Student student = new Student();
            student.setId(100);
            student.setUsername("pkd1");
            Address address=new Address();
            address.setProvince("江西1");
            address.setCity("南昌1");
            student.setAddress(address);
            System.out.println("从数据库中获取一个对象: " + student);
            map.put("student", student);
        }
    }
*/

    @RequestMapping("/checkModelAtrributeMethod")
    public String checkModelAtrributeMethod() {
        return "success3";
    }
    //有返回值
    @ModelAttribute
    public Student getStudent1(@RequestParam(value="id",required=false) Integer id){
        System.out.println("@modelAttribute 修饰方法上有返回值");
        if(id != null){
            //模拟从数据库中获取对象
            Student student = new Student();
            student.setId(200);
            student.setUsername("xs");
            Address address=new Address();
            address.setProvince("江西");
            address.setCity("南昌");
            student.setAddress(address);
            System.out.println("从数据库中获取一个对象: " + student);
            return student;
        }
        return null;
    }





}
