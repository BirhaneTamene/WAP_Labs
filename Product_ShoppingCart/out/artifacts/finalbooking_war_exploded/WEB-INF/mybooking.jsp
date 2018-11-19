<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: selina 
  Date: 11/17/2018
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="resource/register.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Logo</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li ><a href="#">Home</a></li>
                <li><a href="#">All Movies</a></li>
                <li class="active" ><a href="#">book Ticket</a></li>
                <li><a href="#">My Booking</a></li>
                <li><a href="#">My Account</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">

            <img src="">
            <%--<p><a href="#">Link</a></p>--%>
            <%--<p><a href="#">Link</a></p>--%>
            <%--<p><a href="#">Link</a></p>--%>

        </div>
        <div class="col-sm-8 text-left">
            <h> My Booking</h>
            <table style="border-color: black"> <tr><th>ID</th><th> Movie</th><th>Total Seats</th> <th>Amount</th><th>Date</th></tr>
<c:forEach items="${mybooking}" var="book">
<tr> <td> ${book.movie.movieId} </td><td>${book.movie.name} </td><td>${book.noseat}</td><td>${book.pay.amount}</td><td>${book.dateofshow}</td></tr>
</c:forEach>
            </table>
            <hr>
            <%--<h3>Test</h3>--%>
            <%--<p>Lorem ipsum...</p>--%>
        </div>
        <div class="col-sm-2 sidenav">
            <div class="well">
                <p></p>
            </div>
            <div class="well">
                <p></p>
            </div>
        </div>
    </div>
</div>

<footer class="container-fluid text-center">
    <p>Footer Text</p>
</footer>

</body>
</html>
