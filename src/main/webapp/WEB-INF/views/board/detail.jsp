<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include  file = "../layout/header.jsp" %>

<div class="container">

		<div>
			번 호 : <span id="id"><i>${board.id} </i></span>
			작성자 : <span><i>${board.user.username} </i></span>
		</div>
		<br/>

		<div class="form-group">
			<h3>${board.title}</h3>
		</div>
		<hr />
		<div class="form-group">
			<div>${board.content}</div>
		</div>
		<hr />

		<div class="form-group float-right">
			<button class="btn btn-secondary" onclick="history.back()">Home</button>
			<button id="btn-update" class="btn btn-warning">Modify</button>
			<button id="btn-delete" class="btn btn-danger">Delete</button>
		</div>
		<br/><br/>
</div>

<script src="/js/board.js"></script>
<%@ include  file = "../layout/footer.jsp" %>
