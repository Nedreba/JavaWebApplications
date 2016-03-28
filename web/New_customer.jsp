<%-- 
    Document   : New_customer
    Created on : Mar 28, 2016, 2:25:15 PM
    Author     : Nedreba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Customer Sign Up</title>
    </head>
    
        <h1>Titan Online Banking Application</h1>
            <h2>Sign Up</h2>
            <p><i>${message}</i></p>
            <form action="NewCustomerServlet" method="post">
                <label>First Name:</label>
                <input type="text" name="firstName" ><br>
                <label>Last Name:</label>
                <input type="text" name="lastName"><br>
                <label>Phone:</label>
                <input type="text" name="phone"><br>
                <label>Address:</label>
                <input type="text" name="address"><br>
                <label>City:</label>
                <input type="text" name="city"><br>
                <label>State:</label>
                <input type="text" name="state"><br>
                <label>Zipcode:</label>
                <input type="text" name="zipcode"><br>
                <label>Email:</label>
                <input type="email" name="userEmail"><br>
                <input type="submit" value="Login">
            </form>
    
</html>
