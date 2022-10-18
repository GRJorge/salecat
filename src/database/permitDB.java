package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author axdevil
 */
public class permitDB {
    static Connection con = connectionDB.connection();
    static Statement stmt;
    
    public static void add(boolean product, boolean sale, boolean inventory, boolean provider, int user) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO permit VALUES(NULL," + product + "," + sale + "," + inventory + "," + provider + "," + user + ")");
    }
}
