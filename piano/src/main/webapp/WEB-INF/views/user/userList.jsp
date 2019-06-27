<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
.divTable{
	display: table;
	width: 50%;
	text-align:center;
	margin-left:auto;
	margin-right:auto;
}
.divTableRow {
	display: table-row;
}
.divTableRow1 {
	display: table-row;
	background-color:#808080;
}
.divTableHeading {
	background-color: #EEE;
	display: table-header-group;
}
.divTableCell, .divTableHead {
	border: 1px solid #999999;
	display: table-cell;
	padding: 3px 10px;
}
.divTableHeading {
	background-color: #EEE;
	display: table-header-group;
	font-weight: bold;
}
.divTableFoot {
	background-color: #EEE;
	display: table-footer-group;
	font-weight: bold;
}
.divTableBody {
	display: table-row-group;
}
</style>
<article>
	<div id="wrap">
	<jsp:include page="../main/header.jsp" flush="true"/>
	<div class="container" id="container">
		<h2 style="text-align:center;">유저정보</h2>
		<div class="" style="margin-bottom:10%;">		
			<div class="divTable" style="">
			<div class="divTableBody">
				<div class="divTableRow1">
						<div class="divTableCell">원생 ID</div>
						<div class="divTableCell">원생이름</div>
						<div class="divTableCell">EMAIL</div>
						<div class="divTableCell">과목</div>
						<div class="divTableCell">가입일</div>
						<div class="divTableCell">학원 등록일</div>
						<div class="divTableCell">진행상황</div>
						<div class="divTableCell">수정</div>
				</div>
				
					<c:choose>
						<c:when test="${!empty userList}">
							<c:forEach var="list" items="${userList}">
							
								
								<form class="divTableRow" id="myForm" name="myForm" method="post" action="../member/updateUser">
									<div class="divTableCell"><c:out value="${list.uid}" /></div>
									<div class="divTableCell"><c:out value="${list.name}" /></div>
									<div class="divTableCell"><c:out value="${list.email}" /></div>
									<div class="divTableCell">
									<select id="grade" name="grade">
									<option value="1" <c:if test="${list.grade eq 1}">selected</c:if> >입시반</option>
									<option value="2" <c:if test="${list.grade eq 2}">selected</c:if> >취미반</option>
									<option value="3" <c:if test="${list.grade eq 3}">selected</c:if>>음악치료반</option>
									<option value="4" <c:if test="${list.grade eq 4}">selected</c:if>>전문반</option>
									<option value="5" <c:if test="${list.grade eq 5}">selected</c:if>>주니어반</option>
									</select>
									</div>
									<div class="divTableCell"><c:out value="${list.reg_dt}" /></div>
									<div class="divTableCell">
									${list.start_day}
									</div>
									<div class="divTableCell">
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
									<div class="divTableCell">
									<input type="hidden" id="uid" name="uid" value="${list.uid }">
									<button type="submit" onclick="change()">수정</button>
									</div>
									</form>
								
							</c:forEach>
						</c:when>
					</c:choose>
				
				</div>
		</div>
	</div>
	<jsp:include page="../main/footer.jsp" flush="true"/>
	</div>
	</div>
</article>
<script>
function change(){
	alert("수정되었습니다.");
}
</script>
