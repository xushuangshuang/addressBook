package com.baldur;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class AddressBookServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
        throws IOException , ServletException
    {
        resp.getWriter().println("测试Servlet成功");        

    }

}
