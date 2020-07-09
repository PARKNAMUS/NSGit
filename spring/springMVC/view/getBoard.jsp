<%@page import="park.spring.web.board.BoardVO"%>
<%@page import="park.spring.web.board.impl.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글 상세 보기</h1>
	<a href="logout.do">Logout</a><hr>
	<form action="updateBoard.do" method="post"> 
	<input type="hidden" value="${board.seq}" name="seq">
		<table border="1">
			<tr>
				<td>제목 </td>
				<td><input type="text" value="${board.title}" name="title"></td>
			</tr>
			<tr>
				<td>작성자 </td>
				<td>${board.writer}</td>
			</tr>
			<tr>
				<td>글내용</td>
				<td>
					<textarea name="content" >${board.content}</textarea>
				</td>
			</tr>
				<tr>
				<td>등록일</td>
				<td>${board.regDate}</td>
			</tr>
			<tr>
				<td>조회수 </td>
				<td>${board.cnt}</td>
			</tr>
			<tr>
				<td><input type="submit" value="글수정"></td>
			</tr>
		</table>
	</form>
	<hr>
	<a href="insertBoard.do">글등록</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${board.seq}">글삭제</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">글목록</a>
</body>
</html>