package com.baldur;

public class ContactDao
{
    public boolean save(Member member, String sql)
    {
        DBService db = DBService.newInstance();
        try
        {
            db.prepare(sql)
                .setLong(member.getId())
                .setString(member.getUsername())
                .setLong(member.getMobile())
                .setInt(member.getVpmn())
                .setString(member.getEmail())
                .setString(member.getHomeAddress())
                .setString(member.getOfficeAddress())
                .setString(member.getGroups())
                .setString(member.getJob())
                .setInt(member.getJobLevel())
                .setString(member.getMemo())
                .execute();

            System.out.println("SAVE  SQL " + sql);
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
