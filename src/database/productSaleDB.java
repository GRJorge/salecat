package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author axdevil
 */
public class productSaleDB {
    static Connection con = connectionDB.connection();
    static Statement stmt;
    
    public static void add(int idProduct) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO productSale VALUES(NULL," + idProduct + ",(SELECT MAX(id) FROM sale))");
    }
    public static ResultSet getProducts(int sale) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT code,description,price FROM product INNER JOIN productSale WHERE product.id = productSale.productFK AND productSale.saleFK = " + sale);
    }
}
