<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트피아노-새소식</title>

<link rel="stylesheet" type="text/css"
	href="/resources/css/common/common.css" />

<!-- 공통 JavaScript -->
<script type="text/javascript" src="/resources/js/common/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		getBoardList();
	});

	/* 게시판 - 상세 페이지 이동*/
	function goBoardDetail(boardSeq) {
		location.href = "/news/boardDetail?boardSeq=" + boardSeq;
	}

	/* 게시판 - 작성 페이지 이동*/
	function goBoardWrite() {
		location.href = "/news/boardWrite";

	}

	/* 게시판 - 목록 조회 */
	function getBoardList(currentPageNo) {

		if (currentPageNo === undefined) {
			currentPageNo = "1";
		}

		$("#current_page_no").val(currentPageNo);

		$.ajax({
			type : "POST",
			url : "/news/getBoardList",
			data : $("#boardForm").serialize(),
			dataType : "JSON",
			cache : false,
			async : true,
			success : function(obj) {
				getBoardListCallback(obj);
			},
			error : function(xhr, status, error) {
			}
		});
	}

	function getBoardListCallback(obj) {

		var state = obj.state;
		
		if(state == "SUCCESS"){
			
			var data = obj.data;			
			var list = data.list;
			var listLen = list.length;		
			var totalCount = data.totalCount;
			var pagination = data.pagination;
				
			var str = "";

		if (listLen > 0) {

			for (var a = 0; a < listLen; a++) {

				var boardSeq = list[a].board_seq;
				var boardReRef = list[a].board_re_ref;
				var boardReLev = list[a].board_re_lev;
				var boardReSeq = list[a].board_re_seq;
				var boardWriter = list[a].board_writer;
				var boardSubject = list[a].board_subject;
				var boardContent = list[a].board_content;
				var boardHits = list[a].board_hits;
				var delYn = list[a].del_yn;
				var insUserId = list[a].ins_user_id;
				var insDate = list[a].ins_date;
				var updUserId = list[a].upd_user_id;
				var updDate = list[a].upd_date;

				str += "<tr>";
				str += "<td>" + boardSeq + "</td>";
				str += "<td onclick='javascript:goBoardDetail(" + boardSeq
						+ ");' style='cursor:Pointer'>";
				if(boardReLev > 0){
					for(var b=0; b<boardReLev; b++){
						str+="▶:";
					}
					
					
				}
				str += boardSubject	+ "</td>";
				str += "<td>" + boardHits + "</td>";
				str += "<td>" + boardWriter + "</td>";
				str += "<td>" + insDate + "</td>";
				str += "</tr>";

			}

		} else {

			str += "<tr>";
			str += "<td colspan='5'>등록된 글이 존재하지 않습니다.</td>";
			str += "<tr>";
		}

		$("#tbody").html(str);
		$("#total_count").text(totalCount);
		$("#pagination").html(pagination);
	} else{
		alert("관리자에게 문의하세요.");
		return;
	}
}
</script>
</head>
<body>
	<div id="wrap">
	<jsp:include page="../main/header.jsp" flush="true"/>
		<div id="container">
			<div class="inner">
				<h2 style="text-align:center; font-size:30px;">새소식 목록</h2>
				<form id="boardForm" name="boardForm">
					<input type="hidden" id="function_name" name="function_name"
						value="getBoardList" /> <input type="hidden" id="current_page_no"
						name="current_page_no" value="1" />
					<div class="page_info">
						<span class="total_count"><strong>전체</strong> : <span
							id="total_count" class="t_red">0</span>개</span>
					</div>
					<table width="100%" class="table01">
						<colgroup>
							<col width="10%" />
							<col width="25%" />
							<col width="10%" />
							<col width="15%" />
							<col width="20%" />
						<thead>
							<tr>
								<td>글번호</td>
								<td>제목</td>
								<td>조회수</td>
								<td>작성자</td>
								<td>작성일</td>
							</tr>
						</thead>
						<tbody id="tbody">

						</tbody>

					</table>
				</form>
				<c:if test="${member != null }">
				<div class="btn_right mt15">
					<button type="button" class="btn black mr5"
						onclick="javascript:goBoardWrite();">작성하기</button>
				</div>
				</c:if>
			</div>
			<div id="pagination"></div>
		</div>
		<jsp:include page="../main/footer.jsp" flush="true"/>
	</div>
	
</body>
</html>
