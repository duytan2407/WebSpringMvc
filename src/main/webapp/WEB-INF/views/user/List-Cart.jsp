<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page isELIgnored="false"%>
<head>
<title>Insert title here</title>
</head>
<body>
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Home</a> <span class="divider">/</span></li>
				<li class="active">Giỏ Hàng</li>
			</ul>
			<div class="well well-small">
				<h1>
					Giỏ Hàng <small class="pull-right"> 2 Items are in the cart
					</small>
				</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Sản Phẩm</th>
							<th>Tên</th>
							<th>Ref.</th>
							<th>.</th>
							<th>Giá Tiền</th>
							<th>Số Lượng</th>
							<th>Tổng Giá</th>
						</tr>
					</thead>
					<tbody>
						
							<c:forEach var="item" items="${Cart}">
								<tr>
							<td><img width="100" src="<c:url value="assets/user/img/${item.value.product.image}"/>" alt=""></td>
							<td>${item.value.product.name}</td>
							<td>-</td>
							<td><span class="shopBtn"><span class="icon-ok"></span></span>
							</td>
							<td><fmt:formatNumber
											type="number" groupingUsed="true"
											value="${item.value.total}" />₫</td>
							
							<td><input type="number" min="0" max="10" class="span1"
								style="max-width: 34px" placeholder="1"
								id="appendedInputButtons" size="16" type="text" value="${item.value.quanty}">
								<div class="input-append">
								
									<a href="<c:url value="/Deletecart/${item.key}"/>"
										class="btn btn-mini btn-danger" type="button"> <span
										class="icon-remove"></span>
									</a>
								</div></td>
								<td><fmt:formatNumber
											type="number" groupingUsed="true"
											value="${item.value.total}"/>₫</td>
						</tr>
						</c:forEach>
							
			


						
					

						<tr>
							<td colspan="6" class="alignR">${TotalPrice}</td>
							<td><fmt:formatNumber
											type="number" groupingUsed="true"
											value="${TotalPrice}"/>đ</td>
						</tr>


					</tbody>
				</table>
				<br /> <a href="<c:url value="/trang-chu"/>" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Mua Tiếp Thôi </a> <a href="login.html"
					class="shopBtn btn-large pull-right">Thanh Toán<span
					class="icon-arrow-right"></span></a>

			</div>
		</div>
	</div>
</body>
