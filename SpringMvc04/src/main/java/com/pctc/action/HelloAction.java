package com.pctc.action;


import com.pctc.model.Address;
import com.pctc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/first")
//@SessionAttributes(types= Student.class)
@SessionAttributes(value={"student","username"})
public class HelloAction {

    /**
     * 设置session的值
     * @param map
     * @return
     */
    @RequestMapping("/checkSessionAttributes")
    public String checkSessionAttributes(Map<String,Object>map){
        Student student = new Student();
        student.setId(1);
        student.setUsername("xs");
        Address address = new Address();
        address.setProvince("江西");
        address.setCity("南昌");
        student.setAddress(address);
        map.put("student",student);
        map.put("username","xs");
        return "success";
    }

    /**
     * 取出session中的值，使用Map的方式
     * @param map
     * @return
     */
    @RequestMapping("check1")
    public String check1(Map<String,Object>map){
        System.out.println(map.get("student"));
        System.out.println(map.get("username"));//想要显示username，@SessionAttributes(value={"student","username"})中必须加上username,不加则不显示
        return "success";
    }


    /**
     * 和checkSessionAttributes同样是设置session的值，不过设置的方式不同
     * 此方法是servlet的方式
     * @param session
     * @return
     */
    @RequestMapping("check2")
    public String check2(HttpSession session) {
        Student student = new Student();
        student.setId(2);
        student.setUsername("xs2");
        Address address = new Address();
        address.setProvince("江西2");
        address.setCity("南昌2");
        student.setAddress(address);

        session.setAttribute("student",student);
        session.setAttribute("username","xs2");
        return "success";
    }

    /**
     * 获取session中的值和check1一样，不过获取的方式不同，此方法通过httpsession的方式获取
     * @param session
     * @return
     */
    @RequestMapping("check3")
    public String check3(HttpSession session){
        System.out.println(session.getAttribute("student"));
        System.out.println(session.getAttribute("username"));
        return "success";
    }

    /**
     * SessionStatus可以清除HttpSession中的数据，不过在check4中依然可以用
     * 一旦跳出此方法后则不能使用，测试结果帮助理解清晰
     * @param map
     * @param sessionStatus
     * @return
     */
    @RequestMapping("check4")
    public String check4(Map<String,Object>map, SessionStatus sessionStatus){
        sessionStatus.setComplete();
        System.out.println(map.get("student"));
        System.out.println(map.get("username"));
        return "success";
    }


    /**
     * servlet中的session.invalidate()可以清除HttpSession中的数据
     * 只能清除check2的方法设置的session的值，不能清除checkSessionAttributes方法设置的值
     * 经过测试不能清除任何方法设置的值，无作用
     * @param map
     * @param session
     * @return
     */
    @RequestMapping("check5")
    public String check5(Map<String,Object>map,HttpSession session){
        session.invalidate();
        System.out.println(map.get("student"));
        System.out.println(map.get("username"));
        return "success";
    }



    @RequestMapping("/checkRedirect")
    public String checkRedirect(HttpServletRequest request){
        System.out.println("checkRedirect");
        request.setAttribute("username","xs");
        return "redirect:/index.jsp";
    }


    @RequestMapping("/checkForward")
    public String checkForward(HttpServletRequest request){
        System.out.println("checkForward");
        request.setAttribute("username","xs");
        return "forward:/index.jsp";
    }

    @RequestMapping("/checkForwardAction")
    public String checkForwardAction(){
        System.out.println("checkForwardAction");
        return "forward:/first/checkForward";
    }

    @RequestMapping("/checkRedirectAction")
    public String checkRedirectAction(){
        System.out.println("checkRedirectAction");
        return "redirect:/first/checkRedirect";
    }
}
