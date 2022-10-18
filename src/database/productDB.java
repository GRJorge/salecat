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
    
    public static ResultSet getByCode(String code) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT id,description,price FROM product WHERE code='" + code + "'");
    }
    public static void edit(int id, String code, String description, String price, String wholesalePrice, String gain, String providerFK, int amount) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("UPDATE product SET code='" + code + "',description='" + description + "',price=" + price + ",wholesalePrice=" + wholesalePrice + ",gain=" + gain + ",providerFK=" + providerFK + ",amount=" + amount + " WHERE id=" + id);
    }
    
    public static void delete(int id) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM product WHERE id=" + id);
    }
    
    public static ResultSet existCode(String code) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT code FROM product WHERE code='" + code + "'");
    }
    
    public static ResultSet getProduct(int id) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT * FROM product WHERE id=" + id);
    }
    
    public static void restAmount(int id) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("UPDATE product SET amount = amount - 1 WHERE id=" + id);
    }
}
