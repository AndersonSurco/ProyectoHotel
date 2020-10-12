
package servicio;

import negocio.Reserva;


public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioEmpleado ser = new ServicioEmpleadoImp();
        ServicioReserva serRes = new ServicioReservaImp();
        Reserva res = serRes.nuevaReserva("E001","10");
        serRes.agregarHabitacion("H001","11/10/2020","15/10/2020");
        serRes.agregarHabitacion("H002","10/10/2020","15/10/2020");
        String msg = serRes.grabarReserva("Atendido","C0000001");
        System.out.println(msg);
        
    }
    
}
