package com.example.springboot.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class IndexInterceptor implements HandlerInterceptor {

    /**
     * 前置拦截器,在请求之前使用:
     * 若返回false,将结束请求
     * 若返回true,将继续执行postHandle方法
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("=========进入拦截器=========perHandle=========");
        //获取session中的参数,用来判断登陆
        Object name = request.getSession().getAttribute("name");
        if (name == null) {
            //重定向到报错接口
            response.sendRedirect("/dev/get-error");
            return false;
        }
        //移除session
        request.getSession().removeAttribute("name");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
