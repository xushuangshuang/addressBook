package com.baldur;

public class Util
{
    public static boolean assertNull(String... param)
    {
        for(String num : parm)
        { 
            if(null == num)
            {
                System.out.println("信息不完整");
                return false;
            }
        }
        return true;
    }
}
