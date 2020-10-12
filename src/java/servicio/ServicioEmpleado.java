/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import negocio.Empleado;

/**
 *
 * @author ander
 */
public interface ServicioEmpleado {
    
    public Empleado validarEmpleado(String usu,String pas);
    public String grabarEmpleado(String cod,String nom,String usu,String pas);
    public Empleado buscarEmpleado(String cod);
    public String actualizarEmpleado(String cod , String pas);
    
}
