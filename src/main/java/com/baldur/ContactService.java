package com.baldur;

public class ContactService
{
    SqlService sqlService;
    public ContactService()
    {
        sqlService = new SqlService();
    }

    public boolean save(Member member)
    {
        String username = member.getUsername();
        boolean saveResult = sqlService.save(member);
        return saveResult;
    }

}
