<%--
  Created by IntelliJ IDEA.
  User: ghost
  Date: 27/01/2019
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息</title>
</head>
<style>
    .operate{

    }
</style>
<body>
    <div class="operate">
        <ul>
            <li>查询</li>
            <li>增加</li>
        </ul>
    </div>
    <table>
        <thead>
            <tr>
                <td>ID</td>
                <td>name</td>
                <td>sex</td>
                <td>age</td>
                <td>update</td>
                <td>delete</td>
            </tr>
        </thead>
        <tbody id="pbody">
        </tbody>
    </table>
</body>
</html>
