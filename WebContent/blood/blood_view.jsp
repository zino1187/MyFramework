<%@page import="com.myframework.movie.model.MovieManager"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
혈액형에 대한 최종 판단결과 <p>
<%=request.getAttribute("result") %>
</body>
</html>




