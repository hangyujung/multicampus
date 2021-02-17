<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<title>구해줘 팀즈</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="assets/css/main.css" />
﻿<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
$(function(){
//아이디 중복검사 
$('#id_input').click(function(){
	
	var memberId = $('#id2').val(); // .id_input에 입력되는 값 
	alert(memberId)
	var data = {memberId : memberId} // '컨트롤에 넘길 데이터 이름' : '데이터(.id_input에 입력되는 값)' 
	$.ajax({ 
		type : "post", 
		url : "/user/memberIdChk", 
		data : data,
		success:function(result){
			console.log("성공 여부" + result);
		}
		}); // ajax 종료

	

	});// function 종료
});

</script>

</head>
<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<a class="logo" href="index">구해줘 팀즈</a>
				<nav>
					<a href="#menu">로그인/회원가입</a>
				</nav>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="../index">Home</a></li>
					<li><a href="login">로그인</a></li>
					<li><a href="signup">회원가입</a></li>
				</ul>
			</nav>

		<!-- Heading -->
			<div id="heading" >
				<h1>구해줘 팀즈</h1>
			</div>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<div class="content">
						<header>
							<h2>회원가입</h2>
						</header>
						<form action="join" method="post">
							아이디 :<br>
							<input type="text" id="id2" name="user_Id" >  <button type="button" id="id_input">중복체크</button>
							비밀번호 : <input type="password" name="user_Pwd">
							비밀번호 확인 : <input type="password" name="user_Pwd2">
							이메일 : <input type="email" name="user_Email">
							지역 : <select name="region" size="8">
								<option value="seoul">서울특별시</option>
								<option >부산광역시</option>
								<option >대구광역시</option>
								<option >인천광역시</option>
								<option >광주광역시</option>
								<option >대전광역시</option>
								<option >울산광역시</option>
								<option >세종특별자치시	</option>
								<option >경기도</option>
								<option >강원도</option>
								<option >충청북도</option>
								<option >충청남도</option>
								<option >전라북도	</option>
								<option >전라남도</option>
								<option >경상북도</option>
								<option >경상남도</option>
								<option >제주특별자치도</option>
							</select>
							<br>
							<input type="submit" id="sub" value="가입하기">
							
						</form>
					</div>
				</div>
			</section>

		<!-- footer 지움 -->

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>
			﻿

	</body>
</html>
</html>