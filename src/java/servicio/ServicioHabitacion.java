/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import negocio.Habitacion;

/**
 *
 * @author ander
 */
public interface ServicioHabitacion {
    
    public String grabarHabitacion(String cod,String tip,String est,String pre);
    public Habitacion buscarHabitacion(String cod);
    public String actualizarHabitacion(String cod , String est);
    
}
