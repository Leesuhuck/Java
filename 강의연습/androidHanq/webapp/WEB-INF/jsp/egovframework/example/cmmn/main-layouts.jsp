<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles"  prefix="tiles" %>

<!DOCTYPE html>
<html>
	<head>
		<tiles:insertAttribute name="head"/>
	</head>
  	<body>
 		<div id="wrap">
			<!-- header -->
			<header id="header" class="main">
			    <tiles:insertAttribute name="header"/>
			</header>
			<!--// header -->
  			<hr>
  			<section id="container" class="main">
				<!-- contents -->
				<div id="contents">
				    <!-- 컨텐츠 -->
				    <tiles:insertAttribute name="content"/>
				</div>
				<!--// contents -->
 			</section>
 			<hr>
			<footer id="footer" class="ui-tbl-row">
			    <tiles:insertAttribute name="footer"/>
			</footer>
	  		<!--// wrapper -->
  		</div>
  	</body>
</html>