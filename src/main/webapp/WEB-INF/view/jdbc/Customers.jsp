<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>


<page:template>
    <table class="table">
        <caption><h2>List of customers</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
        </tr>
        <c:if test="${not empty resultObject}">
            <c:forEach items="${resultObject}" var="name">
                <tr>
                    <td><c:out value="${name.idCustomer}"/></td>
                    <td><c:out value="${name.customerName}"/></td>
                    <td><c:out value="${name.description}"/></td>

                </tr>
            </c:forEach>
        </c:if>
    </table>
    <c:if test="${empty resultObject}">
        No rows
    </c:if>
</page:template>