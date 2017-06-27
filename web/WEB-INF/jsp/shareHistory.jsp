<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/19
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>历史记录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
    <link rel="stylesheet" href="<%=basePath%>resource/css/base.css">
    <link rel="stylesheet" href="<%=basePath%>resource/css/index.css">
</head>
<body>
<%--分享列表开始--%>
<div class="wrap">
    <c:forEach var="share" items="${shareList}">
        <a href="<%=basePath%>share/${share.id}/showDetail" class="newsList">
            <h1 class="c_Title">${share.title}<span></h1>
            <div class="content">${share.content}</div>
            <div><span class="shareLabel">${share.label1}&nbsp;&nbsp;.&nbsp;&nbsp;${share.label2}</span></span><span class="creatTime"><fmt:formatDate value="${share.creatTime}" type="both" /></span><span class="username">${share.username}</span></div>
        </a>
    </c:forEach>
</div>
<%--分享列表结束--%>
</body>
</html>
