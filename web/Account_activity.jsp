<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html"/>

        <div>
            <h1>Titan Online Banking Application</h1>
            <h2>Account Activity</h2>
            
            <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            
            <c:choose>
                <c:when test="${user == null}">
                    <p>Not Logged in</p>
                </c:when>
                <c:otherwise>
                    <p>Welcome ${user.firstName} ${user.lastName}</p>
                </c:otherwise>
            </c:choose>
   
        </div>

<c:import url="/footer.jsp"/>

