/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Habitacion;

/**
 *
 * @author ander
 */
public interface DaoHabitacion {
    
    public String Grabar(Habitacion hab);
    public List Listar();
    public Habitacion buscar(String cod);
    public String actualizar(Habitacion hab);
    
}
