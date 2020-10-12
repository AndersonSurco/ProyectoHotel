/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import negocio.Empleado;
import persistencia.DaoEmpleado;
import persistencia.DaoEmpleadoImp;

/**
 *
 * @author ander
 */
public class ServicioEmpleadoImp implements ServicioEmpleado{
    
    private DaoEmpleado daoEmp;
    
    public ServicioEmpleadoImp() {
        daoEmp = new DaoEmpleadoImp();
    }
    
    
    @Override
    public Empleado validarEmpleado(String usu, String pas) {
        
        List lista = daoEmp.Listar();
        if(lista != null){
            for (int i = 0; i < lista.size(); i++) {
                Empleado emp = (Empleado)lista.get(i);
                if(emp.getUsu().equals(usu)&& emp.getPas().equals(pas)){
                    return emp;
                }
            }
        }
        return null;
    }

    @Override
    public String grabarEmpleado(String cod, String nom, String usu, String pas) {
        Empleado emp = new Empleado(cod, nom, usu, pas);
        return daoEmp.Grabar(emp);
    }

    @Override
    public Empleado buscarEmpleado(String cod) {
        return daoEmp.buscar(cod);
    }

    @Override
    public String actualizarEmpleado(String cod, String pas) {
        Empleado emp = new Empleado();
        emp.setCod(cod);
        emp.setPas(pas);
        return daoEmp.actualizar(emp);
    }

}
