<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div align="center">
        <h1>Employee List</h1>
        <h3>
            <a href="newEmployee">New Employee</a>
        </h3>
        <table border="1">
 
            <th>Name</th>
            <th>Age</th>
            <th>salary</th>
            <th>Action</th>
 
            <c:forEach var="employee" items="${les}">
                <tr>
 
                    <td>${employee.name}</td>
                    <td>${employee.age}</td>
                    <td>${employee.salary}</td>
                    <td>
                    	<a href="editEmployee?eid=${employee.eid}">Edit</a>
                        <a href="deleteEmployee?eid=${employee.eid}">Delete</a>
                     </td>
 
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>