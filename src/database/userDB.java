package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorge garcia
 */
public class userDB {
    static Connection con = connectionDB.connection();
    static Statement stmt;
    
    public static void add(String name, String password) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO user VALUES(NULL,'" + name + "','" + password + "')");
    }
    
    public static ResultSet getName() throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT name FROM user");
    }
    
    public static ResultSet getNameById(int id) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT name FROM user WHERE id=" + id);
    }
    
    public static ResultSet validatePassword(String name, String password) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT * FROM user WHERE name='" + name + "' AND password='" + password + "'");
    }
    
    public static ResultSet getId(String user) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT id FROM user WHERE name='" + user + "'");
    }
}
