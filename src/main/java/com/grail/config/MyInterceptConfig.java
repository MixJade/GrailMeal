package com.grail.config;

import com.grail.common.JacksonMapper;
import com.grail.intercept.LoginCheckIntercept;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class MyInterceptConfig implements WebMvcConfigurer {
    /**
     * 添加拦截器,放行所有静态资源,以及登录相关的controller
     *
     * @param registry 拦截器注册
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginCheckIntercept())
                .addPathPatterns("/**")
                .excludePathPatterns("/employee/login", "/employee/logout", "/backend/**", "/front/**", "/error", "/favicon.ico");
    }

    /**
     * 扩展mvc框架的消息转换器
     *
     * @param converters mvc框架的转换器
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        //创建消息转换器对象
        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
        //设置对象转换器，底层使用Jackson将Java对象转为json
        messageConverter.setObjectMapper(new JacksonMapper());
        //将上面的消息转换器对象追加到mvc框架的转换器集合中
        converters.add(0, messageConverter);
    }
}
