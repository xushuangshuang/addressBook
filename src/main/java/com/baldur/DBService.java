package com.baldur;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBService
{  
    static final Logger logger = LoggerFactory.getLogger(DBService.class);
    private static final String jdbcURL = "jdbc:mysql://localhost/test?" 
       +  "user=root&password=" 
       + "&useUnicode=true&characterEncoding=utf-8";
    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    private Connection conn = null;    
    private PreparedStatement pstmt = null;

    private int paremtIndex;

    public void close()
    {
        close(conn);
        conn = null;

        close(pstmt);
        pstmt = null;
    }
    public void close(AutoCloseable obj)
    {
        if(obj != null)
        {
            try
            {
                obj.close();
            }
            catch(Exception e)
            {
                logger.error("CLOSE :", e);
            }
        }
    }
    public ResultSet executeQuery()throws SQLException
    {
        return pstmt.executeQuery();
    }
    public ResultSet executeQuery(String sql) throws SQLException
    {
        prepare(sql);
        logger.info(sql);
        return executeQuery();
    }
    public DBService prepare(String sql) throws SQLException
    {
        pstmt = conn.prepareStatement(sql);
        paremtIndex = 1;
        return this;    
    }

    public DBService setString(String param) throws SQLException
    {
        pstmt.setString(paremtIndex, param);
        paremtIndex++;
        logger.info(param);
        return this;
    }
    public DBService setInt(int param) throws SQLException
    {
        pstmt.setInt(paremtIndex, param);
        paremtIndex++;
        logger.info(String.valueOf(param));
        return this;
    }
    public DBService setLong(Long param) throws SQLException
    {
        pstmt.setLong(paremtIndex, param);
        paremtIndex++;
        logger.info(String.valueOf(param));
        return this;
    }
    public void execute() throws SQLException
    {
        pstmt.execute();
    }
    public static Connection createConnection() throws SQLException
    {
        try
        {
            Class.forName(jdbcDriver);
        }
        catch(Exception e)
        {
            logger.error(" SQL Driver :" + e);
        }
        return DriverManager.getConnection(jdbcURL);
    }

    public static DBService newInstance()
    {
        DBService db = new DBService();
        try
        {
            db.conn = DBService.createConnection();
        }
        catch(Exception e)
        {
           logger.error("SQL connection :" + e); 
        }
        return db;
    }
}
