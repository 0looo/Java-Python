<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
상품등록 페이지입니다.<br />
<form action="prodJoinOk" method="post"
	enctype="multipart/form-data">   <!-- enctype : 파일이 있을때만 사용 --> 
<table border = 1>
	<tr><th>상품번호</th><td>
		<input text="text" name="proNum" value="${autoNum }" /></td></tr>
	<tr><th>카테고리</th><td>
		<select name= "catNum">
			<c:forEach items="${lists }" var="dto">
				<option value="${dto.catNum }">${dto.catName }</option>
			</c:forEach>
		</select>
	</td></tr>
	<tr><th>이름</th><td>
		<input text="text" name="proName"/></td></tr>
	<tr><th>가격</th><td>
		<input type="number" name="proPrice" min=0, step="1" value="0" /></td></tr>
	<tr><th>설명</th><td>
		<textarea rows="6" cols ="30" name="proInfo"></textarea>
		</td></tr>
	<tr><th>이미지</th><td>
		<input type="file" name="proImage" multiple="multiple" /></td></tr>
	<tr><th colspan="2">
		<input type="submit" value="상품등록" />
		<input type="reset" value="취소" />
		<input type="button" onclick="javascript:history,back();" value="리스트" />
		</th></tr>
</table>
</form>
</body>
</html>