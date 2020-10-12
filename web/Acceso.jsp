<%-- 
    Document   : Acceso
    Created on : 20-sep-2020, 23:12:53
    Author     : ander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Acceso al sistema</h1>
        <form action="Control" method="Post">
            <table>
                <tr><td>Usuario</td><td><input type="text" name="usu" size="10"/></td></tr>
                <tr><td>Password</td><td><input type="text" name="pas" size="10"/></td></tr>
                <tr><td colspan="2"><input type="submit" name="acc" value="Iniciar Sesion"/></td></tr>
            </table>
        </form>
    </body>
</html>
