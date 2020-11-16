<%-- 
    Document   : list
    Created on : Nov 14, 2020, 8:42:29 PM
    Author     : kostis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book List</title>
    </head>
    <body>
        <table class="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Title</th>

                </tr>
            </thead>
            <tbody> 
            <div class="btn-area">
                <a  class="btn" href="${pageContext.request.contextPath}/book/create">Create A New Book</a> 
            </div>
            
            <p>
                ${bookMessage}
            </p>
            
             <p>
                ${message}
            </p>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.id}</td>
                    <td>${book.title}</td>
                    <td class="buttontd"><a class="btn" href="book/edit?kwdikos=${book.id}">Edit</a></td>
                    <td class="buttontd"><a class="btn" href="book/delete?id=${book.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>


    </table>
</body>
</html>
