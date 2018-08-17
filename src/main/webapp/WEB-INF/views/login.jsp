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
					<a href="" class="login">登录</a>
					<a href="register" class="register">注册</a>
				</div>
				<form  action="addlogin" name='loginForm' ng-controller="LoginController" >
					<input type="text" name="userName" ng-minlength='6'
						ng-maxlength='12' required="required"
						 ng-model="userName" id="user"  placeholder="请输入账号"/>
					<div class="errorText" ng-messages='loginForm.userName.$error' ng-if='loginForm.userName.$touched'>
					    <div ng-message="minlength">用户名最小长度为6</div>
                   		<div ng-message="maxlength">用户名最大长度为12</div>
                    	<div ng-message="required">用户名必须填写</div>
					</div>
					<input type="password" name="userPwd" id="pasword1" placeholder="请输入密码" 
						ng-model="userPwd" required='required' ng-maxlength='20' ng-minlength='8'/>
					<div class="errorText" ng-messages='loginForm.userPwd.$error' ng-if='loginForm.userPwd.$touched'>
					    <div ng-message="minlength">密码最小长度为8</div>
                   		<div ng-message="maxlength">密码最大长度为20</div>
                    	<div ng-message="required">密码必须填写</div>
					</div>	
					<!--<input type="text" name="" id="tex" value=""  placeholder="请输入手机号码"/>-->
					<!--<input type="button" id="mobie" value="获取手机验证码" />
					<input type="text" name="mtex" id="mtex" value="" placeholder="请输入手机验证码" />-->
					<div class="lik">
						<input type="checkbox" name="" id="forget" value="" />
						<a href="#" class="zi" id="">七天内自动登录</a>
						<!--<a href="#">忘记密码</a>-->
					</div>
					<button type="submit"  value="登录" name="登录">登录</button>
				</form>
			</div>
		</div>
</body>
</html>