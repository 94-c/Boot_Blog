<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="/auth/loginProc" method="post">
		<div class="form-group">
			<label for="username">Username</label>
			 <input type="text" name="username" class="form-control" placeholder="Enter username" id="username">
		</div>

		<div class="form-group">
			<label for="password">Password:</label> 
			<input type="password" name="password" class="form-control" placeholder="Enter password" id="password">
		</div>
		<div class="form-group float-right">
			<button id="btn-login" class="btn btn-primary">login</button>
			<a href="https://kauth.kakao.com/oauth/authorize?client_id=4aba0b53045ca21c1bc18df1001d8f00&redirect_uri=http://localhost:8000/auth/kakao/callback&response_type=code">
				<img src="static/image/kakao_login_button.png" />
			</a>
		</div>
		<br><br>
	</form>
</div>
<!-- <script src="/js/login.js"></script> -->
<%@ include file="../layout/footer.jsp"%>

