package com.baldur;

import java.util.Date;

public class Util
{
    public static boolean assertNull(String... param)
    {
        for(String num : param)
        { 
            if(null == num)
            {
                System.out.println("信息不完整");
                return false;
            }
        }
        return true;
    }
    public static Member setId(Member member)
    {
        member.setId(new Date().getTime());
        return member; 
    }
}
