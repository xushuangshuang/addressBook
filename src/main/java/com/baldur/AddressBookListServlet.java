package com.baldur;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

public class AddressBookListServlet extends AbstractHttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
        throws IOException, ServletException
    {
        ContactListService list = new ContactListService();
        List result = list.show();
        req.setAttribute("AllList", result);
        show(req, resp, "list");
    }
}
