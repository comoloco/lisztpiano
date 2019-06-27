<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트피아노-게시글 작성</title>

<link rel="stylesheet" type="text/css"
	href="/resources/css/common/common.css" />

<!-- 공통 JavaScript -->
<script type="text/javascript" src="/resources/js/common/jquery.js"></script>
<script type="text/javascript" src="/resources/js/common/jquery.form.js"></script>
<!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script> 
 --> <!--    <script src="http://malsup.github.com/jquery.form.js"></script>  -->
<script type="text/javascript">

jQuery(document).ready(function(){
	
});

	function goBoardList(){
		location.href="/news/boardList";
	}
	
	function insertBoard(){
		
		var boardSubject =jQuery("#board_subject").val();
		var boardContent =jQuery("#board_content").val();
		
		if(boardSubject ==""){
			alert("제목을 입력해주세요.");
			jQuery("#board_subject").focus();
			return;
		}
		if(boardContent==""){
			alert("내용을 입력해주세요.");
			jQuery("#board_content").focus();
			return;
		}
		
		var yn=confirm("게시글을 등록하시겠습니까?");
		if(yn){
			var filesChk =$("input[name='files[0]']").val();
			if(filesChk==""){
				$("input[name='files[0]']").remove();
			}
			
			jQuery("#boardForm").ajaxForm({
			
				url:"/news/insertBoard",
				enctype:"multipart/form-data",
				cache:false,
				async:true,
				type:"POST",
				success: function(obj){
					insertBoardCallback(obj);
				},
				error:function(xhr, status, error){}
				
			}).submit();	
		}
	}
	
	function insertBoardCallback(obj){
		
		if(obj!=null){
			
			var result=obj.result;
			
			if(result=="SUCCESS"){
				alert("게시글 등록을 성공하였습니다.");
				goBoardList();
			}else{
				alert("게시글 등록을 실패하였습니다.");
				return;
			}
		}
	}



</script>
</head>
<body>
	<div id="wrap">
	 <%-- <%@ include file="../main/header.jsp"%> --%>
		<div id="container">
			<div class="inner">
				<h2>게시글 작성</h2>
				<form id="boardForm" name="boardForm" action="/news/insertBoard" enctype="multipart/form-data" method="post" onsubmit="return false;">
					<table width="100%" class="table02">
						<caption>
							<strong><span class="t_red">*</span>표시는 필수 입력 항목입니다.</strong>
						</caption>
						<colgroup>
							<col width="20%">
							<col width="*">
						</colgroup>

						<tbody id="tbody">
							<tr>
								<th>제목<span class="t_red">*</span></th>
								<td><input id="board_subject" name="board_subject" value=""
									class="tbox01" /></td>
							</tr>
							<tr>
								<th>작성자<span class="t_red">*</span></th>
								<td><input id="board_writer" name="board_writer" value="${member.uid}"
									readOnly class="tbox01" /></td>
							</tr>
							<tr>
								<th>내용<span class="t_red">*</span></th>
								<td><textarea id="board_content" name="board_content"
										cols="10" rows="5" class="textarea01"></textarea></td>
							</tr>
							<tr>
							<th scope="row">첨부파일</th>
							<td><input type="file" id="files[0]" name="files[0]" value=""></td></tr>
						</tbody>
					</table>
				</form>
				<div class="btn_right mt15">
					<button type="button" class="btn black mr5" onclick="javascript:goBoardList();">목록으로</button>
					<button type="button" class="btn black" onclick="javascript:insertBoard();">등록하기</button>
				</div>
			</div>
		</div>
		<%-- <%@ include file="../main/footer.jsp"%> --%> 	
	</div>
</body>
</html>