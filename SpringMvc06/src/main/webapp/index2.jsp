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




<form action="uploadDownAction/checkFileUpload" method="POST" enctype="multipart/form-data">
    File: <input type="file" name="file"/>
    Desc: <input type="text" name="desc"/>
    <input type="submit" value="上传数据"/>
</form>


<br/>

<a href="uploadDownAction/checkFileDownload?filename=d1.jpg">通过 文件流 的方式下载文件d1.jpg</a>


</body>
</html>
