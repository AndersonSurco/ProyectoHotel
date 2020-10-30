
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Empleado;
import servicio.ServicioEmpleado;
import servicio.ServicioEmpleadoImp;

/**
 *
 * @author ander
 */
@WebServlet(name = "ControlEmpleado", urlPatterns = {"/ControlEmpleado"})
public class ControlEmpleado extends HttpServlet {
    private ModeloEmpleado modEmp;
    private ServicioEmpleado serEmp;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acc = request.getParameter("acc");
        if(acc.equals("Nuevo Empleado")){
            modEmp = new ModeloEmpleado();
            serEmp = new ServicioEmpleadoImp();
            request.getSession().setAttribute("sesEmp",modEmp);
        }else if(acc.equals("Grabar")){
            String cod = request.getParameter("cod");
            String nom = request.getParameter("nom");
            String usu = request.getParameter("usu");
            String pas = request.getParameter("pas");
            String msg = serEmp.grabarEmpleado(cod, nom, usu, pas);
            modEmp.setMsg(msg);
        }else if(acc.equals("Buscar")){
            String cod = request.getParameter("cod");
            Empleado emp = serEmp.buscarEmpleado(cod);
            if(emp!=null){
                modEmp.setCod(emp.getCod());
                modEmp.setNom(emp.getNom());
                modEmp.setUsu(emp.getUsu());
                modEmp.setPas(emp.getPas());
            }else{
                modEmp.setMsg("No existe el empleado");
            }
        }else if(acc.equals("Actualizar")){
            String cod = request.getParameter("cod");
            String pas = request.getParameter("pas");
            String msg = serEmp.actualizarEmpleado(cod, pas);
            modEmp.setMsg(msg);
        }
        response.sendRedirect("VistaEmpleado.jsp");
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
