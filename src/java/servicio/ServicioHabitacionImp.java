/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import negocio.Habitacion;
import persistencia.DaoHabitacion;
import persistencia.DaoHabitacionImp;

/**
 *
 * @author ander
 */
public class ServicioHabitacionImp implements ServicioHabitacion{
    
    private DaoHabitacion daoHab;

    public ServicioHabitacionImp() {
        daoHab = new DaoHabitacionImp();
    }
    
    @Override
    public String grabarHabitacion(String cod, String tip, String est, String pre) {
        Habitacion hab = new Habitacion(cod, cod, est,Double.parseDouble(pre));
        return daoHab.Grabar(hab);
    }

    @Override
    public Habitacion buscarHabitacion(String cod) {
        return daoHab.buscar(cod);
    }

    @Override
    public String actualizarHabitacion(String cod, String est) {
        Habitacion hab = new Habitacion();
        hab.setCod(cod);
        hab.setEst(est);
        return daoHab.actualizar(hab);
    }
    
}
