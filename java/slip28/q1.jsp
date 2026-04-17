<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Reverse String</title>
</head>
<body>

<h2>Enter a String</h2>

<form method="post">
    <input type="text" name="str" required>
    <input type="submit" value="Reverse">
</form>

<%
    String input = request.getParameter("str");

    if (input != null) {
        String reversed = "";

        // Reverse logic
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
%>

<h3>Reversed String: <%= reversed %></h3>

<%
    }
%>

</body>
</html>