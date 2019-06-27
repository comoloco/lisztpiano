<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css"
	href="/resources/css/common/common.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- 공통 JavaScript -->
<script type="text/javascript" src="/resources/js/common/jquery.js"></script>
<script type="text/javascript" src="/resources/js/instafeed.min.js"></script>
<!-- js 파일 로드 -->
<script type="text/javascript">
	var userFeed = new Instafeed(
			{
				get : 'user',
				userId : 14336213740,
				sortBy : "most-recent",
				limit : 9,
				template : '<a href="{{link}}" target="_blank"><img class="instafeed" style="width:95px;height:75px; padding:2px;"src="{{image}}" /></a>',
				// {{link}} : 게시물 링크, {{image}} : 사진 url, {{caption}} : 게시물 텍스트
				accessToken : '14336213740.3123c51.1be8394d1cd148e8a62035fa47c590ed'
			});
	userFeed.run();
</script>
<style>
.footer_contain {
	display: grid;
	grid-template-columns: 30% 10% 60%;
}
.fa {

  margin-top:10px;
  padding: 20px;
  font-size: 30px;
  width: 50px;
  text-align: center;
  text-decoration: none;
}

/* Add a hover effect if you want */
/* .fa:hover {
  opacity: 0.7;
} */

/* Set a specific color for each brand */
.instafeed:hover{
opacity:0.7;
}

.fa-instagram {
  background: #585858;
  color: black;
}

.copyright{
margin-left:10px;
margin-top:30px;
font-size:20px;
}
</style>
</head>
<body>
	<div class="footer">
		<div class="footer_contain">
		<div class="copyright">©2019 Produced BY 리스트 피아노 ALL RIGHTS RESERVED</div>
		<div class="fa fa-instagram"></div>
		<div id="instafeed" style="margin-top:10px;"></div>
		</div>
	</div>
</body>
</html>