package VirtualCB;
import java.sql.*;

public class dbOperations {
    private static Connection connection;

    public static Connection getConnection() {

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","test","12345");

        }
        catch(Exception ex){
            System.out.println("  "+ex);
        }
        return connection;
    }
}
