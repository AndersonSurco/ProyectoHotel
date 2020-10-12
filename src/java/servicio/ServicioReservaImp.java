/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import negocio.Linea;
import negocio.Reserva;
import persistencia.DaoReserva;
import persistencia.DaoReservaImp;

/**
 *
 * @author ander
 */
public class ServicioReservaImp implements ServicioReserva{
    
    private ServicioEmpleado serEmp;
    private ServicioCliente serCli;
    private ServicioHabitacion serHab;
    private DaoReserva daoRes;
    private Reserva res;

    public ServicioReservaImp() {
        serEmp = new ServicioEmpleadoImp();
        serCli = new ServicioClienteImp();
        serHab = new ServicioHabitacionImp();
        daoRes = new DaoReservaImp();
    }
    
    

    @Override
    public Reserva nuevaReserva(String cod, String porDes) {
        res = new Reserva();
        res.setNum(this.getNum());
        res.setFec(this.getFec());
        res.setEmp(serEmp.buscarEmpleado(cod));
        res.setPorDes(Double.parseDouble(porDes));
        
        return res;
    }

    @Override
    public void agregarHabitacion(String cod, String fecEnt, String fecSal) {
        res.agregar(serHab.buscarHabitacion(cod),fecEnt,fecSal);

    }

    @Override
    public void quitarHabitacion(String cod) {
        res.quitar(cod);
    }

    @Override
    public String grabarReserva(String est, String dni) {
        res.setEst(est);
        res.setCli(serCli.buscarCliente(dni));
        String msg = daoRes.grabarReserva(res);
        for (int i = 0; i < res.getCesta().size(); i++) {
            Linea lin = (Linea)res.getCesta().get(i);
            msg = daoRes.grabarDetalle(res, lin);
        }
        return msg;
    }
    
    private String getNum(){
        return "p00005";
    }
    
    private String getFec(){
        return "10/10/2020";
    }
    
}
