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
import negocio.Habitacion;
import servicio.ServicioHabitacion;
import servicio.ServicioHabitacionImp;

/**
 *
 * @author ander
 */
@WebServlet(name = "ControlHabitacion", urlPatterns = {"/ControlHabitacion"})
public class ControlHabitacion extends HttpServlet {
    private ModeloHabitacion modHab;
    private ServicioHabitacion serHab;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acc = request.getParameter("acc");
        if(acc.equals("Nueva Habitacion")){
            modHab = new ModeloHabitacion();
            serHab = new ServicioHabitacionImp();
            request.getSession().setAttribute("sesHab",modHab);
        }else if(acc.equals("Grabar")){
            String cod = request.getParameter("cod");
            String tip = request.getParameter("tip");
            String est = request.getParameter("est");
            String pre = request.getParameter("pre");
            String msg = serHab.grabarHabitacion(cod, tip, est, pre);
            modHab.setMsg(msg);
        }else if(acc.equals("Buscar")){
            String cod = request.getParameter("cod");
            Habitacion hab = serHab.buscarHabitacion(cod);
            if(hab!=null){
                modHab.setCod(hab.getCod());
                modHab.setTip(hab.getTip());
                modHab.setEst(hab.getEst());
                modHab.setPre(String.valueOf(hab.getPre()));
            }else{
                modHab.setMsg("No existe la habitación");
            }
        }else if(acc.equals("Actualizar")){
            String cod = request.getParameter("cod");
            String tip = request.getParameter("tip");
            String est = request.getParameter("est");
            String pre = request.getParameter("pre");
            String msg = serHab.actualizarHabitacion(cod,tip, est,pre);
            modHab.setMsg(msg);
        }
        response.sendRedirect("VistaHabitacion.jsp");
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
