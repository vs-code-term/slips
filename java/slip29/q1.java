import java.sql.*; 
class DB3_Donar 
{ 
 public static void main(String args[]) throws Exception 
 { 
 Connection conn; 
 Statement stmt; 
 ResultSet rs=null; 
 ResultSetMetaData rsmd=null; 
 
 try 
 { 
 Class.forName("org.postgresql.Driver"); 
conn=DriverManager.getConnection("JDBC:postgresql://172.16.6.1/ty1
70","ty170",""); 
System.out.println("\nConnection successfully"); 
stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
ResultSet.CONCUR_UPDATABLE); 
rs=stmt.executeQuery("select * from donar"); 
rsmd=rs.getMetaData(); 
int nocols=rsmd.getColumnCount();  
System.out.println("\nNo of Columns ="+nocols); 
for(int i=1;i<=nocols;i++) 
{ 
System.out.println("\nColumn Number ="+i); 
System.out.println("Column Name ="+rsmd.getColumnName(i)); 
System.out.println("Column Data Type ="+rsmd.getColumnTypeName(i)); 
} 
rs.last();  
System.out.println("\nNumber of Records="+rs.getRow()); 
} 
catch(ClassNotFoundException e) 
{ 
} 
System.out.println(e); 
catch(SQLException e) 
{ 
} 
} 
System.out.println(e); 
}