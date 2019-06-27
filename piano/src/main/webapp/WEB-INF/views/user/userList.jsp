<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
.table
{
	display:table;
	border-collapse:separate;
	border-spacing:2px;
}
.thead
{
	display:table-header-group;
	color:white;
	font-weight:bold;
	background-color:grey;
}
.tbody
{
	display:table-row-group;
}
.tr
{
	display:table-row;
}
.td
{
	display:table-cell;
	border:1px solid black;
	padding:1px;
}
.tr.editing .td INPUT
{
	width:100px;
}
</style>
<article>
	<div id="wrap">
	<jsp:include page="../main/header.jsp" flush="true"/>
	<div class="container" id="container">
		<h2 style="text-align:center;">유저정보</h2>
		<div class="table-responsive" style="margin-bottom:10%;">		
			<div class="table ">
				<div class="thead">
					<div class="tr">
						<div class="td">원생 ID</div>
						<div class="td">원생이름</div>
						<div class="td">EMAIL</div>
						<div class="td">과목</div>
						<div class="td">가입일</div>
						<div class="td">학원 등록일</div>
						<div class="td">진행상황</div>
						<div class="td">수정</div>
					</div>
				</div>
				<div class="tbody">
					<c:choose>
						<c:when test="${empty userList }">
							<tr>
								<td colspan="5" align="center">데이터가 없습니다.</td>
							</tr>
						</c:when>
						<c:when test="${!empty userList}">
							<c:forEach var="list" items="${userList}">
								<div class="tr">
								<form id="myForm" name="myForm" method="post" action="../member/updateUser">
									<div class="td"><c:out value="${list.uid}" /></div>
									<div class="td"><c:out value="${list.name}" /></div>
									<div class="td"><c:out value="${list.email}" /></div>
									<div class="td">
									<select id="grade" name="grade">
									<option value="1" <c:if test="${list.grade eq 1}">selected</c:if> >입시반</option>
									<option value="2" <c:if test="${list.grade eq 2}">selected</c:if> >취미반</option>
									<option value="3" <c:if test="${list.grade eq 3}">selected</c:if>>음악치료반</option>
									<option value="4" <c:if test="${list.grade eq 4}">selected</c:if>>전문반</option>
									<option value="5" <c:if test="${list.grade eq 5}">selected</c:if>>주니어반</option>
									</select>
									</div>
									<div class="td"><c:out value="${list.reg_dt}" /></div>
									<div class="td">
									${list.start_day}
									</div>
									<div class="td">
									<select id="ing_status" name="ing_status">
									<option value="0" <c:if test="${list.ing_status eq 0}">selected</c:if> >0</option>
									<option value="1" <c:if test="${list.ing_status eq 1}">selected</c:if> >1</option>
									<option value="2" <c:if test="${list.ing_status eq 2}">selected</c:if>>2</option>
									<option value="3" <c:if test="${list.ing_status eq 3}">selected</c:if>>3</option>
									<option value="4" <c:if test="${list.ing_status eq 4}">selected</c:if>>4</option>
									<option value="5" <c:if test="${list.ing_status eq 5}">selected</c:if>>5</option>
									<option value="6" <c:if test="${list.ing_status eq 6}">selected</c:if>>6</option>
									<option value="7" <c:if test="${list.ing_status eq 7}">selected</c:if>>7</option>
									<option value="8" <c:if test="${list.ing_status eq 8}">selected</c:if>>8</option>
									<option value="9" <c:if test="${list.ing_status eq 9}">selected</c:if>>9</option>
									<option value="10" <c:if test="${list.ing_status eq 10}">selected</c:if>>10</option>
									</select>
									
									</div>
									<div class="td">
									<input type="hidden" id="uid" name="uid" value="${list.uid }">
									<button type="submit" onclick="change()">수정</button>
									</div>
									</form>
								</div>
							</c:forEach>
						</c:when>
					</c:choose>
				</div>
		</div>
	</div>
	<jsp:include page="../main/footer.jsp" flush="true"/>
	</div>
</article>
<script>
function change(){
	alert("수정되었습니다.");
}
</script>
