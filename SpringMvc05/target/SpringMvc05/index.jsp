<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="restfulAction/checkRestful" method="post" name="form1">
    username: <input type="text" name="username"/>
    <br>
    password: <input type="password" name="password"/>
    <br>
    email: <input type="text" name="email"/>
    <br>
    age: <input type="text" name="age"/>
    <br>
    city: <input type="text" name="address.city"/>
    <br>
    province: <input type="text" name="address.province"/>
    <br>
    <input type="submit" value="测试 Restful 添加Submit"/>
</form>


<a href="restfulAction/checkRestful/1">测试restful get请求 查询</a><br/>



<form action="restfulAction/checkRestful/1" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="测试Restful PUT 修改"/>
</form>
<br>



<form action="restfulAction/checkRestful/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="测试Restful DELETE 删除"/>
</form>

<br/>


<a href="antAction/abc/createStudent">测试ant风格1</a><br/>
<a href="antAction/xyz/createStudent">测试ant风格1a</a>
<br>



<a href="antAction/abc/createStudent1">测试ant风格2</a>
<br/>
<a href="antAction/xyz/abc/createStudent1">测试ant风格2a</a>
<br/>
<a href="antAction/createStudent1">测试ant风格2b</a>
<br>



<a href="antAction/createStudent2ab">测试ant风格3</a>
<br/>
<a href="antAction/createStudent2xy">测试ant风格3a</a>
<br/>
<a href="antAction/createStudent2xyz">测试ant风格3b</a>

</body>
</html>