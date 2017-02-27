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

        <script type="text/javascript">
            function refresh(idElement) {
                   $.ajax({
                        type: 'POST',
                        url: '/' + idElement,
                        success: function (result) {
                            $('#resultDev').html(result);
                        }
                    });
            }
        </script>
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

                        <a id="jdbcQueryAllCustomers" class="list-group-item" onclick=refresh(this.id)>Customers</a>
                        <a id="jdbcQueryAllGifts" class="list-group-item" onclick=refresh(this.id)>Gifts</a>
                        <a id="jdbcQueryAllOrders" class="list-group-item" onclick=refresh(this.id)>Orders</a>

                    </div>
                </div>
                <!-- Content Column -->
                <div id="resultDev" class="col-md-9"/>

            </div>
            <!-- /.row -->

            <hr>

        </div>
        <!-- /.container -->

    </jsp:body>
</page:template>

