<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件上传</title>
</head>
<body>
<center>
  <h1>文件上传</h1>
  <form action="upload" method="post" enctype="multipart/form-data">
  文件:<input type="file" name="pic"/><br/>
  <input type="submit" value="上传"/>
  </form>
</center>
</body>
</html>