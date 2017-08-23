<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/23
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="uuAction!add" method="post" enctype="multipart/form-data">
    公文名称<input name="docname">
    上传文件<input type="file" name="docupload">

    <input type="submit" value="上传">
</form>

</body>
</html>
