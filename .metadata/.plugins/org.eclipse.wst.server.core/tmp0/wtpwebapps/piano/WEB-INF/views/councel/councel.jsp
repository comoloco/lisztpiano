<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트피아노-문의상담</title>
<style type="text/css">
@FONT-FACE {
	font-family: 'HangeulNuriR';
	src: url("/fonts/HangeulNuriR.ttf") ''
}

.councel_container {
	display: grid;
	grid-template-columns: 50% 50%;
	grid-template-rows: 100px 600px;
}

input[type=text], select {
	width: 70%;
	padding: 10px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type="text"] {
	font-family: '맑은 고딕', 'malgun', Dotum, sans-serif;
	font-size: 12px;
	color: #666;
	padding-left: 3px;
	border: 1px solid #ABADB3
}

input[type=submit] {
	width: 70%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.mailForm {
	font-size: 1.17em;
	font-weight: bold;
}

textarea {
	width: 70%;
	height: 50px;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ABADB3;
	border-radius: 4px;
	box-sizing: border-box;
}
</style>
</head>
<body>
	<div id="wrap">
		<%@include file="../main/header.jsp"  %>
		<div id="container" class="councel_container"
			style="text-align: center; margin-bottom:5%;">
			<div>
				<h3 style="text-align: center; font-size: 20px;">오시는길</h3>
			</div>
			<div>
				<h3 style="text-align: center; font-size: 20px;">상담 및 예약</h3>
			</div>
			<div id="map"
				style="margin-left: 100px;"></div>
			<div class="mailForm">
				<form name="mailForm" action="mailSending.do" method="post">
					<div align="center">
						<!-- 제목 -->
						<div>*이름</div>
						<input type="text" name="name" size="30" id="name"
							placeholder="이름" class="form-control">
					</div>
					<p>
					<div align="center">
						<!-- 내용 -->
						<div>성별</div>
						<select name="gender" size="1" id="gender" class="form-control">
							<option value="남성">남성</option>
							<option value="여성">여성</option>
							<option value="무관">무관</option>
						</select>
					</div>
					<p>
					<p>
					<div align="center">
						<!-- 내용 -->
						<div>*나이</div>
						<input type="text" name="age" size="30" id="age"
							placeholder="숫자로 입력" class="form-control">
					</div>
					<p>
					<p>
					<div align="center">
						<!-- 내용 -->
						<div>*연락처</div>
						<div>('-' 없이 번호만 입력하세요.)</div>
						<input type="text" name="tel" size="30" id="tel" placeholder="연락처"
							class="form-control">
					</div>
					<p>
					<p>
					<div align="center">
						<!-- 내용 -->
						<div>모집분야</div>
						<select name="kind" size="1" id="kind" class="form-control">
							<option value="입시반">입시반</option>
							<option value="취미반">취미반</option>
							<option value="음악치료반">음악치료반</option>
							<option value="전문반">전문반</option>
							<option value="주니어반">주니어반</option>
						</select>
					</div>
					<p>
					<p>
					<div align="center">
						<!-- 내용 -->
						<div>*상담내용</div>
						<textarea cols="30" rows="12" style="resize: none" name="cont"
							id="cont" class="form-control"></textarea>
					</div>
					<p>
					<div align="center">
						<input type="submit" onclick="mail_submit();" value="메일 보내기"
							class="btn btn-warning">
					</div>
				</form>
			</div>
		</div>
		<script type="text/javascript"
			src="//dapi.kakao.com/v2/maps/sdk.js?appkey=1a64cff5903756cd504b9c57d51b2e1b"></script>
		<script>
function mail_submit(){
	
	
	var name = document.getElementById("name");
	var name1 = document.getElementById("name").value;
	var age = document.getElementById("age").value;
	var tel = document.getElementById("tel").value;
	var cont = document.getElementById("cont").value;
	
	var age1 = document.getElementById("age");
	var tel1 = document.getElementById("tel");
	var cont1 = document.getElementById("cont");
	
	if(name1==""){
		alert("이름을 입력해주세요.");
		name.focus();
		return false;
	} else if(age==""){
		
		alert("나이를 입력해주세요.");
		age1.focus();
		return false;
	
	} else if(tel==""){
		
		alert("연락처를 입력해주세요.");
		tel1.focus();
		return false;
		
	} else if(cont==""){
		
		alert("내용을 입력해주세요.");
		cont1.focus();
		return false;
		
	} else if(name1!=""&&age!=""&&age!=""&&tel!=""&&cont!=""){
		var chk = confirm("메일을 보내시겠습니까?");
		if(chk == true){
			
			$("#mailForm").submit();
			} else{
				
				name.focus();
				return false;
				
				}
		
	}
	
}
		var mapContainer = document.getElementById('map');
		var mapOption = {
			center: new daum.maps.LatLng(37.590831, 126.905590),
			level: 2
		};

		var map = new daum.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

		// 지도를 클릭한 위치에 표출할 마커입니다
		var marker = new daum.maps.Marker({ 
		    // 지도 중심좌표에 마커를 생성합니다 
		    position: map.getCenter() 
		}); 
		// 지도에 마커를 표시합니다
		marker.setMap(map);

		// 지도에 클릭 이벤트를 등록합니다
		// 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
		daum.maps.event.addListener(map, 'click', function(mouseEvent) {        
		    
		    // 클릭한 위도, 경도 정보를 가져옵니다 
		    var latlng = mouseEvent.latLng; 
		    
		    // 마커 위치를 클릭한 위치로 옮깁니다
		    marker.setPosition(latlng);
		    
		    var message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';
		    message += '경도는 ' + latlng.getLng() + ' 입니다';
		    
		    var resultDiv = document.getElementById('clickLatlng'); 
		    resultDiv.innerHTML = message;
		});
	</script>
		<jsp:include page="../main/footer.jsp" flush="true" />
	</div>
</body>
</html>