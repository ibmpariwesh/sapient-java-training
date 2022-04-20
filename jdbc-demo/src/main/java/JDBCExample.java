import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost:3306/classicmodels";
   static final String USER = "root";
   static final String PASS = "admin123";
   static final String QUERY = "SELECT customerNumber,customerName,contactLastName,contactFirstName,phone FROM customers";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("customerNumber: " + rs.getInt("customerNumber"));
            System.out.print(", customerName: " + rs.getString("customerName"));
            System.out.print(", contactLastName: " + rs.getString("contactLastName"));
            System.out.println(", phone: " + rs.getString("phone"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}