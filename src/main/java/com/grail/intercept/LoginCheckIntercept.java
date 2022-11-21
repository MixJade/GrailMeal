package com.grail.intercept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckIntercept implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(LoginCheckIntercept.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        log.info("拦截到请求：{}", requestURI);
        if(request.getSession().getAttribute("employee") != null){
            return true;
        }
        log.info("用户未登录");
        response.sendRedirect("http://localhost:8080/backend/page/login/login.html");
        return false;
    }
}