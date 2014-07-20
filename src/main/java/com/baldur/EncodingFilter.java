package com.baldur;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.FilterConfig;
import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter
{
    public void init(FilterConfig config) throws ServletException
    {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, 
            FilterChain chain) throws IOException, ServletException
    {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        chain.doFilter(req, resp);    

    }

    public void destroy()
    {
        

    }

}
