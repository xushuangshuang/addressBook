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

    public List findAll(String sql)
    {
       try
       {
            result = db.executeQuery(sql);
            while(result.next())
            {
                 Map map = new HashMap();
                 map.put("name", result.getString("name"));
                 map.put("mobile", result.getInt("mobile"));
                 map.put("vpmn", result.getInt("vpmn"));
                 map.put("email", result.getString("email"));
                 map.put("home_address", result.getString("home_addressm"));
                 map.put("office_address", result.getString("office_address"));
                 map.put("groups", result.getString("groups"));
                 map.put("job", result.getString("job"));
                 map.put("job_level", result.getInt("job_level"));
                 map.put("memo", result.getString("memo"));
                 list.add(map);
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
