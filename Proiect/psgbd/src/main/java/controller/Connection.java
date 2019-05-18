package controller;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection {
    public void startConnection() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            java.sql.Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

//step3 create the statement object
            Statement stmt = con.createStatement();

//step4 execute query
            ResultSet rs = stmt.executeQuery("select email from members");
            if (rs != null) {
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
                System.out.println("pls2");
            } else
                System.out.println("plm");
//step5 close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
