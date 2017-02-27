<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
    <jsp:body>
        <c:url value="/jdbcQueryAllCustomers" var="jdbcQueryAllCustomers"/>
        <c:url value="/jdbcQueryAllGifts" var="jdbcQueryAllGifts"/>
        <c:url value="/jdbcQueryAllOrders" var="jdbcQueryAllOrders"/>

        <!-- Page Content -->
        <div class="container">

            <!-- Page Heading/Breadcrumbs -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Database
                        <small>jdbc ver.</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="index">Home</a>
                        </li>
                        <li class="active">Database</li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <!-- Content Row -->
            <div class="row">
                <!-- Sidebar Column -->
                <div class="col-md-3">
                    <div class="list-group">

                        <a href="${jdbcQueryAllCustomers}" class="list-group-item">Customers</a>
                        <a href="${jdbcQueryAllGifts}" class="list-group-item">Gifts</a>
                        <a href="${jdbcQueryAllOrders}" class="list-group-item">Orders</a>

                    </div>
                </div>
                <!-- Content Column -->
                <div class="col-md-9">


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


                </div>

            </div>
            <!-- /.row -->

            <hr>

        </div>
        <!-- /.container -->

    </jsp:body>
</page:template>

