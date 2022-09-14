package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author axdevil
 */
public class provider {
    static Connection con = connectionDB.connection();
    static Statement stmt;
    
    
}
