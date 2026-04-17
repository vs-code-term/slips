import java.sql.*;

public class ScrollableResultSetExample {
    public static void main(String[] args) {

        try {
            // Load driver (for older versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/your_database", "root", "password");

            // Create Statement with scrollable ResultSet
            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Teacher");

            // Move to last record
            rs.last();
            System.out.println("Last Record:");
            System.out.println(rs.getInt("TID") + " " +
                               rs.getString("TName") + " " +
                               rs.getDouble("Salary"));

            // Move to first record
            rs.first();
            System.out.println("\nFirst Record:");
            System.out.println(rs.getInt("TID") + " " +
                               rs.getString("TName") + " " +
                               rs.getDouble("Salary"));

            // Move to next record
            rs.next();
            System.out.println("\nSecond Record:");
            System.out.println(rs.getInt("TID") + " " +
                               rs.getString("TName") + " " +
                               rs.getDouble("Salary"));

            // Move to previous record
            rs.previous();
            System.out.println("\nBack to First Record:");
            System.out.println(rs.getInt("TID") + " " +
                               rs.getString("TName") + " " +
                               rs.getDouble("Salary"));

            // Move to absolute position (e.g., 2nd row)
            rs.absolute(2);
            System.out.println("\nAbsolute Position (2nd Record):");
            System.out.println(rs.getInt("TID") + " " +
                               rs.getString("TName") + " " +
                               rs.getDouble("Salary"));

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}