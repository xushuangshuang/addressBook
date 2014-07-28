<%@ page import="java.util.List,com.baldur.Member"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp" %>
<%
    List<Member> list = (List<Member>)request.getAttribute("AllList");
%>
<html>
    <head>
        <title>
            list
        </title>
    </head>
    <body>
        <table>
            <h1>联系人列表</h1>
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
