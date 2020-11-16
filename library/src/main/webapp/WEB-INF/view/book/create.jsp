<%-- 
    Document   : create
    Created on : Nov 15, 2020, 12:16:08 PM
    Author     : kostis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section class="container">
            <h2>Create Book</h2>
            <form:form class="form" 
                       action="${pageContext.request.contextPath}/book/create" 
                       modelAttribute="book" 
                       method="POST">
                <label for="title">Enter title</label>
               <form:input id="title" path="title"/>
               <br>
               <label for="title">Choose Author</label>
                <div>
                <form:select path="authorId" items="${authors}" itemLabel="firstName" itemValue="id" />
            </div>
                
                    <br>
                    <label for="title">Choose Category</label>
                    <div>
                <form:select path="categoryId" items="${categories}" itemLabel="name" itemValue="id" />
                  </div>
                  
                <!--path: getter is called when loading, setter is called when submitting-->
                <!--path attribute will be populated from modelAttribute-->
                
                <input class="btn" type="submit" value="Submit"/>
            </form:form>
        </section>
    </body>
</html>
