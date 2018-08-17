<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="wrap clearfix">
			<div class="left">
				<div class="top clearfix">
					<a href="login.html" class="login">登录</a>
					<a href="#" class="register">注册</a>
				</div>
				<form   action="addregister"   name='regisForm' ng-controller="RegisterController">
					<input type="text" name="userNumber" ng-pattern="/^15\d{8}$/" ng-model="userNumber" id="tex" required="required" placeholder="请输入账号"/>
<!--					<input type="button" id="mobie" value="获取手机验证码" />-->
					<div class="errorText"  ng-messages="regisForm.userNumber.$error" ng-if="regisForm.userNumber.$touched">
						<div ng-message="required">账号必须填写</div>
						<div ng-message="pattern">请输入10位学号</div>
					</div>
					
					<input type="email" name="userEmail" ng-model="userEmail" id="email" required="required"  placeholder="请输入注册邮箱"/>
					<div class="errorText" ng-messages='regisForm.userEmail.$error' ng-if='regisForm.userEmail.$touched'>
					    <div ng-message="email">邮箱格式不正确</div>
                    	<div ng-message="required">邮箱必须填写</div>
					</div>
					
					<input type="text" name="userName" ng-model="userName" required="required" ng-minlength="6" ng-maxlength="12" id="name" placeholder="请输入姓名"/>
					<div class="errorText" ng-messages='regisForm.userName.$error' ng-if='regisForm.userName.$touched'>
					    <div ng-message="minlength">姓名最小长度为2</div>
                   		<div ng-message="maxlength">姓名最大长度为10</div>
                    	<div ng-message="required">姓名必须填写</div>
					</div>
					
					<input type="password" name="userPwd" ng-model="userPwd" required="required" ng-minlength="8" ng-maxlength="20" id="password" placeholder="请输入密码"/>
					<div class="errorText" ng-messages='regisForm.userPwd.$error' ng-if='regisForm.userPwd.$touched'>
					    <div ng-message="minlength">密码最小长度为8</div>
                   		<div ng-message="maxlength">密码最大长度为20</div>
                    	<div ng-message="required">密码必须填写</div>
					</div>	
					
					<input type="password" name="pas" ng-model="pas" id="pas"  placeholder="请确认密码" ng-blur="checkRePwd()" />
					<div class="errorText" ng-show='userPwd != "undefined"'>
					    <div ng-show="pas!= userPwd">两次密码不一致或密码不符合要求</div>
					</div>
					<div class="lik">
						<input type="checkbox" name="" id="" value="" />
						<span>同意</span>
						<a href="#" class="pro">UPIC注册协议及版权申明</a>
					</div>
					<button type="submit"  value="注册" name="注册">注册</button>
				</form>
			</div>
		</div>
</body>
</html>