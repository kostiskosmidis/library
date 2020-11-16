<%-- 
    Document   : home
    Created on : Nov 14, 2020, 7:13:03 PM
    Author     : kostis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World, This is Home Page</h1>
        <ul>
            <li>
                <p>
            <a href="${pageContext.request.contextPath}/book">Book List</a>
             </p>
               <p>
            <a href="${pageContext.request.contextPath}/author">Author List</a>
             </p>
            </li>
            
        </ul>
    </body>
</html>
