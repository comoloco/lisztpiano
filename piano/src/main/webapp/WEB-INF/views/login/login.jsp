<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../main/header.jsp" flush="true" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	$(document).ready(function() {
		$("#login_btn").unbind("click").click(function(e) {
			e.preventDefault();
			fn_login();
		});
	});

	function fn_login() {
		if ($("#user_id").val().length < 1) {
			alert("아이디를 입력해주세요.");
		} else if ($("#user_pwd").val().length < 1) {
			alert("비밀번호를 입력해주세요.");
		} else {
			var comSubmit = new ComSubmit("frm");
			comSubmit.setUrl("<c:url value='/user/loginTry'/>");
			comSubmit.submit();
		}
	}
	function ComSubmit(opt_formId) {
		this.formId = gfn_isNull(opt_formId) == true ? "commonForm"
				: opt_formId;
		this.url = "";

		if (this.formId == "commonForm") {
			$("#commonForm")[0].reset();
		}

		this.setUrl = function setUrl(url) {
			this.url = url;
		};

		this.addParam = function addParam(key, value) {
			$("#" + this.formId)
					.append(
							$("<input type='hidden' name='"+key+"' id='"+key+"' value='"+value+"' >"));
		};

		this.submit = function submit() {
			var frm = $("#" + this.formId)[0];
			frm.action = this.url;
			frm.method = "post";
			frm.submit();
		}
	}
	function gfn_isNull(str) {
		if (str == null)
			return true;
		if (str == "NaN")
			return true;
		if (new String(str).valueOf() == "undefined")
			return true;
		var chkStr = new String(str);
		if (chkStr.valueOf() == "undefined")
			return true;
		if (chkStr == null)
			return true;
		if (chkStr.toString().length == 0)
			return true;
		return false;
	}
</script>
<style>
.feature.bordered{
margin-top:50px;
padding: 32px;
border: 1px solid #ccc;
}
input,.btn {

  padding: 12px;
  border: none;
  border-radius: 4px;
  margin: 5px 0;
  opacity: 0.85;
  display: inline-block;
  font-size: 17px;
  line-height: 20px;
  text-decoration: none; /* remove underline from anchors */
}

input:hover,.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>
	<div id="container">
	<div class="feature bordered">
		<form id="frm" style="margin-left:40%">
			<table class="board_list">
				<colgroup>
				</colgroup>
				<caption>로그인</caption>
				<thead>
				</thead>
				<tbody>
					<tr>
						<th scope="row">아이디</th>
						<td><input type="text" id="user_id" name="ID"></td>
					</tr>
					<tr>
						<th scope="row">비밀번호</th>
						<td><input type="password" id="user_pwd" name="PASSWORD"></td>
					</tr>
				</tbody>
			</table>
			<div class="btn_area" style="margin-left:5%">
				<a id="login_btn" class="btn">로그인</a>
				<a href="signupForm" class="btn">회원가입</a>
			</div>
		</form>
		</div>
	</div>
	<jsp:include page="../main/footer.jsp" flush="true" />
</body>
</html>