
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html"/>

        <h1>Titan Online Banking Application</h1>
        <h2>Login</h2>
        <form action="LoginServlet" method="post">
            <label>Username:</label>
            <input type="text" name="username" required><br>
            <label>Password:</label>
            <input type="password" name="password" required><br>
            <input type="submit" value="Login">
        </form>
        <p><a href="password_reset.jsp">Reset Password</a></p>
        <br>
        <p><a href="New_customer.jsp">New Customer Sign Up page</a></p>

<c:import url="/footer.jsp"/>