package com.pctc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TwoInterceptor implements HandlerInterceptor {

//public class TwoInterceptor extends HandlerInterceptorAdapter {

    /**
     * 该方法在目标方法之前被调用。
     * 若返回值为 true, 则继续调用后续的拦截器和目标方法。
     * 若返回值为 false, 则不会再调用后续的拦截器和目标方法。
     *
     * 可以做   事务，权限，日志。
     */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("第二个拦截器中的 preHandle方法被调用  用后续的拦截器和目标方法");
        //做业务逻辑判断
        return true;
        //return false;
    }


    /**
     * 调用目标方法之后, 在渲染视图之前。
     * 可以对 请求域中的属性或视图做出处理。
     */

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("第二个拦截器中的 postHandle方法被调用，调用目标方法之后");
    }


    /**
     * 渲染视图之后被调用，释放资源。
     */

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("第二个拦截器中的 afterCompletion方法被调用  渲染视图之后被调用");
    }
}
