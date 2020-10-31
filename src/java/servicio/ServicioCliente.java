/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import negocio.Cliente;

/**
 *
 * @author ander
 */
public interface ServicioCliente {
    
    public Cliente validarCliente(String dni,String nom);
    public String grabarCliente(String dni,String nom,String dir);
    public Cliente buscarCliente(String dni);
    public String actualizarCliente(String dni , String nom , String dir);
}
