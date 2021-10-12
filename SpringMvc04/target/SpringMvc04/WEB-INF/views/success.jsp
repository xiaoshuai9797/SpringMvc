<%--
  Created by IntelliJ IDEA.
  User: xs
  Date: 2021/10/11
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


111111<br/>

${student }<br/>

${student.username }<br/>

${student.address}<br/>


${student.address.province}<br/>

${student.address.city}<br/>

${username}<%--无法显示username，必须student.username，如果想要显示username，@SessionAttributes(value={"student","username"})中必须加上username,不加则不显示--%>

</body>
</html>
