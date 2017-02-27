<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>


<page:template>

    <jsp:attribute name="title">Connect to database</jsp:attribute>


    <jsp:body>
        <div class="container center_div">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <form class="form-signin" action="jdbc" method="post">
                        <h2 class="form-signin-heading">MySQL</h2>

                        <div class="input-group">

                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input type="text" class="form-control" placeholder="jdbc:hsqldb:mem://localhost"
                                       name="url"/>
                            </div>
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input type="text" class="form-control" placeholder="John"
                                       name="username"/>
                            </div>
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input type="text" class="form-control" placeholder="Password123"
                                       name="password"/>
                            </div>
                            </p>
                            <input type="submit" class="btn btn-lg btn-primary btn-block" value="Login"/>


                        </div>

                    </form>
                </div>
            </div>
        </div>
    </jsp:body>

</page:template>
