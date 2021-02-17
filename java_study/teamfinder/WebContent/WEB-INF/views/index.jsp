<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

		<title>구해줘 팀즈</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="assets/css/main.css" />
		
</head>
<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<a class="logo" href="index">구해줘 팀즈</a>
	<c:choose>	
		<c:when test="${sessionScope.loginCheck eq true}">
        ${sessionScope.id} 님이 로그인 되었습니다. 
        <input type="button" value="로그아웃" onclick="location.href='./user/logout.do'">
		</c:when>
		 <c:otherwise>
			<nav>
				<a href="#menu">로그인</a>
			</nav>
		 </c:otherwise>
	</c:choose>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="index">Home</a></li>
					<li><a href="user/login">로그인</a></li>
					<li><a href="user/signup">회원가입</a></li>
				</ul>
			</nav>

		<!-- Banner -->
			<section id="banner">
				<div class="inner">
					<h1>구해줘 팀즈</h1>
					<p>새로 시작할 사이드 프로젝트의 팀 또는 팀원을 찾으시나요?<br />
					</p>
				</div>
				<video autoplay loop muted playsinline src="images/banner.mp4"></video>
			</section>

		<!-- Highlights -->
			<section class="wrapper">
				<div class="inner">
					<header class="special">
						<a href="#" class="button primary1">팀원 구하기</a>
						<a href="#" class="button secondary">팀 찾기</a>
					</header>
					<div class="highlights">
						<section>
							<div class="content">
								<header>
									<a href="#" class="icon fa-vcard-o"><span class="label">Icon</span></a>
									<h3>10년차 프로젝트 매니저 JAVA,Python,C++...</h3>
								</header>
								<p>저희 팀은 Java 활용자를 구하고 있습니다. Spring 경험이 있으신 분도 구하고 있습니다.</p>
							</div>
						</section>
						<section>
							<div class="content">
								<header>
									<a href="#" class="icon fa-files-o"><span class="label">Icon</span></a>
								<h3>10년차 프로젝트 매니저 JAVA,Python,C++...</h3>
								</header>
								<p>저희 팀은 Java 활용자를 구하고 있습니다. Spring 경험이 있으신 분도 구하고 있습니다.</p>
							</div>
						</section>
						<section>
							<div class="content">
								<header>
									<a href="#" class="icon fa-floppy-o"><span class="label">Icon</span></a>
									<h3>10년차 프로젝트 매니저 JAVA,Python,C++...</h3>
								</header>
								<p>저희 팀은 Java 활용자를 구하고 있습니다. Spring 경험이 있으신 분도 구하고 있습니다. </p>
							</div>
						</section>
						<section>
							<div class="content">
								<header>
									<a href="#" class="icon fa-line-chart"><span class="label">Icon</span></a>
									<h3>반응형 웹사이트 개발 프로젝트 참여하고 싶습니다.</h3>
								</header>
								<p>Java를 활용한 반응형 웹사이트 관련 멀티캠퍼스 강의 수강한 경험이 있습니다. ...</p>
							</div>
						</section>
						<section>
							<div class="content">
								<header>
									<a href="#" class="icon fa-paper-plane-o"><span class="label">Icon</span></a>
										<h3>반응형 웹사이트 개발 프로젝트 참여하고 싶습니다.</h3>
								</header>
								<p>Java를 활용한 반응형 웹사이트 관련 멀티캠퍼스 강의 수강한 경험이 있습니다. ...</p>
							</div>
						</section>
						<section>
							<div class="content">
								<header>
									<a href="#" class="icon fa-qrcode"><span class="label">Icon</span></a>
										<h3>반응형 웹사이트 개발 프로젝트 참여하고 싶습니다.</h3>
								</header>
								<p>Java를 활용한 반응형 웹사이트 관련 멀티캠퍼스 강의 수강한 경험이 있습니다. ...</p>
							</div>
						</section>
					</div>
				</div>
			</section>

<!-- 
CTA, Testi, footer비움
 -->
		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>