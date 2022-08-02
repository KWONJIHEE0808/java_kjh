<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<div class="container">
	<h6>안녕하세요. ${name} 입니다. 제 나이는 ${age}살입니다.</h6>
	<a href="/spring?hobby=운동&time=2">a태그를 이용한 데이터 전송</a>
	<form action="/spring/" class="mt-3" method="post">
		<div class="form=group">
			<input type="text" class="form-control" name="hobby" placeholder="취미">
		</div>
		<div class="form=group">
			<input type="text" class="form-control" name="time" placeholder="시간">
		</div>
		<button class="btn btn-outline-success col-12 mb-3">전송</button>
	</form>
	<a href="/spring/hobby/운동/3">경로 변수 연습링크</a>
	<script type="text/javascript">
		$(function(){
			$('form').submit(function(){
				let hobby = $('[name=hobby]').val()
				if(hobby.length == 0){
					alert('취미를 입력하세요')
					$('[name=hobby]').focus();
					return false;
				}
				
				let time = $('[name=time]').val();
				let timeRegex = /^[0-9]+$/
				if(!timeRegex.test(time)){
					alert('정수만 입력하세요');
					$('[name=time]').focus();
					return false;
				}
			})
		})
	
	
		$(function(){
			let age = '${age}';
			age = parseInt(age) + 10;
			console.log(age)
		})
	</script>
</div>
