<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Liszt Main</title>
<style>
* { box-sizing:border-box; }

body{ margin:0; background:white; }
ul {
    height:20em;  width:100%; text-aling:center;
  margin:5em auto;  padding:3em 0 0 600px;  position:relative; 
 /*  border:1px solid #160801; */ border-radius:1em; 
  /* background:-webkit-gradient(linear, right bottom, left top, color-stop(0%,rgba(0,0,0,0.3)), color-stop(100%,rgba(0,0,0,0))), url('https://f.cl.ly/items/2q1f3t0C3R1b0g081w3n/vwood.png');
box-shadow:0 0 50px rgba(0,0,0,0.5) inset, 0 1px rgba(212,152,125,0.2) inset,0 5px 15px rgba(0,0,0,0.5); */ }
li { display:inline-block; margin:0; padding:0; list-style:none; position:relative; float:left; }

ul .white {
    height:20em; width:6.5em; z-index:1;
    border-left:1px solid #bbb;
    border-bottom:1px solid #bbb;
    border-radius:0 0 5px 5px;
    box-shadow:-1px 0 0 rgba(255,255,255,0.8) inset, 0 0 5px #ccc inset, 0 0 3px rgba(0,0,0,0.2);
    background: linear-gradient(top, #eee 0%,#fff 100%);
}
.white:hover {
    border-top:1px solid #777;
    border-left:1px solid #999;
    border-bottom:1px solid #999;
    box-shadow:2px 0 3px rgba(0,0,0,0.1) inset, -5px 5px 20px rgba(0,0,0,0.2) inset,0 0 3px rgba(0,0,0,0.2);
    background: linear-gradient(top, #fff 0%,#e9e9e9 100%);
}

ul .white:active {
    border-top:1px solid #777;
    border-left:1px solid #999;
    border-bottom:1px solid #999;
    box-shadow:2px 0 3px rgba(0,0,0,0.1) inset, -5px 5px 20px rgba(0,0,0,0.2) inset,0 0 3px rgba(0,0,0,0.2);
    background: linear-gradient(top, #fff 0%,#e9e9e9 100%);
}

.black {
    height:10em; width:4.5em; margin:0 0 0 -1em; z-index:2;
    border:1px solid #000;
    border-radius:0 0 3px 3px;
    box-shadow:-1px -1px 2px rgba(255,255,255,0.2) inset, 0 -5px 2px 3px rgba(0,0,0,0.6) inset, 0 2px 4px rgba(0,0,0,0.5);
    background:linear-gradient(45deg, #222 0%,#555 100%);
}
.black:hover {
    box-shadow:-1px -1px 2px rgba(255,255,255,0.2) inset, 0 -2px 2px 3px rgba(0,0,0,0.6) inset, 0 1px 2px rgba(0,0,0,0.5);
    background:linear-gradient(left, #444 0%,#222 100%);
}
.black:active {
    box-shadow:-1px -1px 2px rgba(255,255,255,0.2) inset, 0 -2px 2px 3px rgba(0,0,0,0.6) inset, 0 1px 2px rgba(0,0,0,0.5);
    background:linear-gradient(left, #444 0%,#222 100%);
}

.a,.g,.f,.d,.c { margin:0 0 0 -3.325em;  }

ul li:first-child { border-radius:5px 0 5px 5px; }
ul li:last-child { border-radius:0 5px 5px 5px; }
</style>
</head>
<body>
<h1 style="text-align:center">Liszt's Piano</h1>
<div style="position:absolute;">
<ul class="set" style="text-align:center">
    <a class="white e hover_tag" href="aboutUs"><li class="white e"><P style="color:black;padding-top:150px">학</P><P style="color:black;">원</P><P style="color:black;">소</P><P style="color:black;">개</P></li></a>
    <li class="black ds"></li>
      <a href="#" onclick="alert('로그인이 필요한 페이지 입니다.')"><li class="white d"><P style="color:black;padding-top:150px">원</P><P style="color:black;">생</P><P style="color:black;">관</P><P style="color:black;">리</P></li></a>
      <li class="black cs"></li>
      <a href="curriculum"><li class="white c"><P style="color:black;padding-top:150px">커</P><P style="color:black;">리</P><P style="color:black;">큘</P><P style="color:black;">럼</P></li></a>
 <a href="admission"> <li class="white b"><P style="color:black;padding-top:150px">수</P><P style="color:black;">강</P><P style="color:black;">신</P><P style="color:black;">청</P></li></a>
  <li class="black as"></li>
  <a href="news/boardList"><li class="white a"><P style="color:black;padding-top:150px">새</P><!-- <P style="color:black;">&nbsp;</P> --><P style="color:black;">소</P><P style="color:black;">식</P></li></a>
  <li class="black gs"></li>
  <a href="councel"><li class="white g"><P style="color:black;padding-top:150px">문</P><P style="color:black;">의</P><P style="color:black;">상</P><P style="color:black;">담</P></li></a>
  <li class="black fs"></li>
  <a href="board/boardList"><li class="white f"><P style="color:black;padding-top:150px">자</P><P style="color:black;">료</P><P style="color:black;">실</P></li></a>
</ul>
</div>
</body>
</html>