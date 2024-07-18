
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>

<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">





<meta charset="UTF-8">
<title>Ground Work</title>

</head>
<body>
<!-- navbar -->
<%-- <%Connection con = ConnectionProvider.getConnection(); %>
<h1><%=con %></h1> --%>

 	<%@include file="normal_navbar.jsp"%>

	<!-- //banner -->
	<div class="container-fluid m-0 p-0 primary-background banner-background">
		<div class="jumbotron primary-background text-white">
			<div class="container">
				<h3 class="display-3">Welcome to Social Impact Incubator(Help Startup To Groww)</h3>
				<p>The objective of creating a Startup Incubator website is to provide a platform that supports and nurtures startups and projects aimed at creating positive social change. The website will facilitate connections between entrepreneurs, mentors, investors, and other stakeholders. The primary goals include:</p>
				<p>A business incubator is an organization that helps startup
					companies and individual entrepreneurs to develop their businesses
					by providing a fullscale range of services, starting with
					management training and office space, and ending with venture
					capital financing.</p>
					<p>We aim to address this issue by establishing an incubator program that provides a supportive environment for start-ups to grow and thrive. This program will offer resources such as workspace, access to funding, and networking opportunities to help entrepreneurs turn their ideas into viable businesses.</p>
				<button class="btn btn-outline-light btn-lg bg-success">
					<span class="fa fa-line-chart "></span><BR>I AM A STARTUP
				</button>
				<button class="btn btn-outline-light btn-lg bg-primary">
					<span class="fa fa-handshake-o "></span><BR>I AM AN INVESTOR
				</button>
				<a href ="Login_page.jsp"class="btn btn-outline-light btn-lg">
					<span class="fa fa-user-circle fa-spin primary-background"></span><BR>Login
				</a>
				<a href ="Register_page.jsp"class="btn btn-outline-light btn-lg">
					<span class="fa fa-user-plus fa-spin primary-background"></span><BR>Sign Up
				</a>



			</div>
		</div>


	</div>
	<!-- cards -->
	<div class="container ">
		<div class="row mb-5">
		
			<div class="col-md-4">
				<div class="card ">

					<div class="card-body primary-background text-white text-center">
						<h5 class="card-title ">Startups</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">read more</a>
					</div>




				</div>
			</div>
			<div class="col-md-4">
				<div class="card">

					<div class="card-body primary-background text-white text-center">
						<h5 class="card-title">Investors</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">read more</a>
					</div>




				</div>
			</div>
			<div class="col-md-4">
				<div class="card">

					<div class="card-body primary-background text-white text-center">
						<h5 class="card-title">partners</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">read more</a>
					</div>




				</div>
			</div>

		</div>
		
		
		<div class="row">
		
			<div class="col-md-4">
				<div class="card">

					<div class="card-body primary-background text-white text-center">
						<h5 class="card-title">Events</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">read more</a>
					</div>




				</div>
			</div>
			<div class="col-md-4">
				<div class="card">

					<div class="card-body primary-background text-white text-center">
						<h5 class="card-title">Our Program</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">read more</a>
					</div>




				</div>
			</div>
			<div class="col-md-4">
				<div class="card">

					<div class="card-body primary-background text-white text-center">
						<h5 class="card-title">Who we are</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">read more</a>
					</div>




				</div>
			</div>

		</div>


	</div>

	  



<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>



<script type="text/javascript"src="js/script.js"></script>
</body>
</html>