package com.baldur;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class AddressBookServlet extends AbstractHttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
        throws IOException, ServletException
    {
        show(req, resp, "creat");                 
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws IOException, ServletException
    {
        Member member = creatMember(req);
        ContactService contactService = new ContactService();
        boolean parmSave = contactService.save(member);
        if(parmSave)
        {
            

        }
        else
        {
            
        }
    }

}
