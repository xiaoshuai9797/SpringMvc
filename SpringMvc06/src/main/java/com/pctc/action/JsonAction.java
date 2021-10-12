package com.pctc.action;

import com.pctc.model.Address;
import com.pctc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/jsonAction")
public class JsonAction {

    @ResponseBody
    @RequestMapping(value = "/checkJsonObject")
    public Student testJsonObject(){
        Student student = new Student();
        student.setId(1);
        student.setUsername("xs");
        student.setEmail("1458204190@qq.com");
        student.setAge(22);
        student.setPassword("123456");
        Address address = new Address();
        address.setProvince("江西");
        address.setCity("南昌");
        student.setAddress(address);
        return student;
    }


    @RequestMapping(value = "/checkJsonListObject")
    @ResponseBody
    public List<Student> testJsonListObject(){
     List<Student>list = new ArrayList<>();
        Student student = new Student();
        student.setId(1);
        student.setUsername("xs");
        student.setEmail("1458204190@qq.com");
        student.setAge(22);
        student.setPassword("123456");
        Address address = new Address();
        address.setProvince("江西");
        address.setCity("南昌");
        student.setAddress(address);
        list.add(student);


        Student student1 = new Student();
        student1.setId(2);
        student1.setUsername("xt");
        student1.setEmail("1458204190@qq.com");
        student1.setAge(21);
        student1.setPassword("123456");
        Address address1 = new Address();
        address1.setProvince("江西");
        address1.setCity("南昌");
        student1.setAddress(address1);
        list.add(student1);


        Student student2 = new Student();
        student2.setId(3);
        student2.setUsername("wy");
        student2.setEmail("1458204190@qq.com");
        student2.setAge(20);
        student2.setPassword("123456");
        Address address2 = new Address();
        address2.setProvince("江西");
        address2.setCity("南昌");
        student2.setAddress(address2);
        list.add(student2);

        return list;
    }


    @ResponseBody
    @RequestMapping(value = "/testJsonObjectParam")
    public Student testJsonObjectParam(Student student){

        student.setId(1);
        student.setEmail("1458204190@qq.com");
        student.setAge(22);
      //和第一个方法比不传用户名和密码，由前端传
        Address address = new Address();
        address.setProvince("江西");
        address.setCity("南昌");
        student.setAddress(address);
        return student;
    }

    @ResponseBody
    @RequestMapping(value ="/checkJsonListObjectParam")
   public List<Student> testJsonListObjectParam(Student stu){

        List<Student>list = new ArrayList<>();
        Student student = new Student();
        student.setId(1);
        student.setUsername(stu.getUsername());
        student.setEmail("1458204190@qq.com");
        student.setAge(22);
        student.setPassword(stu.getPassword());
        Address address = new Address();
        address.setProvince("江西");
        address.setCity("南昌");
        student.setAddress(address);
        list.add(student);


        Student student1 = new Student();
        student1.setId(2);
        student1.setUsername("xt");
        student1.setEmail("1458204190@qq.com");
        student1.setAge(21);
        student1.setPassword("123456");
        Address address1 = new Address();
        address1.setProvince("江西");
        address1.setCity("南昌");
        student1.setAddress(address1);
        list.add(student1);


        Student student2 = new Student();
        student2.setId(3);
        student2.setUsername("wy");
        student2.setEmail("1458204190@qq.com");
        student2.setAge(20);
        student2.setPassword("123456");
        Address address2 = new Address();
        address2.setProvince("江西");
        address2.setCity("南昌");
        student2.setAddress(address2);
        list.add(student2);

        //模拟一个业务要很长时间
 /*       try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        return list;
    }
}
