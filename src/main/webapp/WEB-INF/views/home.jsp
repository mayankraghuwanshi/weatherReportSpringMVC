
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <title>home</title>

</head>
<body>
<div class="container" style="width: 600px; padding-top: 100px">
    <c:if test="${isError==true}">
        <p style="color: red">${errorMessage}</p>
    </c:if>
    <img src="data:image/png;base64,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" style="width: 300px;height: auto; margin : auto ; display : block;">
    <form class = "main-form" action="/com_weatherReport_war/city" method="get">
        <div class="input-group mb-3">
            <input type="text" name="city" class="form-control" placeholder="City's Name" aria-label="Recipient's username" aria-describedby="basic-addon2">
            <div class="input-group-append">
            <input type="submit"  class="form-control">
            </div>
        </div>
    </form>
    <form vclass = "main-form" action="/com_weatherReport_war/coordinate" method="get">
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text" id="">Latitude and longitude</span>
            </div>
            <input type="text" name="lat" class="form-control">
            <input type="text" name="lon" class="form-control">
            <input type="submit"  class="form-control">
        </div>
    </form>
    <div>

        <c:if test="${show==true}">
                <h1 align="center" style="color : darkgray;">${name} ${temp}</h1>
        </c:if>
    </div>
</div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>