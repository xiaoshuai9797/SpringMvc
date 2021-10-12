<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="first/checkServlet?id=10&username=pkd">测试servlet作为方法中的参数，无返回值</a>
<br/>


<a href="first/checkServlet1?id=100&username=pkd100">测试servlet作为方法中的参数，有返回值</a>
<br/>


<a href="first/checkModelAndView">测试数据模型1 modelandview</a>
<br/>

<a href="first/checkMap">测试数据模型2 map</a>
<br/>

<a href="first/checkModel">测试数据模型3 model</a>
<br/>


<a href="first/checkModelMap">测试数据模型4 modelmap</a>
<br/>



<form action="first/checkPojo" method="post" name="form2">
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



<br/>


<form action="first/checkPojoModelAttribute" method="post" name="form1">
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
<br/>


<a href="first/checkModelAtrributeMethod?id=100">测试数据@ModelAtrribute 没有返回值</a>
<br/>


</body>
</html>
