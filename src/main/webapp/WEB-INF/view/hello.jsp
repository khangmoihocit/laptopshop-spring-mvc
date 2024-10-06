<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
    <!-- Latest compiled JavaScript -->
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <link href="<c:url value='/resources/css/demo.css' />" rel="stylesheet">
    <title>Document</title>
</head>

<%--<style>--%>
<%--    .inner-text{--%>
<%--        color: green;--%>
<%--        background-color: red;--%>
<%--        width: 100px;--%>
<%--        height: 100px;--%>
<%--        padding: 20px;--%>
<%--        font-size: 20px;--%>
<%--    }--%>
<%--</style>--%>

<body>
    <div>

        <h1 class="inner-text"> ${khang} </h1>
        <h3> ${x} + 200 = 300</h3>
    </div>
    <button class="inner-btn">submit</button>

</body>
</html>