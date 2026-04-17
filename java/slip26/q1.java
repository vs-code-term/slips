import java.sql.*; 
class DB7_Employee 
{ 
public static void main(String args[]) throws Exception 
{ 
Connection conn; 
try 
{ 
Class.forName("org.postgresql.Driver"); 
conn=DriverManager.getConnection("JDBC:postgresql://172.16.6.1/ty170","ty170",""); 
if(conn==null) 
System.out.println("\nConnection Failed"); 
else  
System.out.println("\nConnection successfully"); 
String sq="delete from employee where eid="+args[0]; 
PreparedStatement pst=conn.prepareStatement(sq); 
int x=pst.executeUpdate(); 
System.out.println(x+" Record deleted successfully");   
conn.close(); 
} 
catch(SQLException e)  { 
System.out.println(e); 
} 
} 
}