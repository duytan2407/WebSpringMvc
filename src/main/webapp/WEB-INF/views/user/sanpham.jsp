<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>

<head>
<title>Loại Sản Phẩm</title>
<style>
.pagination {
	display: flex;
	justify-content: center;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}

.pagination a:hover:not(.active) {
	background-color: #ddd;
}
</style>
</head>
<body>
	
	<div class="well well-small">
		<div class="row">
			<span style="margin-left: 25px;">Danh Sách Sản Phẩm </span> <select
				class="pull-right">
				<option>A-Z</option>
				<option>Cao-Thấp</option>
			</select>
		</div>
		<c:if test="${AllIdpro.size()> 0 }">
			<div class="row-fluid">
				<ul class="thumbnails">

					<c:forEach var="item" items="${AllIdpro}" varStatus="loop">
						<li class="span4">
							<div class="thumbnail">
								<a href="product_details.html" class="overlay"></a> <a
									class="zoomTool" href="product_details.html"
									title="add to cart"><span class="icon-search"></span>QUICK
									VIEW</a><a href="<c:url value="/chi-tiet/${item.id}"/>"><img
									src="<c:url value="/assets/user/img/${item.image}"/>" height="250px" alt=""
										></a>
								<div class="caption cntr">
									<p>${item.name}</p>
									<p>
										<strong><fmt:formatNumber
													type="number" groupingUsed="true"
													value="${item.unit_price}" />₫</strong>
									</p>
									<h4>
										<a class="shopBtn" href="#" title="add to cart"> Add to
											cart </a>
									</h4>
									<div class="actionList">
										<a class="pull-left" href="#">Add to Wish List </a> <a
											class="pull-left" href="#"> Add to Compare </a>
									</div>
									<br class="clr">
								</div>
							</div>
						</li>
						<c:if
							test="${ (loop.index + 1) % 4 == 0 || (loop.index + 1)  == AllIdpro.size() }">
				</ul>
			</div>
			<c:if test="${ (loop.index + 1) < AllIdpro.size() }">
				<div class="item">
					<ul class="thumbnails">
			</c:if>
		</c:if>
		</c:forEach>
		</c:if>
		</ul>
	</div>
	</div>
	<div class="pagination">
		<a href="#">&laquo;</a> <a href="#">1</a> <a href="#" class="active">2</a>
		<a href="#">3</a> <a href="#">4</a> <a href="#">5</a> <a href="#">6</a>
		<a href="#">&raquo;</a>
	</div>
</body>
