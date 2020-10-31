/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Cliente;
import servicio.ServicioCliente;
import servicio.ServicioClienteImp;

/**
 *
 * @author ander
 */
@WebServlet(name = "ControlCliente", urlPatterns = {"/ControlCliente"})
public class ControlCliente extends HttpServlet {
    ModeloCliente modCli;
    ServicioCliente serCli;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc = request.getParameter("acc");
        if(acc.equals("Nuevo Cliente")){
            modCli = new ModeloCliente();
            serCli = new ServicioClienteImp();
            request.getSession().setAttribute("sesCli",modCli);
        }else if(acc.equals("Grabar")){
            String dni = request.getParameter("dni");
            String nom = request.getParameter("nom");
            String dir = request.getParameter("dir");
            String msg = serCli.grabarCliente(dni, nom, dir);
            modCli.setMsg(msg);
        }else if(acc.equals("Buscar")){
            String dni = request.getParameter("dni");
            Cliente cli = serCli.buscarCliente(dni);
            if(cli!=null){
                modCli.setDni(cli.getDni());
                modCli.setNom(cli.getNom());
                modCli.setDir(cli.getDir());
            }else{
                modCli.setMsg("No existe el cliente");
            }
        }else if(acc.equals("Actualizar")){
            String dni = request.getParameter("dni");
            String nom = request.getParameter("nom");
            String dir = request.getParameter("dir");
            String msg = serCli.actualizarCliente(dni,nom,dir);
            modCli.setMsg(msg);
        }
        response.sendRedirect("VistaCliente.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
