import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
 
public class DB10_CreatAlterDrop{ 
       public static void main(String[] args) throws Exception 
 {     
        try 
 { 
 Class.forName("org.postgresql.Driver"); 
        Connection con = DriverManager.getConnection("jdbc:postgresql://172.16.6.1/ty172", "ty172",""); 
 Statement stmt = con.createStatement(); 
        String createTableSQL = "CREATE TABLE users (" + 
                                    "id INT PRIMARY KEY, " + 
                                    "username VARCHAR(50) NOT NULL, " + 
                                    "email VARCHAR(100) NOT NULL)"; 
 stmt.executeUpdate(createTableSQL); 
        System.out.println("Table 'users' created successfully."); 
 
            // Altering the table to add a new column 
        String addColumnSQL = "ALTER TABLE users ADD COLUMN age INT"; 
        stmt.executeUpdate(addColumnSQL); 
        System.out.println("Column 'age' added successfully to 'users' table."); 
 
            // Dropping the table 
        String dropTableSQL = "DROP TABLE IF EXISTS users"; 
        stmt.executeUpdate(dropTableSQL); 
        System.out.println("Table 'users' dropped successfully."); 
 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
}