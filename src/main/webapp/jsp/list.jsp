<%@page import="java.util.List,java.util.Map"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%
    List<Map> list = (List<Map>)getAttribute("AllList");
%>
<html>
    <head>
        <title>
            list
        <title>
    </head>
    <body>
        <table>
            <tr>
                <td>姓名</td>
                <td>职位</td>
                <td>电话</td>
                <td>VPMN</td>
                <td>家庭住址</td>
            </tr>
            <c:forEach var="member" items="${list}">
                <tr>
                    <td>{member.name}</td>
                    <td>{member.job}</td>
                    <td>{member.mobile}</td>
                    <td>{member.vpmn}</td>
                    <td>{member.homeAddress}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
