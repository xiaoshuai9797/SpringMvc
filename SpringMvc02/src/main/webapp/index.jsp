<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
<h2>Hello World!</h2>


<a href="first/checkMethod"> requestmapping 请求参数方法 get</a><br/>

<a href="first/checkParams?username=xs&height=176"> requestmapping 请求参数 </a><br/>



<a href="first/checkRequestParam?username=xs&age=22"> requestparam 请求参数 </a><br/>

<a href="first/checkRequestParam?username=xs"> requestparam 不传年龄 </a><br/>

<a href="first/checkRequestParam?age=22"> requestparam 不传名字</a><br/>



<a href="first/checkRequestParam1?username=xs&age=22&salary=12000.5"> requestparam1 请求参数 </a><br/>

<br/>


<form action="first/checkPojo" method="post" name="form2">

    id:<input type="text" name="id"/>
    <br>
    username: <input type="text" name="username"/>
    <br>
    password: <input type="password" name="password"/>
    <br>
    email: <input type="text" name="email"/>
    <br>
    age: <input type="text" name="age"/>
    <br>
    province: <input type="text" name="address.province"/>
    <br>
    city: <input type="text" name="address.city"/>

    <br>
    <input type="submit" value="Submit"/>
</form>



<br>
<a href="first/checkPojo?age=22&username=xs">测试pojo中API,get请求参数</a>
<br/>


<br/>
</body>
</html>
