<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트피아노-수강신청</title>
<style>
* {
	box-sizing: border-box;
}

#myInput {
	background-image: url('/css/searchicon.png');
	background-position: 10px 10px;
	background-repeat: no-repeat;
	width: 100%;
	font-size: 16px;
	padding: 12px 20px 12px 40px;
	border: 1px solid #ddd;
	margin-bottom: 12px;
}

#myTable {
	border-collapse: collapse;
	width: 100%;
	border: 1px solid #ddd;
	font-size: 18px;
}

#myTable th, #myTable td {
	text-align: left;
	padding: 12px;
}

#myTable tr {
	border-bottom: 1px solid #ddd;
}

#myTable tr.header, #myTable tr:hover {
	background-color: #f1f1f1;
}
</style>
</head>
<jsp:include page="../main/header.jsp" flush="true" />
<body>

	<div id="wrap">
		<div id="container" style="margin-top:50px;">
		<input type="text" id="myInput" onkeyup="myFunction()"
			placeholder="강의명을 검색하세요.." title="Type in a name">

		<table id="myTable">
			<tr class="top">
				<th style="width: 15%;">모집부분</th>
				<th style="width: 20%;">강의명</th>
				<th style="width: 5%;">정원</th>
				<th style="width: 20%;">요일</th>
				<th style="width: 20%;">시간</th>
				<th style="width: 10%;">수강료</th>
				<th style="width: 10%;">접수</th>
			</tr>
			<tr>
				<td>입시반</td>
				<td>맞춤강의</td>
				<td>10</td>
				<td>월수금</td>
				<td>9:00 ~ 11:00</td>
				<td>상담문의</td>
				<td><button>수강신청</button></td>
			</tr>
			<tr>
				<td>취미반</td>
				<td>체르니까진 가보자</td>
				<td>10</td>
				<td>월수금</td>
				<td>12:00 ~ 2:00</td>
				<td>상담문의</td>
				<td><button>수강신청</button></td>
			</tr><tr>
				<td>음악치료반</td>
				<td>음악과 함께</td>
				<td>15</td>
				<td>화목</td>
				<td>10:00 ~ 11:00</td>
				<td>상담문의</td>
				<td><button>수강신청</button></td>
			</tr><tr>
				<td>전문반</td>
				<td>베토벤실력</td>
				<td>15</td>
				<td>월수금</td>
				<td>12:00 ~ 2:00</td>
				<td>상담문의</td>
				<td><button>수강신청</button></td>
			</tr><tr>
				<td>주니어반</td>
				<td>될 성부른 나무</td>
				<td>10</td>
				<td>월금</td>
				<td>5:00 ~ 7:00</td>
				<td>상담문의</td>
				<td><button>수강신청</button></td>
			</tr>
		</table>
		</div>
		<jsp:include page="../main/footer.jsp" flush="true" />
	</div>
	<script>
		function myFunction() {
			var input, filter, table, tr, td, i, txtValue;
			input = document.getElementById("myInput");
			filter = input.value.toUpperCase();
			table = document.getElementById("myTable");
			tr = table.getElementsByTagName("tr");
			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[0];
				if (td) {
					txtValue = td.textContent || td.innerText;
					if (txtValue.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					} else {
						tr[i].style.display = "none";
					}
				}
			}
		}
	</script>
</body>
</html>