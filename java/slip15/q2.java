import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import java.util.Date; 
public class countAccess extends HttpServlet 
{ 
private int accessCount = 0; 
protected synchronized void IncrementCount() { 
accessCount++; 
} 
protected synchronized int getCount() { 
return accessCount; 
} 
public void doPost(HttpServletRequest req, HttpServletResponse res) 
throws ServletException, IOException 
{ 
IncrementCount();  
PrintWriter out= res.getWriter(); 
try 
{ 
res.setContentType("text/html"); 
//Date serverDate=new Date(); 
//String clientDateStr = req.getParameter("clientDate"); 
//out.println("<P><B>Server Side Date and time in millisecond= "+serverDate); 
//out.println("<P><B>Client Side Date and time in millisecond= "+clientDateStr); 
out.println("<P><B>Page Accesed "+getCount()+" Times"); 
} 
catch(Exception e) 
{ 
System.out.println(e);         
} 
} 
}