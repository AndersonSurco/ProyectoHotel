<%-- 
    Document   : Catalogo
    Created on : 24-oct-2020, 19:31:16
    Author     : ander
--%>

<%@page import="presentacion.ModeloReserva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Habitaciones</h1>
        <% ModeloReserva mr = (ModeloReserva)session.getAttribute("sesRes"); %>
            <table>
                <tr>
                    <td>Codigo</td>
                    <td>Tipo</td>
                    <td>Estado</td>
                    <td>Precio</td>
                    <td>Fecha Inicio</td>
                    <td>Fecha Fin</td>
                    <td></td>
                </tr>
                <% for (int i = 1; i < mr.getListHab().size(); i++) { %>
                <% Object[] f = (Object[])mr.getListHab().get(i); %>
                <tr>
                    <form action="ControlReserva" method="Post">
                    <td><input type="text" name="cod" size="5" value='<%= f[0] %>'/></td>
                    <td><input type="text" name="tip"size="15" value='<%= f[1] %>'/></td>
                    <td><input type="text" name="est"size="5"  value='<%= f[2] %>'/></td>
                    <td><input type="text" name="pre" size="5" value='<%= f[3] %>'/></td>
                    <td><input type="text" name="fecIni" size="5" value=""/></td>
                    <td><input type="text" name="fecFin" size="5" value=""/></td>
                    <td><input type="submit" name="acc" value="Agregar"/></td>
                    <td></td>
                    </form>
                </tr>
                <% } %>
            </table>
        
    </body>
</html>
