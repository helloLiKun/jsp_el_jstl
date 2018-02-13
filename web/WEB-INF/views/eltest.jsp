<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/12 0012
  Time: 上午 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL</title>
</head>
<body>
<h3>${users[1].name}</h3><br>
<h3>${users[1]["name"]}</h3><br>
<h3>${"100"+"10"}</h3><br>  <!-- 120-->
<h3>${100+10}</h3><br>    <!-- 120-->
<h3>${"hello"}${"world"}</h3><br>  <!-- helloworld-->
<h3>${1>2}</h3><br>
<h3>${"a"=="b"}</h3><br>
<h3>${2>1 && 3>2}</h3><br>
<h3>${empty " "}</h3><br> <!--false-->
<h3>${empty ""}</h3><br>  <!--true-->
<h3>${empty null}</h3><br>  <!--true-->
<script type="text/javascript" src="libs/jquery-2.1.1.js"></script>
</body>
</html>
