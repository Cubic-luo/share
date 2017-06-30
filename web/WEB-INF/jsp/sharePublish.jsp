<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/26
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>发布新闻</title>
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
    <link rel="stylesheet" href="<%=basePath%>resource/css/base.css">
    <style>
        .loginForm {
            text-align: center;
            padding-top: 20px;
        }

        .loginForm div {
            margin-top: 10px;
        }

        .loginForm input {
            box-sizing: border-box;
            width: 80%;
            padding: 5px 8px;
            border: 1px solid #e0e0e0;
            margin-bottom: 10px;
        }

        .loginForm select {
            box-sizing: border-box;
            width: 80%;
            padding: 5px 8px;
            border: 1px solid #e0e0e0;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<form action="<%=basePath%>share/insert" class="loginForm" method="post">
    <input name="username" type="hidden" value="<sec:authentication property="principal.username"/>">
    <input name="title" type="text" placeholder="标题">
    <textarea style="resize: none;box-sizing: border-box;width: 80%;padding: 5px 8px;height: 150px;border: 1px solid
    #e0e0e0;margin-top: 20px;margin-bottom: 20px;" name="content" placeholder="分享内容"></textarea>
    <select id="label1" name="label1">
        <c:forEach var="label1" items="${labelList}">
            <option>${label1.label1}</option>
        </c:forEach>
    </select>
    <div id="label2">
        <c:forEach var="label1" items="${labelList}">
            <select  style="display: none;">
                <c:forEach items="${label1.label2}" var="label2">
                    <option  value="${label2.id}">${label2.label2}</option>
                </c:forEach>
            </select>
        </c:forEach>
    </div>
    <input class="c_submitBtn" type="submit" value="发布">
</form>
<script src="<%=basePath%>resource/js/jquery.min.js"></script>
<script>
    $("#label1").change(function () {
        var index = $("#label1").get(0).selectedIndex;
        $("#label2 select").removeAttr("name");
        $("#label2 select").eq(index).attr("name","tagId");
        $("#label2 select").eq(index).show().siblings().hide();
    })
</script>
</body>
</html>
