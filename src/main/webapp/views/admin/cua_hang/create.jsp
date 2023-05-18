<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>SD17313 - Thêm mới Cửa hàng</title>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
    <sf:form action="/admin/cua-hang/store" method="post"
        modelAttribute="data">
        <div>
            <label>Mã</label>
            <div>
                <sf:input path="ma"/>
                <sf:errors path="ma"/>
            </div>
        </div>
        <div>
            <label>Tên</label>
            <div>
                <sf:input path="ten"/>
                <sf:errors path="ten"/>
            </div>
        </div>
        <div>
            <label>Địa chỉ</label>
            <div>
                <sf:input path="diaChi"/>
                <sf:errors path="diaChi"/>
            </div>
        </div>
        <div>
            <label>Thành phố</label>
            <div>
                <sf:input path="thanhPho"/>
                <sf:errors path="thanhPho"/>
            </div>
        </div>
        <div>
            <label>Quốc gia</label>
            <div>
                <sf:input path="quocGia"/>
                <sf:errors path="quocGia"/>
            </div>
        </div>
        <div>
            <button>Thêm mới</button>
        </div>
    </sf:form>
</body>
</html>
