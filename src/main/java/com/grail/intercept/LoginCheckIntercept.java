package com.grail.intercept;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.grail.common.BaseContext;
import com.grail.common.Result;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckIntercept implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(LoginCheckIntercept.class);

    @Override
    public boolean preHandle(HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        log.info("拦截到请求：{}", requestURI);
        // 进行登录判断
        Object employeeID=request.getSession().getAttribute("employee");
        if (employeeID!= null) {
            Long empId = (Long) employeeID;
            BaseContext.setCurrentId(empId);
            return true;
        } else {
            log.info("用户未登录");
        /* 异步请求不能重定向跳转，
        这里通过前端的js文件来进行跳转，
        因为我们将静态页面进行放行，所以到达这里的只有异步请求，
        如果有朝一日，能够很精细的处理过滤规则，这里可以改回重定向
         */
            String noLogin = (new ObjectMapper()).writeValueAsString(Result.error("NO_LOGIN"));
            response.getWriter().write(noLogin);
            return false;
        }
    }
}