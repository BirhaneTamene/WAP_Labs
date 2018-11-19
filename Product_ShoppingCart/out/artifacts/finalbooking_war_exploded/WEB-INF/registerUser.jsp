<%--
  Created by IntelliJ IDEA.
  User: selina 
  Date: 11/16/2018
  Time: 2:45 PM
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
    <style>
        /* Remove the navbar's default margin-bottom and rounded borders */

    </style>
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
                <li><a href="#">book Ticket</a></li>
                <li><a href="#">My Booking</a></li>
                <li class="active"><a href="#">My Account</a></li>
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
            <p><a href="#">Link</a></p>
            <p><a href="#">Link</a></p>
            <p><a href="#">Link</a></p>
        </div>
        <div class="col-sm-8 text-left">
            <h1>Register</h1>
            <form>
                <div class="form-group">
                    <label for="email">User Name:</label>
                    <input type="text" class="form-control" id="email1">
                </div>

                <div class="form-group">
                    <label for="email">Email address:</label>
                    <input type="text" class="form-control" id="email">
                </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="text" class="form-control" id="pwd">
                </div>

                <button type="submit" class="btn btn-default">Submit</button>
            </form>
            <%--<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>--%>
            <form action="/bookticket" method="post">
           <span> Username:<input name="uname" required value="${user.name}"/> </span> <span>Mobile: <input name="mobile" required value="${user.mobile}"/></span><br>
          <span> Password: <input name="pword" required value="${user.password}"/> </span><span>Confirm Password: <input name="pwordc" required/></span> <br>
          <span>Email: <input name="email" required value="${user.email}"/></span><br>
            <fieldset> <legend> Address Details</legend>
           <span>City: <input name="city" required value="${user.address.city}"/> </span><span>Pascode: <input name="pcode" required value="${user.address.zipcode}"/></span><br>
            State: <select name="state" value="${user.address.state}" />
            <option disabled selected>state</option>
            <option> ca</option>
            <option>Iowa</option>
            </select> <br>
            Address: <textarea name="address" rows="1" cols="20" required></textarea>
            </fieldset><br>
            <input type="submit" value="Save Customer"/>
            <input type="reset" value="Reset Form">
            </form>
            <hr>
            <%--<h3>Test</h3>--%>
            <%--<p>Lorem ipsum...</p>--%>
        </div>
        <div class="col-sm-2 sidenav">
            <div class="well">
                <p>ADS</p>
            </div>
            <div class="well">
                <p>ADS</p>
            </div>
        </div>
    </div>
</div>

<footer class="container-fluid text-center">
    <p></p>
</footer>

</body>
</html>
