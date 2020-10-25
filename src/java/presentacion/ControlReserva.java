
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ServicioReserva;
import servicio.ServicioReservaImp;

@WebServlet(name = "ControlReserva", urlPatterns = {"/ControlReserva"})
public class ControlReserva extends HttpServlet {

    private ModeloReserva modRes;
    private ServicioReserva serRes;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc = request.getParameter("acc");
        if(acc.equals("Nueva Reserva")){
            
            serRes= new ServicioReservaImp();
            modRes= new ModeloReserva(serRes.nuevaReserva("E001","10"));
            request.getSession().setAttribute("sesRes",modRes);
            response.sendRedirect("VistaReserva.jsp");
            
        }else if(acc.equals("Listar Habitaciones")){
            
            modRes.setListHab(serRes.listarHabitaciones());
            response.sendRedirect("Catalogo.jsp");
           
        }else if(acc.equals("Agregar")){
            String cod = request.getParameter("cod");
            String fecIni = request.getParameter("fecIni");
            String fecFin = request.getParameter("fecFin");
            serRes.agregarHabitacion(cod, fecIni,fecFin);
            response.sendRedirect("VistaReserva.jsp");
        }else if(acc.equals("Quitar")){
            String cod = request.getParameter("cod");
            serRes.quitarHabitacion(cod);
            response.sendRedirect("VistaReserva.jsp");
        }else if(acc.equals("")){
            
        }
        
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
