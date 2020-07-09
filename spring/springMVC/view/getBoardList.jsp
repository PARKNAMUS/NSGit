<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="park.spring.web.board.impl.BoardDAO"%>
<%@page import="park.spring.web.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${id != null}">
	<h1>글목록</h1>
	<h3>테스트 회원님 환영하니다<a href="logout.do">Logout</a></h3>
<!-- 검색 시작 -->

	<form action="getBoardList.jsp" method="post">
	
		<table border="1">
			<tr>
				<td>
					<select name="searchCondition">
						<option value="title">제목</option>
						<option value="content">내용</option>
					</select>
					<input type="text" name="searchKeyword">
					<input type="submit" value="검색">
				</td>
			</tr>
		</table>
	</form><br>
<!-- 검색 종료 -->
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
	<c:forEach var="board" items="${boardList}">
		<tr>
			<td>${board.seq}</td>
			<td><a href="getBoard.do?seq=${board.seq} ">${board.title}</a></td>
			<td>${board.writer }</td>
			<td>${board.regDate} </td>
			<td>${board.cnt }</td>
		</tr>	
	</c:forEach>
	</table>
	<br>
	<a href="insertBoard.jsp">새글 작성</a>
	</c:if>
	<c:if test="${id eq null} ">
	<script type="text/javascript">
		alert("유효하지 않은 로그인")	
		location.href = "login.jsp";
	</script>
	</c:if>
</body>
</html>