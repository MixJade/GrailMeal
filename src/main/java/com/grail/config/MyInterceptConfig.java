package com.grail.config;

import com.grail.intercept.LoginCheckIntercept;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginCheckIntercept())
                .addPathPatterns("/**")
                .excludePathPatterns("/employee/login", "/employee/logout", "/backend/**", "/front/**","/error","/favicon.ico");
    }
}
