<%--
  Created by IntelliJ IDEA.
  User: kpwang
  Date: 2020/7/10
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>拦截器</h3>
    <a href="user/test?id=1">拦截器</a>
    <form action="user/fileupload?id=1" method="post" enctype="multipart/form-data">
        选择文件:<input type="file" name="upload"><br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
