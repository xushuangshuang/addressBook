package com.baldur;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

public class AbstractHttpServlet extends HttpServlet
{
    public Member creatMember(HttpServletRequest req)
    {
        Member member = new Member();

        String username = req.getParameter("username");
        String parmMobile = req.getParameter("mobile");
        String parmVpmn = req.getParameter("vpmn");
        String email = req.getParameter("email");
        String home_address = req.getParameter("home_address");
        String office_address = req.getParameter("office_address");
        String memo = req.getParameter("memo");
        String groups = req.getParameter("groups");
        String job = req.getParameter("job");
        String parmJob_level = req.getParameter("job_level");
        
        member.setUsername(username);
        member.setEmail(email);
        member.setGroups(groups);
        member.setHomeAddress(home_address);
        member.setOfficeAddress(office_address);
        member.setJob(job);
        member.setMemo(memo);

        if(Util.assertNull(parmMobile, parmVpmn, parmJob_level))
        {
            Long mobile = Long.valueOf(parmMobile);
            member.setMobile(mobile);
            int vpmn = Integer.valueOf(parmVpmn);
            member.setVpmn(vpmn);
            int job_level = Integer.valueOf(parmJob_level);
            member.setJobLevel(job_level);
        }
        return member;
    }
    public void show(HttpServletRequest req, HttpServletResponse resp,
            String page) 
        throws IOException , ServletException
    {
         getServletContext()
             .getRequestDispatcher("/jsp/" + page + ".jsp")
             .forward(req, resp);
    } 

}
