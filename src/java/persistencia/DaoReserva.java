/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import negocio.Linea;
import negocio.Reserva;

/**
 *
 * @author ander
 */
public interface DaoReserva {
    
    public String grabarReserva(Reserva res);
    public String grabarDetalle(Reserva res,Linea lin);
}
