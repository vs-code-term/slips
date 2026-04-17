import java.sql.*; 
class DB2_Product 
{      public static void main(String args[]) throws Exception 
 { 
 Connection conn; 
 Statement stmt; 
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
stmt=conn.createStatement(); 
rs=stmt.executeQuery("select * from product"); 
while(rs.next()) 
{ 
System.out.println("Product ID ="+rs.getInt(1)); 
System.out.println("Product Name ="+rs.getString(2)); 
System.out.println("Product Price ="+rs.getInt(3)); 
}  conn.close(); 
} 
catch(SQLException e) 
{ 

System.out.println(e);
 }
}
}