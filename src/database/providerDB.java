package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author axdevil
 */
public class providerDB {
    static Connection con = connectionDB.connection();
    static Statement stmt;
    
    public static void add(String name, String appat, String apmat, String business, String phone) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO provider VALUE(NULL,'" + name + "','" + appat + "','" + apmat + "','" + business + "','" + phone + "')");
    }
    
    public static void delete(String id) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM provider WHERE id=" + id);
    }
    
    public static void edit(int id, String name, String appat, String apmat, String business, String phone) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("UPDATE provider SET name='" + name + "', appat='" + appat + "', apmat='" + apmat + "', business='" + business + "', phone='" + phone + "' WHERE provider.id=" + id);
    }
    
    public static ResultSet get() throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT * FROM provider");
    }
    
    public static ResultSet getProvider(int id) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT name,appat,apmat,business,phone FROM provider WHERE id=" + id);
    }
}
