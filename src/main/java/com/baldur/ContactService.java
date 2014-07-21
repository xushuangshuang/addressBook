package com.baldur;

public class ContactService
{
    public ContactService()
    {
        ContactDao contactDao = new ContactDao();
    }

    public boolean save(Member member)
    {
        String username = member.getUsername();
        boolean saveResult = contactDao.save(member);
        return saveResult;
    }

}
