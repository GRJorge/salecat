package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorge garcia
 */
public class user {
    static Connection con = connectionDB.connection();
    static Statement stmt;
    
    public static ResultSet getName() throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT name FROM user");
    }
    
    public static ResultSet validatePassword(String name, String password) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT * FROM user WHERE name='" + name + "' AND password='" + password + "'");
    }
}
