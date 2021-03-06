<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title><decorator:title default="Master-Layout" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap styles -->
<link href=" <c:url value="/assets/user/css/bootstrap.css"/>"
	rel="stylesheet" />
<!-- Customize styles -->
<link href=" <c:url value="/assets/user/style.css"/>" rel="stylesheet" />
<!-- font awesome styles -->
<link
	href="<c:url value="assets/user/font-awesome/css/font-awesome.css"/>"
	rel="stylesheet">


<!-- Favicons -->
<link rel="shortcut icon"
	href="<c:url value="asset/user/ico/favicon.ico"/>">
</head>
<decorator:head/>
<body>
	<!-- 
	Upper Header Section 
-->
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="topNav">
			<div class="container">
				<div class="alignR">

					<a class="active" href='<c:url value="/trang-chu"/>'> <span class="icon-home"></span>
						Trang chủ
					</a> <a href="#"><span class="icon-user"></span> Tài Khoản</a> <a
						href="register.html"><span class="icon-edit"></span> Đăng Ký </a>
					<a href="contact.html"><span class="icon-envelope"></span>
						Liên Hệ</a>
						 <a href='<c:url value="/list-cart"/>'><span
						class="icon-shopping-cart"></span> ${Totalquanty} Item(s) - <span
						class="badge badge-warning"><fmt:formatNumber
													type="number" groupingUsed="true"
													value=" ${TotalPrice}" />₫</span></a> 
				</div>
			</div>
		</div>
	</div>

	<!--
Lower Header Section 
-->
	<div class="container">
		<div id="gototop"></div>

		<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>
		
		<decorator:body />
		
		<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>
		


		<div class="copyright">
			<div class="container">
				<p class="pull-right">
					<a href="#"><img src="assets/user/img/maestro.png"
						alt="payment"></a> <a href="#"><img
						src="assets/user/img/mc.png" alt="payment"></a> <a href="#"><img
						src="assets/user/img/pp.png" alt="payment"></a> <a href="#"><img
						src="assets/user/img/visa.png" alt="payment"></a> <a href="#"><img
						src="assets/user/img/disc.png" alt="payment"></a>
				</p>
				<span>Copyright &copy; 2013<br> bootstrap ecommerce
					shopping template
				</span>
			</div>
		</div>
		<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="assets/user/js/jquery.js"></script>
		<script src="assets/user/js/bootstrap.min.js"></script>
		<script src="assets/user/js/jquery.easing-1.3.min.js"></script>
		<script src="assets/user/js/jquery.scrollTo-1.4.3.1-min.js"></script>
		<script src="assets/user/js/shop.js"></script>
</body>
</html>