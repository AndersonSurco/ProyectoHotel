/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
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
        Habitacion hab = new Habitacion(cod, tip, est,Double.parseDouble(pre));
        return daoHab.Grabar(hab);
    }

    @Override
    public Habitacion buscarHabitacion(String cod) {
        return daoHab.buscar(cod);
    }

    @Override
    public String actualizarHabitacion(String cod, String tip,String est ,String pre) {
        Habitacion hab = new Habitacion();
        hab.setCod(cod);
        hab.setTip(tip);
        hab.setEst(est);
        hab.setPre(Double.parseDouble(pre));
        return daoHab.actualizar(hab);
    }

    @Override
    public List listarHabitacion() {
        return daoHab.Listar();
    }
    
}
