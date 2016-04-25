/**
 * Created by danieleinternicola on 21/04/16.
 */
import java.sql.Connection;
import java.sql.*;

public class Test {

    private static Connection conn = null;


    public static void main(String[] args) {


        conn = ConfConn.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT email FROM my_contacts ");
            while ( rs.next() ) {
                String email = rs.getString("email");
                System.out.println(email);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
    }
