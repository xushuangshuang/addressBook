package com.baldur;

public class SqlService
{
    ContactDao contactDao;
    public SqlService()
    {
        contactDao = new ContactDao();
    }
    public boolean save(Member member)
    {
        String save_sql = "INSERT INTO contact_guest (contact_id, name, mobile,"
            +" vpmn, email, home_address, office_address, groups, job, " 
            + " job_level,memo) VALUE (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Member parmMember = Util.setId(member);
        boolean result = contactDao.save(parmMember, save_sql);
        return result;
    }
    public List findAll()
    {
        String find_all_sql = "SELECT * FROM contact_guest";
        return contactDao.findAll(find_all_sql);

    }
}
