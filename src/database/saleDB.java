package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import salecat.global;

/**
 *
 * @author axdevil
 */
public class saleDB {
    static Connection con = connectionDB.connection();
    static Statement stmt;
    
    public static void add(float total) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO sale VALUES(NULL, DEFAULT," + total + "," + global.getActualUser() + ")");
    }
    public static ResultSet getAll() throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT id,CONCAT(DAY(date),'/',MONTH(date),'/',YEAR(date)) AS date,total,userFK FROM sale");
    }
}
