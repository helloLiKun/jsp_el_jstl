<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/13 0013
  Time: 上午 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<!--
  引用jstl标签需要导两个包 jstl-*.jar  standard-*.jar
-->
<h5>flg:</h5><h5>${users[1].name == '张三' }</h5><h5>end</h5>
<c:if test="${users[1].name == '张三' }" var="result" scope="request">男</c:if>
<h3>${result}+'------------------'</h3>
<c:if test="${result}">${result}</c:if>
<c:forEach var="u" items="${users}">
    <h5>${u.name}</h5>
</c:forEach>
</body>
</html>
