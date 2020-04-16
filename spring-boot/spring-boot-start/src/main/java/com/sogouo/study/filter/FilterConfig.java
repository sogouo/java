package com.sogouo.study.filter;

/**
 * 过滤链默认无顺序，需要通过配置指定
 * 访问前
 *
 * 访问后
 * 每个请求执行一次 Filter Chain
 * 在 Tomcat 容器里，不是在Spring boot 里面
 *
 * SpringBoot 里面也有相似概念 拦截器 (Interceptor)
 * 过滤器(Filter) 和 拦截器(Interceptor) 是在不同语境下，
 * 处理类似功能的中间件或者工具
 *
 * SpringBoot 里面只有一个Servlet 容器
 * 3,4 之前
 *  interface HandlerInterceptor {
 *      preHandler
 *
 *      postHandler
 *
 *      afterCon
 *
 *  }
 *
 *
 *
 * Filter 语境是Servlet， 是Java servlet 规范里的东西
 * 存在与容器中
 *
 * Tomcat 窗口的实现了ApplicationFilterChain
 * Filter 是通过函数调用执行
 *
 * 声明方法有两种方式
 *      1、@Configuration + @Bean
 *
 *      2、@Componet
 *
 *
 *
 *
 *
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

//    @Bean
//    public DemoFilter demoFilter() {
//        return new DemoFilter();
//    }

    @Bean
    public RemoteHostFilter remoteHostFilter() {
        return new RemoteHostFilter();
    }
}
