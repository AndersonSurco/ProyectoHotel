/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import negocio.Cliente;
import persistencia.DaoCliente;
import persistencia.DaoClienteImp;

/**
 *
 * @author ander
 */
public class ServicioClienteImp implements ServicioCliente{
    
    private DaoCliente daoCli;

    public ServicioClienteImp() {
        daoCli = new DaoClienteImp();
    }
    
    

    @Override
    public Cliente validarCliente(String dni, String nom) {
        List lista = daoCli.Listar();
        if(lista != null){
            for (int i = 0; i < lista.size(); i++) {
                Cliente cli = (Cliente)lista.get(i);
                if(cli.getDni().equals(dni)&& cli.getNom().equals(nom)){
                    return cli;
                }
            }
        }
        return null;
    }

    @Override
    public String grabarCliente(String dni, String nom, String dir) {
        Cliente cli = new Cliente(dni, nom, dir);
        return daoCli.Grabar(cli);
    }

    @Override
    public Cliente buscarCliente(String dni) {
        return daoCli.buscar(dni);
    }

    @Override
    public String actualizarCliente(String dni, String nom) {
        Cliente cli = new Cliente();
        cli.setDni(dni);
        cli.setNom(nom);
        return daoCli.actualizar(cli);
    }
    
}
