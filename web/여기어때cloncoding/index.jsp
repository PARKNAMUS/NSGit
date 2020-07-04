<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="style.css?ver=123">
<script type="text/javascript" src="jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="script.js?ver=124"></script>

<title>Insert title here</title>
</head>
<body>
	<div id="top" class="first" >
		<div class="second">
			<h3 class="menu" style="font-family:'궁서체'">여기어때</h3>
			<a class="menu" id="firstmenu" >내주변</a>
			<a class="menu">예약내역</a>
			<p id="more" class="menu" >더보기</p>
			<a class="menu" >로그인</a>
		</div>
		<div id="morediv" >
			<p class="morep">공지사항</p>
			<p class="morep">이벤트</p>
			<p class="morep">1:1문의</p>
			<p class="morep">자주 묻는 질문</p>
			<p class="morep">약관 및 정책</p>
		</div>
		<div class="second">
			<img src="kante.png" id="kante" class="menu2">
			<div class="menu2" id="thrid">
				<p class="menu2ch" id="maintitle">대한민국 1등 숙박앱</p>
				<p class="menu2ch" id="maintitle2"><strong>여기어때.</strong></p>
			</div>
		</div>	
		
	</div>

	<div class="first" id="middle">

		<div class="second" id="imgdiv">
		<figure class="mimgf">
			<img src="motel.png" class="mimg" id="motel">
			<figcaption ><p class="mimgt">모텔</p></figcaption>
		</figure>
		<figure class="mimgf">
			<img src="hotel.png" class="mimg" id="hotel">
			<figcaption class="mimgt"><p class="mimgt">호텔</p></figcaption>
		</figure>
		<figure class="mimgf">
			<img src="pension.png" class="mimg" id="pension">
			<figcaption ><p class="mimgt">펜션</p></figcaption>
		</figure>
		<figure class="mimgf">
			<img src="resort.png" class="mimg" id="resort">
			<figcaption ><p class="mimgt">리조트</p></figcaption>
		</figure>
		<figure class="mimgf">
			<img src="house.png" class="mimg" id="house">
			<figcaption ><p class="mimgt">게스트하우스</p></figcaption>
		</figure>
		<figure class="mimgf">
			<img src="camping.png" class="mimg" id="camping">
			<figcaption ><p class="mimgt">캠핑</p></figcaption>
		</figure>
		<figure class="mimgf">
			<img src="location.png" class="mimg" id="location">
			<figcaption ><p class="mimgt">내주변</p></figcaption>
		</figure>
		</div>

		<div class="second" id="info">
			<br><br>
			<h1>여기어때 소식</h1>
			<div class="indiv" id="indiv1">
				<div class="indiv_sub1" id="indiv1_sub1">
					<p class="intext1"><span style="font-family:'궁서체';">여기어때.</span>비즈니스</p>
				</div>
				<div class="indiv_sub2" id="indiv1_sub2">
					<p class="intext2">
					<span id="ttitle">여기어때 비즈니스</span><br>
					출장부터 복지까지<br>
					여기어때 비즈니스로 스마트하게</p>
				</div>
			</div>
			<div class="indiv" id="indiv2">
				<div class="indiv_sub1" id="indiv2_sub">
					<p class="intext1"><span style="font-family:'궁서체';">여기어때.</span>서체</p>
				</div>
				<div class="indiv_sub2">
					<p class="intext2">
					<span id="ttitle">여기어때 서체 출시</span><br>
					젊고 당당한 여기어때 잘난체<br>
					지금 다운로드 받으세요!</p>
				</div>
			</div>
		</div>
		
		<div class="third" id="advertise">
		광고
		</div>
		<h1>이벤트</h1>
		<div class="four" id="event1">
			<div id="event1_1">
				<button class="event1bt" id="ebt1">1</button>
				<button class="event1bt" id="ebt2">2</button>
				<button class="event1bt" id="ebt3">3</button>
				<button class="event1bt" id="ebt4">4</button>
			</div>
		</div>
		<div class="five" id="event2">
			<div id="event2_sub1"></div>
			<div id="event2_sub2"></div>
		</div>
		
	</div>
		<div id="middle2" style="display:inline-block;">
			<form action="#">
				<b>위치: </b><input type="text" name="location" class="textbox"><br><br><br>
				<b>인원: </b><input type="text" name="number" class="textbox"><br><br><br>
				<b>체크인: &nbsp;&nbsp;&nbsp;</b><input type="date" name="checkin" class="datebox" id="checkin"  max=""><br><br><br>
				<b>체크아웃: </b><input type="date" name="checkout" class="datebox" id="checkout" min="2020-06-20"><br><br><br>
				<input type="submit" value="선택" class="buttonbox">&nbsp;
				<input type="reset" value="초기화" class="buttonbox">			 
			</form>
		</div>
	<div class="first" id="bottom" >
		<div class="second">
			회사소개  | 이용약관 | 개인정보처리방침 |사업자 정보확인 | 여기어때 마케팅센터 | 액티비티 호스트센터 | HOTEL 여기어때 |콘텐츠산업진흥법에의한 표시<br>
			<br>
			고객행복센터 1670-6250 오전 9시 - 새벽 3시, 점심시간: 오후 12시 - 오후 1시<br><br> 
			(주) 여기어때컴퍼니<br><br>
			주소 : 서울특별시 강남구 봉은사로 479, 479타워 11층<br>
			대표이사 : 박남수 | 사업자등록번호: 742-86-00224<br>
			통신판매번호 : 2017-서울강남-01779 | 관광사업자 등록번호: 제1026-24호<br>
			전화번호 : 1670-6250<br>
			전자우편주소 : skatn7979@gmail.com<br>
			Copyright GC COMPANY Corp. All rights reserved.<br>
			<hr id="bline">
			<img src="face.png" id="blogo">
			<img src="insta.png" id="blogo">		
		</div>
	</div>
</body>
<script type="text/javascript">

</script>
</html>