<%-- 
    Document   : Acceso
    Created on : 20-sep-2020, 23:12:53
    Author     : ander
--%>

<%@page import="presentacion.ModeloEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" >
    <!-- Custom styles for this template -->
    <link href="css/cover.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">
    <title>Hello, world!</title>
  </head>
  <body class="text-center">

    <div class="login">
        <h2>Acceso al Sistema</h2>
        <% ModeloEmpleado modEmp=(ModeloEmpleado)session.getAttribute("sesEmp"); %>
        <form action="ControlAcceso" method="Post">
            <input type="text" name="usu" placeholder="Usuario" required="required" />
            <input type="password" name="pas" placeholder="Contraseña" required="required" />
            <input type="submit" name="acc" value="Iniciar Sesion" class="btn btn-primary btn-block btn-large"/>
            <%= modEmp.getMsg() %>  
        </form>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
