package negocio;

import java.util.List;

/**
 *
 * @author ander
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Habitacion h1 = new Habitacion("H0001","Doble","Disponible",10);
        Habitacion h2 = new Habitacion("H0002","Doble","Disponible",20);
        Habitacion h3 = new Habitacion("H0003","Doble","Disponible",30);
        
        Reserva r = new Reserva();
        r.agregar(h1,"05/09/2020","20/09/2020");
        r.agregar(h2,"01/05/2020","15/05/2020");
        r.agregar(h3,"04/05/2021","08/05/2021");
        //r.quitar("H0002");
        List cesta = r.getCesta();
        
        System.out.println("================================================================================");
        System.out.println("                          RESERVACION CASO:HOTEL                                    ");
        System.out.println("================================================================================");
        System.out.println("Codigo \tTipo \tF. Entrada \tF. Salida \tPrecio \tDias \timporte");
        for (int i = 0; i < cesta.size(); i++) {
            Linea lin = (Linea)cesta.get(i);
            System.out.println(lin.getHab().getCod()+"\t"+lin.getHab().getTip()+" \t"+lin.getFecEnt()+" \t"+lin.getFecSal()+" \t"+lin.getHab().getPre()+" \t"+lin.getDias()+" \t"+lin.getImp());
            
        }
        System.out.println("================================================================================");
        System.out.println("Sub Total: "+r.getSubTot()+"                                                 ");
        r.setPorDes(10);
        System.out.println("Descuento: "+r.getDes()+"                                                    ");
        System.out.println("Total:     "+r.getTot()+"                                                    ");
        System.out.println("================================================================================");
       
        
    }
    
}
