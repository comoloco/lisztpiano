<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트피아노-회원가입</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: #474e5d;
  padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
 
/* The Close Button (x) */
.close {
  position: absolute;
  right: 35px;
  top: 15px;
  font-size: 40px;
  font-weight: bold;
  color: #f1f1f1;
}

.close:hover,
.close:focus {
  color: #f44336;
  cursor: pointer;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
.container{
text-align: center;
    width: 30%;
    margin-left: 35%;
    border: 1px solid #ccc;
}
</style>
<script type="text/javascript" >
	$(document).on('click', '#btnSignup', function(e) {
		e.preventDefault();
		$("#form").submit();
	});
	
</script>
</head>

<article>
<%-- <%@ include file="../main/header.jsp" %> --%>
	<div class="container col-md-6" role="main">
		<div class="card">
			<div class="card-header">가입</div>
			<div class="card-body">
				<form:form name="form" id="form" class="form-signup" role="form"
					modelAttribute="userVO" method="post"
					action="/user/insertUser">
					<div class="form-group row">
						<label for="uid" class="col-md-3 col-form-label text-md-right">아이디</label>
						<div class="col-md-5">
							<form:input path="uid" id="uid" class="form-control"
								placeholder="아이디을 입력해 주세요" />
						</div>
					</div>
					<div class="form-group row">
						<label for="name" class="col-md-3 col-form-label text-md-right">이름</label>
						<div class="col-md-5">
							<form:input path="name" id="name" class="form-control"
								placeholder="이름을 입력해 주세요" />
						</div>
					</div>
					<div class="form-group row">
						<label for="pwd" class="col-md-3 col-form-label text-md-right">비밀번호</label>
						<div class="col-md-5">
							<form:password path="pwd" id="pwd" class="form-control"
								placeholder="비밀번호를 입력해 주세요" />
						</div>
					</div>
					<div class="form-group row">
						<label for="re_pwd" class="col-md-3 col-form-label text-md-right">비밀번호
							확인</label>
						<div class="col-md-5">
							<form:password path="re_pwd" id="re_pwd" class="form-control"
								placeholder="비밀번호를 입력해 주세요" />
						</div>
					</div>
					<div class="form-group row">
						<label for="email" class="col-md-3 col-form-label text-md-right">이메일</label>
						<div class="input-group col-md-7">
							<div class="input-group-prepend">
								<span class="input-group-text">@</span>
							</div>
							<form:input path="email" id="email" class="form-control"
								placeholder="이메일을 입력해 주세요" />
						</div>
					</div>
				</form:form>
			</div>
		</div>
		<div style="margin-top: 10px">
			<button type="button" class="btn btn-sm btn-primary" id="btnSignup">회원가입</button>
			<button type="button" class="btn btn-sm btn-primary" id="btnCancel" onclick="history.back()">취소</button>
		</div>
	</div>
	<%--  <jsp:include page="../main/footer.jsp" flush="true"/> --%>
</article>

