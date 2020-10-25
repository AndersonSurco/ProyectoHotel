/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.Habitacion;

/**
 *
 * @author ander
 */
public class DaoHabitacionImp implements DaoHabitacion{
    
    @Override
    public String Grabar(Habitacion hab) {
        String sql = "Insert into habitacion values('"+hab.getCod()+"','"+hab.getTip()+"','"+hab.getEst()+"','"+hab.getPre()+"')";
        return operacion.ejecutar(sql);
    }

    @Override
    public List Listar() {
        //List lis = new ArrayList();
        String sql = "select * from habitacion";
        List lista = operacion.listar(sql);
        if(lista!=null){
            /*for (int i = 1; i < lista.size(); i++) {
                Object[]fila = (Object[])lista.get(i);
                Habitacion hab = new Habitacion();
                hab.setCod(fila[0].toString());
                hab.setTip(fila[1].toString());
                hab.setEst(fila[2].toString());
                hab.setPre(Double.parseDouble(fila[3].toString()));
                lis.add(hab);
            }
            return lis;*/
            return lista;
        }
        return null;
    }

    @Override
    public Habitacion buscar(String cod) {
        String sql ="select * from habitacion where cod='"+cod+"'";
        Object[]fila = operacion.buscar(sql);
        if(fila != null){
            Habitacion hab = new Habitacion();
            hab.setCod(fila[0].toString());
            hab.setTip(fila[1].toString());
            hab.setEst(fila[2].toString());
            hab.setPre((double)fila[3]);
            return hab;
        }
        return null;
    }

    @Override
    public String actualizar(Habitacion hab) {
        String sql = "update habitacion set est='"+hab.getEst()+"' where cod='"+hab.getCod()+"'";
        return operacion.ejecutar(sql);
    }
    
}
