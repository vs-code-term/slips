import java.sql.*; 
 public class DB4_DMetaDeta 
 { 
  public static void main(String[] args) throws Exception  
  { 
  Connection conn=null; 
  ResultSet rs=null; 
   
  Class.forName("org.postgresql.Driver"); 
 
 conn=DriverManager.getConnection("JDBC:postgresql://172.16.6.1/ty1
70","ty170",""); 
  DatabaseMetaData dbmd=conn.getMetaData(); 
   
  System.out.println("Database Product 
Name="+dbmd.getDatabaseProductName()); 
  System.out.println("User Name ="+dbmd.getUserName()); 
  System.out.println("Driver Name ="+dbmd.getDriverName()); 
  System.out.println("Driver Version ="+dbmd.getDriverVersion()); 
  System.out.println("Database Major Version 
="+dbmd.getDriverMajorVersion()); 
  System.out.println("Database Minor Version 
="+dbmd.getDriverMinorVersion()); 
  rs=dbmd.getTables(null,null,null,new String[] {"TABLE"}); 
  System.out.println("List of tables....."); 
  while(rs.next()) 
  { 
String tblname=rs.getString("TABLE_NAME"); 
System.out.println("Table : "+tblname); 
} 
conn.close(); 
} 
}  