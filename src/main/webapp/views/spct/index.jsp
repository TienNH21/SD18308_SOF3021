<%@page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Màu sắc</th>
        <th>Kích thước</th>
        <th>Sản phẩm</th>
        <th>Mã SPCT</th>
        <th>Số lượng</th>
        <th>Đơn giá</th>
        <th>Trạng thái</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ data }" var="spct">
    <tr>
        <td>${ spct.id }</td>
        <td>${ spct.idMS }</td>
        <td>${ spct.idKT }</td>
        <td>${ spct.tenSP }</td>
        <td>${ spct.maSPCT }</td>
        <td>${ spct.soLuong }</td>
        <td>${ spct.donGia }</td>
        <td>${ spct.trangThai == 1 ? "Dang hoat dong" : "Ngung hoat dong" }</td>
        <td>
            <a href="#">Update</a>
        </td>
        <td><a href="#">Delete</a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
