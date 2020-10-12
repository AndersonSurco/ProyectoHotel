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
public class DaoReservaImp implements DaoReserva{

    @Override
    public String grabarReserva(Reserva res) {
        String sql = "insert into reserva values('"+res.getNum()+"','"+res.getFec() +"','"+res.getEst() +"',"+res.getTot()+",'"+ res.getCli().getDni()+"','"+ res.getEmp().getCod()+"')";
        return operacion.ejecutar(sql);
    }

    @Override
    public String grabarDetalle(Reserva res, Linea lin) {
        String sql ="insert into detalle values ('"+res.getNum()+"','"+lin.getHab().getCod()+"','"+lin.getFecEnt()+"','"+lin.getFecSal()+"')";
        return operacion.ejecutar(sql);
    }
    
}
