/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Cliente;

/**
 *
 * @author ander
 */
public interface DaoCliente {
    public String Grabar(Cliente cli);
    public List Listar();
    public Cliente buscar(String dni);
    public String actualizar(Cliente cli);
}
