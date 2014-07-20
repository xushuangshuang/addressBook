package com.baldur;

public class Util
{
    public static boolean assertNull(String... param)
    {
        if(null == param)
        {
            System.out.println("信息不完整");
            return false;
        }
        else
        {
            return true;
        }
    }

}
