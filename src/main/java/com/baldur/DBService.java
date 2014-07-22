package com.baldur;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBService
{  
    static final Logger logger = LoggerFactory.getLogger(DBService.class);
    private static final String jdbcURL = "jdbc:mysql://localhost/test?" 
        + "user=root&password=";
    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    private Connection conn = null;    
    private PreparedStatement  pstmt = null;
    private int paremtIndex;

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
        return this;
    }
    public DBService setInt(int param) throws SQLException
    {
        pstmt.setInt(paremtIndex, param);
        paremtIndex++;
        return this;
    }
    public DBService setLong(Long param) throws SQLException
    {
        pstmt.setLong(paremtIndex, param);
        paremtIndex++;
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
            
        }
        return db;

    }

}
