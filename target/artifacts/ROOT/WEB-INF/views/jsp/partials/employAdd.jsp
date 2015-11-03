<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<form action="employAdd" method="post">
        <input name="name" type="text">
        <input name="lastName" type="text">
        <input name="hireDate" type="date" value="<%= new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %>">
        <input type="submit" value="Add">
</form>