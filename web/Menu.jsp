<%-- 
    Document   : Menu
    Created on : 20-sep-2020, 23:13:52
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
        <h1>Menu Principal</h1>
        <% ModeloEmpleado modEmp=(ModeloEmpleado)session.getAttribute("sesEmp"); %>
        <table>
            <tr>
                <td>Codigo: <%=modEmp.getCod()%></td>
                <td>Nombre: <%=modEmp.getNom()%></td>
            </tr>
        </table>
        
        <form action="ControlEmpleado" method="Post">
            <input type="submit" name="acc" value="Nuevo"/>
        </form>
            
        <form action="ControlReserva" method="Post">
            <table>
                <tr>
                    <td><input type="submit" name="acc" value="Nueva Reserva"/></td>
                    
                </tr>
            </table>
        </form>
    </body>
</html>
