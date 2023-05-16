<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>SD17313 - Login</title>
</head>
<body>
<form method="post" action="/login">
    <div>
        <label>Username</label>
        <input type="text" name="username" autocomplete="off">
    </div>
    <div>
        <label>Password</label>
        <input type="password" name="password" autocomplete="off">
    </div>
    <div>
        <input type="checkbox" name="remember">
        <label>Ghi nhớ đăng nhập</label>
    </div>
    <div>
        <button>Login</button>
    </div>

</form>
</body>
</html>
