<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>git status
<jsp:forward page="/emps"></jsp:forward>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>hello</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <!-- web路径：不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
     以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名
	 http://localhost:3306/ssm_crud
    -->
    <!-- 引入jquery -->
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
    <!-- 引入样式 -->
    <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>
<button class="btn btn-primary">button按钮</button>
</body>
</html>
