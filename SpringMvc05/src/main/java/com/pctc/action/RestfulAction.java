package com.pctc.action;


import com.pctc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("restfulAction")
public class RestfulAction {

    @RequestMapping(value = "/checkRestful",method = RequestMethod.POST)
    public String checkRest(Student student){
        System.out.println("添加:add");
        System.out.println(student);
        //添加业务代码
        return "success";
    }


    /**
     * 使用   //http://localhost:8080/springmvc5/RestfulAction/checkRestful/1
     *     //http://localhost:8080/springmvc5/RestfulAction/checkRestful?id=1
     *     网址显示
     * @param id
     * @return
     */
    @RequestMapping(value = "/checkRestful/{id}",method = RequestMethod.GET)
    public String checkRest(@PathVariable("id")Integer id){
        System.out.println("根据id查询"+id);
        //根据ID查询业务代码
        return "success";
    }


    @RequestMapping(value = "/checkRestful/{id}",method = RequestMethod.PUT)
    @ResponseBody//idea和Eclipse需要加此注解，Myeclipse可以不加
    public String checkRestPut(@PathVariable("id")Integer id){
        System.out.println("根据ID修改"+id);
        //根据ID修改业务代码
        return "success";
    }

    @RequestMapping(value = "/checkRestful/{id}",method = RequestMethod.DELETE)
    @ResponseBody//idea和Eclipse需要加此注解，Myeclipse可以不加
    public String checkRestDelete(@PathVariable("id")Integer id){
        System.out.println("根据ID删除"+id);
        //根据ID删除信息业务代码
        return "success";
    }

}
