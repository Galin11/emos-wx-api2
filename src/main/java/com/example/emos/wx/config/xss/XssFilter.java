package com.example.emos.wx.config.xss;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 *
 * @description:
 * @author: wanghefei
 * @date: 2022-03-07 15:17
 * @version: 1.0
 */

@WebFilter(urlPatterns = "/*")
public class XssFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
       HttpServletRequest request = (HttpServletRequest) servletRequest;
       XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper(request);
       chain.doFilter(xssRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
