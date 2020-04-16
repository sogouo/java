package com.sogouo.study.filter;


/**
 * @Component 一个Bean
 *
 *
 */

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class DemoFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Servlet Filter Demo Filter start .........");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Servlet Filter Demo Filter end .........");
    }
}
