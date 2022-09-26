package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author axdevil
 */
public class productDB {
    static Connection con = connectionDB.connection();
    static Statement stmt;
    
    public static void add(String code, String description, String price, String wholesalePrice, String gain, String providerFK, int amount) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO product VALUE(NULL,'" + code + "','" + description + "'," + price + "," + wholesalePrice + "," + gain + ",DEFAULT," + providerFK + "," + amount +")");
    }
    
    public static ResultSet get() throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT * FROM product");
    }
}
