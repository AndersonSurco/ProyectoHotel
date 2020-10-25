
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
@WebServlet(name = "ControlAcceso", urlPatterns = {"/ControlAcceso"})
public class ControlAcceso extends HttpServlet {
    private ModeloEmpleado modEmp;
    private ServicioEmpleado serEmp;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc = request.getParameter("acc");
        if(acc.equals("Ingresar")){
            modEmp = new ModeloEmpleado();
            serEmp = new ServicioEmpleadoImp();
            request.getSession().setAttribute("sesEmp",modEmp);
            response.sendRedirect("Acceso.jsp");
        }else if(acc.equals("Iniciar Sesion")){
            String usu = request.getParameter("usu");
            String pas = request.getParameter("pas");
            Empleado emp =serEmp.validarEmpleado(usu, pas);
            if(emp != null){
                modEmp.setCod(emp.getCod());
                modEmp.setNom(emp.getNom());
                response.sendRedirect("Menu.jsp");
            }else{
                modEmp.setMsg("Credenciales Incorrectas");
                response.sendRedirect("Acceso.jsp");
            }
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
