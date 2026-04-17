<%@page contentType="text/html" pageEncoding="UTF-8">  
<html>  
<body>  
<%! intn,rem,r; %>  
<% n=Integer.parseInt(request.getParameter("num"));  
if(n<10)  
{  
out.println("Sum of first and last digit is ");  
%><font size=18 color=red><%= n %>  
<%  
}  
else  
{  
rem=n%10;  
do  
{  
r=n%10;  
n=n/10;  
}while(n>0);  
n=rem+r;  
out.println("Sum of first and last digit is ");  
%><font size=18 color=red><%= n %>  
<%  
}  
%>  
</body>  
</html>