/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import negocio.Reserva;

/**
 *
 * @author ander
 */
public interface ServicioReserva {
    public Reserva nuevaReserva(String cod,String porDes);
    public void agregarHabitacion(String cod , String fecEnt,String fecSal);
    public void quitarHabitacion(String cod);
    public String grabarReserva(String est,String dni);
    public List listarHabitaciones();
}
