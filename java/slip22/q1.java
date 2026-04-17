import java.sql.*; 
import java.io.*; 
public class DB6_Menu 
{ 
public static void main(String[] args) throws Exception 
{ 
Connection conn=null; 
  Statement stmt=null; 
  ResultSet rs=null; 
  PreparedStatement ps1=null, ps2=null; 
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
  String name; 
  int r,per,choice; 
  Class.forName("org.postgresql.Driver"); 
 
 conn=DriverManager.getConnection("JDBC:postgresql://172.16.6.1/ty170","ty170",""); 
  stmt=conn.createStatement(); 
  ps1=conn.prepareStatement("insert into studentTY values(?,?,?)"); 
  ps2=conn.prepareStatement("update studentTY set name=?, per=? where no=?"); 
  if(conn!=null) 
   System.out.println("Connection successful..."); 
  do 
  { 
   System.out.println("1: View Records"); 
   System.out.println("2: Insert Records"); 
   System.out.println("3: Delete Records"); 
   System.out.println("4: Modify Records"); 
   System.out.println("5: Search Records"); 
   System.out.println("6: Exit"); 
   System.out.println("Enter your choice :"); 
   choice=Integer.parseInt(br.readLine()); 
   switch(choice) 
   { 
   case 1: 
    rs=stmt.executeQuery("select * from studentTY"); 
    while(rs.next()) 
    { 
     System.out.println("Roll Number = "+rs.getInt(1)); 
     System.out.println("Name = "+rs.getString(2)); 
     System.out.println("Percentage  = "+rs.getInt(3)); 
    } 
    break; 
   case 2: 
    System.out.println("Enter the student record"); 
    System.out.println("Enter roll number = "); 
    r=Integer.parseInt(br.readLine()); 
    System.out.println("Enter Name = "); 
    name=br.readLine(); 
    System.out.println("Enter Percentage = "); 
    per=Integer.parseInt(br.readLine()); 
    ps1.setInt(1, r); 
    ps1.setString(2, name); 
    ps1.setInt(3, per); 
    ps1.executeUpdate(); 
    break; 
   case 3: 
    System.out.println("Enter the roll number to be deleted "); 
    r=Integer.parseInt(br.readLine()); 
    stmt.executeUpdate("Delete from studentTY where no= "+r); 
    break; 
   case 4: 
    System.out.println("Enter the roll number to be modified"); 
    r=Integer.parseInt(br.readLine()); 
 
    System.out.println("Enter new name"); 
    name=br.readLine(); 
    System.out.println("Enter new percentage"); 
    per=Integer.parseInt(br.readLine()); 
    ps2.setInt(3,r); 
    ps2.setString(1,name); 
    ps2.setInt(2,per); 
    ps2.executeUpdate(); 
    break; 
   case 5: 
    System.out.println("Enter roll number to be searched"); 
    r=Integer.parseInt(br.readLine()); 
    rs=stmt.executeQuery("select * from studentTY where no = "+r); 
    if(rs.next()) 
    { 
     System.out.println("Number = "+rs.getInt(1)); 
     System.out.println("Name = "+rs.getString(2)); 
     System.out.println("Per = "+rs.getInt(3)); 
    } 
    else 
     System.out.println("Record not found"); 
    break; 
   } 
  }while(choice!=6); 
 }
}