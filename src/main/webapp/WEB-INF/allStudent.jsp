<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html >
<head>
    <title>allStudent</title>
</head>
<body>
    hello student!
    <%=request.getAttribute("studentsPageInfo").toString()%>
</body>

<script>
    <%--function test() {--%>
    <%--    let obj = ${studentsPageInfo.pageNum}--%>
    <%--    console.log('${studentsPageInfo.pageNum}')--%>
    <%--}--%>
    <%--test()--%>
</script>
</html>
