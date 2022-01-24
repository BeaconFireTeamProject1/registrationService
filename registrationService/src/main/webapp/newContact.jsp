<%--
  Created by IntelliJ IDEA.
  User: Dexter
  Date: 2022/1/21
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
<h2>Contact Info</h2>
<div class="container">
    <form:form method="POST" action="/auth/createContact" modelAttribute="contact">
        <div class="form-group">
            <form:label path="name" for="nameInput">Contact Name(*)</form:label>
            <form:input type="text" path="name" class="form-control" id="nameInput"/>
        </div>
        <div class="form-group">
            <form:label path="address" for="addressInput">Address(*)</form:label>
            <form:input type="text" path="address" class="form-control" id="addressInput"/>
        </div>
        <div class="form-group">
            <form:label path="phone" for="phoneInput">Phone Number(*)</form:label>
            <form:input type="text" path="phone" class="form-controll" id="phoneInput"/>
        </div>
        <div class="form-group">
            <form:label path="Relationship" for="relationshipInput">Relationship</form:label>
            <form:input type="text" path="relationship" class="form-controll" id="relationshipInput"/>
        </div>
        <div class="form-group">
            <form:label path="title" for="titleInput">Phone Number(*)</form:label>
            <form:input type="text" path="title" class="form-controll" id="titleInput"/>
        </div>
        <div class="form-group">
            <form:input type="checkbox" path="referrence" id="referrence" label="Is Referrence Contact?" readonly = "readonly" ></form:input>
        </div>
        <div class="form-group">
            <form:input type="checkbox" path="emergency" id="emergency" label="Is Emergency Contact?" readonly = "readonly" hidden="true"></form:input>
        </div>
        <button type="submit" class="btn btn-primary">Next</button>

    </form:form>

</div>

</body>
</html>
