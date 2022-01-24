<%--
  Created by IntelliJ IDEA.
  User: Dexter
  Date: 2022/1/21
  Time: 16:00
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
<h2>Address Info</h2>
<div class="container">
    <form:form method="POST" action="/auth/createAddress" modelAttribute="address">
        <div class="form-group">
            <form:label path="addressLine1" for="address1Input">Address(*):</form:label>
            <form:input type="text" path="addressLine1" class="form-control" id="address1Input"/>
        </div>
        <div class="form-group">
            <form:label path="addressLine2" for="address2Input">Address(optional):</form:label>
            <form:input type="text" path="addressLine2" class="form-control" id="address2Input"/>
        </div>
        <div class="form-group">
            <form:label path="city" for="cityInput">Address(*):</form:label>
            <form:input type="text" path="city" class="form-control" id="cityInput"/>
        </div>
        <div class="form-group">
            <form:label path="zipcode" for="zipcodeInput">Address(*):</form:label>
            <form:input type="text" path="zipcode" class="form-control" id="zipcodeInput"/>
        </div>
        <div class="form-group">
            <form:label path="stateName" for="stateNameInput">Address(*):</form:label>
            <form:input type="text" path="stateName" class="form-control" id="stateNameInput"/>
        </div>
        <button type="submit" class="btn btn-primary">Next</button>
    </form:form>
</div>

</body>
</html>
