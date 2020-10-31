/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.Empleado;

/**
 *
 * @author ander
 */
public class DaoEmpleadoImp implements DaoEmpleado{
    @Override
    public String Grabar(Empleado emp) {
        String sql = "Insert into empleado values('"+emp.getCod()+"','"+emp.getNom()+"','"+emp.getUsu()+"','"+emp.getPas()+"')";
        return operacion.ejecutar(sql);
    }

    @Override
    public List Listar() {
        List lis = new ArrayList();
        String sql = "select * from empleado";
        List lista = operacion.listar(sql);
        if(lista!=null){
            for (int i = 0; i < lista.size(); i++) {
                Object[]fila = (Object[])lista.get(i);
                Empleado emp = new Empleado();
                emp.setCod(fila[0].toString());
                emp.setNom(fila[1].toString());
                emp.setUsu(fila[2].toString());
                emp.setPas(fila[3].toString());
                lis.add(emp);
            }
            return lis;
        }
        return null;
    }

    @Override
    public Empleado buscar(String cod) {
        String sql = "Select * from empleado where cod ='"+cod+"'";
        Object[]fila = operacion.buscar(sql);
        if(fila != null){
            Empleado emp = new Empleado();
            emp.setCod(fila[0].toString());
            emp.setNom(fila[1].toString());
            emp.setUsu(fila[2].toString());
            emp.setPas(fila[3].toString());
            return emp;
        }
        return null;
    }

    @Override
    public String actualizar(Empleado emp) {
        String sql = "update empleado set nom='"+emp.getNom()+"',usu='"+emp.getUsu()+"',pas='"+emp.getPas()+"' where cod='"+emp.getCod()+"'";
        return operacion.ejecutar(sql);
    }

}
