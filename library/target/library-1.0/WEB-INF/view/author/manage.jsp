<%-- 
    Document   : list
    Created on : Nov 15, 2020, 6:28:43 PM
    Author     : kostis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <a  class="btn" href="${pageContext.request.contextPath}/author/register">Create A New Author</a> 
            </div>
            
            <c:forEach items="${authors}" var="author">
                <tr>
                    <td>${author.id}</td>
                    <td>${author.firstName}</td>
                    <td>${author.lastName}</td>
                    <td>${author.dob}</td>
                    <td class="buttontd"><a class="btn" href="author/edit?kwdikos=${author.id}">Edit</a></td>
                    <td class="buttontd"><a class="btn" href="author/delete?id=${author.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>


    </table>
    </body>
</html>
