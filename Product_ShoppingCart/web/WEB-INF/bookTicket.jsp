<%--
  Created by IntelliJ IDEA.
  User: selina 
  Date: 11/16/2018
  Time: 2:46 PM
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
    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
    <script type="text/javascript" src="resource/booking.js"></script>

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
        <div class="col-sm-8 text-left" id="ticket">
            <h1>Book your Ticket</h1>
            <%--<form action="/reviewOrder" method="post">--%>
                Select Movie: <input value="${movie.name}" name="smovie" id="smovie" readonly/>
                           <br>
                Select Date: <input type="date" name="sdate" id="sdate"/> <br>
                Select Time: <input type="time" name="stime" id="stime"/>
           <br>
                Number Of Seat: <input name="nseat" id="nseat"/><br>
                <input type="button" value="Book Ticket" id="btnbook"/>
            <%--</form>--%>
            <hr>
            <%--<h3>Test</h3>--%>
            <%--<p>Lorem ipsum...</p>--%>
        </div>
        <dir id="book" class="col-sm-8 text-left"> </dir>
        <dir id="payment" class="col-sm-8 text-left"> </dir>
        <dir id="paymentrev" class="col-sm-8 text-left"> </dir>
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
    <p></p>
</footer>

</body>
</html>

