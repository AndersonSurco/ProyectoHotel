
package negocio;

import java.util.Calendar;

/**
 *
 * @author ander
 */
public class Linea {
    
    private Habitacion hab;
    private String fecEnt ,fecSal;

    public String getFecEnt() {
        return fecEnt;
    }

    public void setFecEnt(String fecEnt) {
        this.fecEnt = fecEnt;
    }

    public String getFecSal() {
        return fecSal;
    }

    public void setFecSal(String fecSal) {
        this.fecSal = fecSal;
    }
    

    public double getImp() {
        return this.hab.getPre()*this.getDias();
    }
    
    public int getDias(){
        
        int diaEntrada =Integer.parseInt(this.getFecEnt().substring(0,2));
        int mesEntrada =Integer.parseInt(this.getFecEnt().substring(3,5));
        int añoEntrada =Integer.parseInt(this.getFecEnt().substring(6,10));
        
        Calendar fecEntrada = Calendar.getInstance();
        
        fecEntrada.set(añoEntrada,mesEntrada-1,diaEntrada);
        fecEntrada.set(Calendar.HOUR,0);
        fecEntrada.set(Calendar.HOUR_OF_DAY,0);
        fecEntrada.set(Calendar.MINUTE,0);
        fecEntrada.set(Calendar.SECOND,0);
        
        int diaSalida =Integer.parseInt(this.getFecSal().substring(0,2));
        int mesSalida =Integer.parseInt(this.getFecSal().substring(3,5));
        int añoSalida =Integer.parseInt(this.getFecSal().substring(6,10));
        
        Calendar fecSalida = Calendar.getInstance();
        
        fecSalida.set(añoSalida,mesSalida-1,diaSalida);
        fecSalida.set(Calendar.HOUR,0);
        fecSalida.set(Calendar.HOUR_OF_DAY,0);
        fecSalida.set(Calendar.MINUTE,0);
        fecSalida.set(Calendar.SECOND,0);
        
        int dias = (int)((Math.abs(fecSalida.getTimeInMillis()-fecEntrada.getTimeInMillis()))/(1000*60*60*24));
        
        return dias;
        
        
    }
    public Linea() {
    }

    public Linea(Habitacion hab, String fecEnt,String fecSal) {
        this.hab = hab;
        this.fecEnt = fecEnt;
        this.fecSal = fecSal;
    }

    public Habitacion getHab() {
        return hab;
    }

    public void setHab(Habitacion hab) {
        this.hab = hab;
    }

    
    
    
    
}
