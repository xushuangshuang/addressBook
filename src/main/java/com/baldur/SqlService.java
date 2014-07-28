package com.baldur;

import java.util.List;

public class SqlService
{
    ContactDao contactDao;
    public SqlService()
    {
        contactDao = new ContactDao();
    }
    public boolean save(Member member)
    {
        String save_sql = "INSERT INTO contact (contact_id, name, mobile,"
            +" vpmn, email, home_address, office_address, groups, job, " 
            + " job_level,memo) VALUE (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Member parmMember = Util.setId(member);
        boolean result = contactDao.save(parmMember, save_sql);
        return result;
    }
    public List<Member> findAll()
    {
        String find_all_sql = "SELECT * FROM contact";
        return contactDao.findAll(find_all_sql);

    }
}
