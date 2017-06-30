<%@ page import="java.util.Date" %><%--
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
    <title>首页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
    <link rel="stylesheet" href="<%=basePath%>resource/css/base.css">
    <style>
        .shareLabel{
            font-size: 14px;
            color:dodgerblue!important;
        }
        .username,.creatTime{
            float: right;
            font-size: 14px;
            margin-left:8px;
        }
    </style>
</head>
<body>
<div style="padding:0 10px;font-size: 16px;">
    <h1 class="c_Title">${share.title}</h1>
    <div><span class="shareLabel">${share.label.label1String}&nbsp;&nbsp;.&nbsp;&nbsp;${share.label.label2}</span></span><span class="creatTime"><fmt:formatDate value="${share.creatTime}" type="both" /></span><span class="username">${share.username}</span></div>
    <div style="margin-bottom:10px;margin-top:10px;">${share.content}</div>
</div>
</body>
</html>
