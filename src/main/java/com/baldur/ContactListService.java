package com.baldur;

import java.util.List;

public class ContactListService
{
    SqlService sqlService;
    public ContactListService()
    {
        sqlService = new SqlService();
    }
    public List show()
    {
       return sqlService.findAll();
    }
}
