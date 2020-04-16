package com.sogouo.study.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Token 在 servlet 之前进行 token认证以及权限认证
 *
 *
 */
public class SecurityFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Servlet Filter SecurityFilter started .....");
        String token = servletRequest.getParameter("token");

        if (token == null || !token.equals("123")) {
            servletResponse.getWriter().write("Not allowed");
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Servlet Filter SecurityFilter ended .....");
    }
}
