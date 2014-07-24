package com.baldur;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class AddressBookListServlet extends AbstractHttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
        throws IOException, ServletException
    {
        ContactListService list = new ContactListService();
        list.show();
        show(req, resp, "list");
    }
}
