
package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.Cliente;


/**
 *
 * @author ander
 */
public class DaoClienteImp implements DaoCliente{

    @Override
    public String Grabar(Cliente cli) {
        String sql = "Insert into cliente values('"+cli.getDni()+"','"+cli.getNom()+"','"+cli.getDir()+"')";
        return operacion.ejecutar(sql);
    }

    @Override
    public List Listar() {
        List lis = new ArrayList();
        String sql = "select * from cliente";
        List lista = operacion.listar(sql);
        if(lista!=null){
            for (int i = 0; i < lista.size(); i++) {
                Object[]fila = (Object[])lista.get(i);
                Cliente cli = new Cliente();
                cli.setDni(fila[0].toString());
                cli.setNom(fila[1].toString());
                cli.setDir(fila[2].toString());
                lis.add(cli);
            }
            return lis;
        }
        return null;
    }

    @Override
    public Cliente buscar(String dni) {
        String sql ="select * from cliente where dni='"+dni+"'";
        Object[]fila = operacion.buscar(sql);
        if(fila != null){
            Cliente cli = new Cliente();
            cli.setDni(fila[0].toString());
            cli.setNom(fila[1].toString());
            cli.setDir(fila[2].toString());
            return cli;
        }
        return null;
    }

    @Override
    public String actualizar(Cliente cli) {
        String sql = "update cliente set nom='"+cli.getNom()+"',dir='"+cli.getDir()+"' where dni='"+cli.getDni()+"'";
        return operacion.ejecutar(sql);
    }
    
}
