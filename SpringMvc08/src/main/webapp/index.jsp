<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="static/js/jquery-1.8.3.js"></script>
</head>
<body>
<h2>Hello World!</h2>

<a href="custHandleException/checkException1?divnum=2">除法1</a>
<br/>

<a href="custHandleException/checkException1?divnum=0">除法2</a>
<br/>

<a href="custHandleException/checkException2">空指针</a>
<br/>





<a href="otherHandleException/checkException1?divnum=0">除法2</a>
<br/>

<a href="otherHandleException/checkException2">空指针</a>
<br/>


<form action="user/save" method="post">

    id:<input type="text" name="id"/><br/>
    name:<input type="text" name="name"/> <br/>

    <input type="submit" value="添加用户"/>

</form>

</body>
</html>
