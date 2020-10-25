package presentacion;
import java.util.ArrayList;
import java.util.List;
import negocio.Linea;
import negocio.Reserva;

public class ModeloReserva {
    
    private  Reserva res;
    private List listHab;
    
    public ModeloReserva(Reserva res) {
        this.res = res;
    }

    public List getListHab() {
        return listHab;
    }

    public void setListHab(List listHab) {
        this.listHab = listHab;
    }

    public List getCes(){
        List lis = new ArrayList();
        for (int i = 0; i < res.getCesta().size(); i++) {
            Linea lin = (Linea)res.getCesta().get(i);
            Object[] f = new Object[5];
            f[0]= lin.getHab().getCod();
            f[1]= lin.getHab().getTip();
            f[2]= lin.getHab().getPre();
            f[3]= lin.getDias();
            f[4]= lin.getImp();
            lis.add(f);
        }
        return lis;
    }
    
    public String getSubTot(){
        return String.valueOf(res.getSubTot());
    }
    
    public String getDesc(){
        return String.valueOf(res.getDes());
    }
    
    public String getTot(){
        return String.valueOf(res.getTot());
    }
    
}
