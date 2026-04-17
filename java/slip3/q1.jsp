<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Patient Details</title>
    <style>
        table {
            border-collapse: collapse;
            width: 60%;
            margin: auto;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: lightgray;
        }
    </style>
</head>
<body>

<h2 align="center">Patient Details</h2>

<%
    // Sample Patient Data
    int[] pno = {101, 102, 103};
    String[] pname = {"Rahul", "Sneha", "Amit"};
    String[] address = {"Pune", "Mumbai", "Nashik"};
    int[] age = {25, 30, 28};
    String[] disease = {"Fever", "Cold", "Diabetes"};
%>

<table>
    <tr>
        <th>PNo</th>
        <th>PName</th>
        <th>Address</th>
        <th>Age</th>
        <th>Disease</th>
    </tr>

    <%
        for(int i = 0; i < pno.length; i++) {
    %>
    <tr>
        <td><%= pno[i] %></td>
        <td><%= pname[i] %></td>
        <td><%= address[i] %></td>
        <td><%= age[i] %></td>
        <td><%= disease[i] %></td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>