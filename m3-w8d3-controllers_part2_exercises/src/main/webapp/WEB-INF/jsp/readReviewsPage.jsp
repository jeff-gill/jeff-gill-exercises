<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<p>
<h1>User Reviews</h1><hr>

<a><b>${param.reviewTitle}</b><a>&nbsp&nbsp&nbsp&nbsp&nbsp</a>${param.username}</a></p>    
<a>${param.rating}</a>
<p>${param.reviewBody}</p>
<hr>
</body>
</html>