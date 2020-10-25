<%-- 
    Document   : VistaPedido
    Created on : 24-oct-2020, 18:57:29
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
        <h1>Gestion de Reserva</h1>
        <% ModeloReserva mr = (ModeloReserva)session.getAttribute("sesRes"); %>
        <form action="ControlReserva" method="Post">
            <table>
                <tr>
                    <td>Numero<input type="text" size="5" value=""/></td>
                    <td>Fecha<input type="text" size="5" value=""/></td>
                    <td>Estado<input type="text" size="5" value=""/></td>
                </tr>
                <tr>
                    <td>Cliente<input type="text" size="5" value=""/></td>
                    <td>Nombre<input type="text" size="5" value=""/></td>
                    <td>Descuento<input type="text" size="5" value=""/></td>
                </tr>

            </table>
            <table>
                <tr>
                    <td>Codigo</td>
                    <td>Tipo</td>
                    <td>Precio</td>
                    <td>Dias</td>
                    <td>Importe</td>
                    <td></td>
                </tr>
                <% for (int i = 0; i < mr.getCes().size(); i++) {%>
                <% Object[] f =(Object[])mr.getCes().get(i); %>
                <tr>
                    <form action="ControlReserva" method="Post">
                    <td><input type="text" name="cod" size="5" value='<%= f[0] %>'/></td>
                    <td><input type="text" size="15" value='<%= f[1] %>'/></td>
                    <td><input type="text" size="5" value='<%= f[2] %>'/></td>
                    <td><input type="text" size="5" value='<%= f[3] %>'/></td>
                    <td><input type="text" size="5" value='<%= f[4] %>'/></td>
                    <td><input type="submit" name="acc" value="Quitar"/></td>
                    <td></td>
                    </form>
                </tr>
                <% } %>
            </table>
            <table>
                <tr>
                    <td>Sub Total <input type="text" size="5" value='<%= mr.getSubTot() %>'/></td>
                    <td>Descuento <input type="text" size="5" value='<%= mr.getDesc() %>'/></td>
                    <td>Total <input type="text" size="5" value='<%= mr.getTot() %>'/></td>
                </tr>
            </table>
            <table>
                <tr>
                    <td><input type="submit" name="acc" value="Nueva Reserva"/></td>
                    <td><input type="submit" name="acc" value="Listar Habitaciones"/></td>
                    <td><input type="submit" name="acc" value="Grabar Reserva"/></td>
                    
                </tr>
            </table>
        </form>
    </body>
</html>
