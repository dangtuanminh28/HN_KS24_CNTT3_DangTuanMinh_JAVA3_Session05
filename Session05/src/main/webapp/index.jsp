<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Session04</title>
</head>
<body>
<h1><%= "Session04" %></h1>
<br/>
<a href="${pageContext.request.contextPath}/bai2/menu "
   class="list-group-item list-group-item-action"> Bài 2 </a>
<a href="${pageContext.request.contextPath}/bai3/edit/1"
   class="list-group-item list-group-item-action"> Bài 3 </a>
<%--<a href="${pageContext.request.contextPath}/bai4/list"--%>
<%--   class="list-group-item list-group-item-action"> Bài 4 </a>--%>
</body>
</html>