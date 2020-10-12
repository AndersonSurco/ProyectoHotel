package negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ander
 */
public class Reserva {
    
    private String num,fec,est;
    private double porDes;
    private List cesta;
    private Cliente cli;
    private Empleado emp;

    public Reserva() {
        cesta = new ArrayList();
    }
    
    public List getCesta() {
        return cesta;
    }
    
    public void agregar(Habitacion hab,String fecEnt,String fecSal){
    
        Linea lin = new Linea(hab,fecEnt,fecSal);
        cesta.add(lin);

    }
    
    
    public void quitar(String cod){
        
        for (int i = 0; i < cesta.size(); i++) {
            Linea lin = (Linea)cesta.get(i);
            if(lin.getHab().getCod().equals(cod)){
                cesta.remove(i);
            }
        }   
    }
    
    
    public double getSubTot(){
        double tot = 0;
        
        for (int i = 0; i < cesta.size(); i++) {
            
            Linea lin = (Linea)cesta.get(i);
            tot=tot+lin.getImp();
            
        }   
        
        return tot;
    }
    
    public double getDes(){
        return this.getSubTot()*this.getPorDes();
    }
    
    public double getTot(){
        return this.getSubTot()-this.getDes();
    }
    
    public double getPorDes() {
        return porDes;
    }
    
    public void setPorDes(double porDes) {
        this.porDes = porDes/100;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }
    
    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }
    
    
}
