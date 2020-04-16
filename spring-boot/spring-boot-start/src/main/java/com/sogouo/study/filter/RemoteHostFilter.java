package com.sogouo.study.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

//@Component
public class RemoteHostFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Servlet Filter remote host: " + servletRequest.getRemoteHost() + " started ...");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Servlet Filter remote host: " + servletRequest.getRemoteHost() + " ended ...");
    }
}
