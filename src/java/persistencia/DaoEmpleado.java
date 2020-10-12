/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Empleado;

/**
 *
 * @author ander
 */
public interface DaoEmpleado {
    
    public String Grabar(Empleado emp);
    public List Listar();
    public Empleado buscar(String cod);
    public String actualizar(Empleado emp);
    
}
