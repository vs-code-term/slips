import java.sql.*; 
class DB5_Teacher 
{ 
public static void main(String args[]) throws Exception 
{ 
Connection conn; 
ResultSet rs=null; 
try 
{ 
Class.forName("org.postgresql.Driver"); 
conn=DriverManager.getConnection("JDBC:postgresql://172.16.6.1/ty1
70","ty170",""); 
if(conn==null) 
System.out.println("\nConnection Failed"); 
else  
System.out.println("\nConnection successfully"); 
String sq="select * from teacher where subject='Java'"; 
PreparedStatement pst=conn.prepareStatement(sq); 
rs=pst.executeQuery(); 
while(rs.next()) 
{ 
System.out.println("Teacher ID ="+rs.getInt(1)); 
System.out.println("Teacher Name ="+rs.getString(2)); 
System.out.println("Teacher Subject ="+rs.getString(3)); 
} 
conn.close(); 
} 
catch(SQLException e) 
{ 
} 
} 
}