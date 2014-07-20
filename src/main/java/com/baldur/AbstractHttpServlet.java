package com.baldur;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class AbstractHttpServlet extends HttpServlet
{
    public void creatMember(HttpServletRequest req)
    {
        Member member = new Member();

        String username = req.getParameter("username");
        Long mobile = Long.valueOf(req.getParameter("mobile"));
        int vpmn = Integer.valueOf(req.getParameter("vpmn"));
        String email = req.getParameter("email");
        String home_address = req.getParameter("home_address");
        String office_address = req.getParameter("office_address");
        String memo = req.getParameter("memo");
        String groups = req.getParameter("groups");
        String job = req.getParameter("job");
        int job_level = Integer.valueOf(req.getParameter("job_level"));
        
        member.setUsername(username);
        member.setMobile(mobile);
        member.setEmail(email);
        member.setGroups(groups);
        member.setHomeAddress(home_address);
        member.setOfficeAddress(office_address);
        member.setJob(job);
        member.setVpmn(vpmn);
        member.setJobLevel(job_level);
    }
}
