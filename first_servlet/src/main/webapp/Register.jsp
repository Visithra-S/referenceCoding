<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
    <style>
      #reg {
        text-align: center;
        margin-top: 250px;
      }
    </style>
</head>
<body>
<div id="reg">
      <form class="regform" id="formId" action= "Register" method="post">
        <h3>User Registration</h3>
        <div>
          <label>UserEmailId</label>
          <input type="email" name="usermailid" id="usermailid"/>
        </div>
        <div>
          <label>UserName</label>
          <input type="text" name="uname" id="uname"/>
        </div>
        <div>
          <label>Password</label>
          <input type="password" name="psw" id=" "/>
        </div>
        <div>
          <button type="submit" >submit</button>
        </div>
      </form>
    </div>
</body>
</html>