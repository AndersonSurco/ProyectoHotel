<%-- 
    Document   : VistaEmpleado
    Created on : 24-oct-2020, 17:22:02
    Author     : ander
--%>

<%@page import="presentacion.ModeloEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gestion de Empleado</h1>
        <% ModeloEmpleado modEmp=(ModeloEmpleado)session.getAttribute("sesEmp"); %>
        <form action="ControlEmpleado" method="Post">
        <table>
            <tr>
                <td>Codigo</td>
                <td><input type="text" name="cod" size="20" value='<%= modEmp.getCod() %>'/></td>
            </tr>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="nom" size="20" value='<%= modEmp.getNom() %>'/></td>
            </tr>
            <tr>
                <td>Usuario</td>
                <td><input type="text" name="usu" size="20" value='<%= modEmp.getUsu() %>'/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="text" name="pas" size="20" value='<%= modEmp.getPas() %>'/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" name="acc" value="Nuevo"/>
                    <input type="submit" name="acc" value="Grabar"/>
                    <input type="submit" name="acc" value="Buscar"/>
                    <input type="submit" name="acc" value="Actualizar"/>
                </td>
            </tr>
        </table>
        <%= modEmp.getMsg()%>
        </form>
        </body>
</html>
