package com.baldur;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class ContactDao
{
    static final Logger logger = LoggerFactory.getLogger(ContactDao.class);
    DBService db = null;
    ResultSet result = null;
    List list = null;

    public ContactDao()
    {
        db = DBService.newInstance();
        list = new ArrayList();
    }

    public List<Member> findAll(String sql)
    {
       try
       {
            result = db.executeQuery(sql);
            while(result.next())
            {
                 Member member = new Member();

                 member.setUsername(result.getString("name"));
                 member.setMobile(result.getLong("mobile"));
                 member.setVpmn(result.getInt("vpmn"));
                 member.setEmail(result.getString("email"));
                 member.setHomeAddress(result.getString("home_address"));
                 member.setOfficeAddress(result.getString("office_address"));
                 member.setGroups(result.getString("groups"));
                 member.setJob(result.getString("job"));
                 member.setJobLevel(result.getInt("job_level"));
                 member.setMemo(result.getString("memo"));
                 list.add(member);
            }
       }
       catch(Exception e)
       {
            logger.error("findAll :", e);
       }
       finally
       {
           db.close();
       }
       return list;
    } 
    public boolean save(Member member, String sql)
    {
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

            logger.info("sql");
        }
        catch(Exception e)
        {
            System.out.println(e);
            logger.error("SAVE SQL :" + e);
            return false;
        }
        finally
        {
            db.close();
        }
        return true;
    }
}
