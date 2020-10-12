package persistencia;

import java.sql.Connection;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {
        // TODO code application logic here /*
        /*Connection cn = new conexion().getConexion();
        if(cn!=null){
            System.out.println("Si hay conexion");
        }else{
            System.out.println("No hay conexion :c");
        }
        
        String sql = "Insert into cliente values('C0000003','Cleinte 02','Direcion 02')";
        String msg = operacion.ejecutar(sql);
        System.out.println(msg);*/
        
        List lista = operacion.listar("select * from empleado");
        if(lista != null){
            for (int i = 0; i < lista.size(); i++) {
                Object[]fil = (Object[])lista.get(i);
                System.out.println(fil[0]+" "+fil[1]+" "+fil[2]+" "+fil[3]);
            }
        }else{
            System.out.println("No hay lista");
        }
        
        
    }
    
}
