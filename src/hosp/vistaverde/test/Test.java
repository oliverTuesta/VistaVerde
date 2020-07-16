package hosp.vistaverde.test;

import hosp.vistaverde.bo.ClienteBO;
import hosp.vistaverde.bo.EmpleadoBO;
import hosp.vistaverde.entity.Cliente;
import hosp.vistaverde.entity.Empleado;

public class Test {

//    EmpleadoBO ebo = new EmpleadoBO();
//    Empleado emp = new Empleado();
//    
    Cliente cli = new Cliente();
    ClienteBO cbo = new ClienteBO();
    String mensaje = "";

//    public void insertar(){
//          emp.setNombres("GRACIELA");
//        emp.setApellidos("YOPLAC PORTOCARRERO");
//        emp.setPassword("2020");
//        emp.setUsuario("grame");
//        mensaje = ebo.agregarEmpleado(emp);
//        System.out.println(mensaje);
//    }
//     public void modificar(){
//        emp.setIdEmpleado(3);
//        emp.setNombres("OLIVER");
//        emp.setApellidos("TUESTA YOPLAC");
//        emp.setPassword("2004");
//        emp.setUsuario("oliver");
//        mensaje = ebo.modificarEmpleado(emp);
//        System.out.println(mensaje);
//    }
//     public void eliminar(){
//         mensaje = ebo.eliminarEmpleado(4);
//         System.out.println(mensaje);
//     }
    public void insertar() {
        cli.setNombre("juan");
        cli.setApellidos("perez");
        cli.setDni("72637374");
        cli.setProsedencia("mendoza");
        cli.setFecha(cli.getFechaActual());
        cli.setHora(cli.getHoraActual());
        cli.setCuarto("1");
        cli.setDias(2);
        cli.setCostoTotal(30);
        mensaje = cbo.agregarCLiente(cli);
        System.out.println(mensaje);
    }
         public void modificar(){
        cli.setNombre("juan");
        cli.setApellidos("perez");
        cli.setDni("72637374");
        cli.setProsedencia("mendoza");
        cli.setFecha(cli.getFechaActual());
        cli.setHora(cli.getHoraActual());
        cli.setCuarto("1");
        cli.setDias(2);
        cli.setCostoTotal(30);
        cli.setId(1);
        mensaje = cbo.modificarCliente(cli);
        System.out.println(mensaje);
    }

          public void eliminar(){
         mensaje = cbo.eliminarCliente(3);
         System.out.println(mensaje);
     }
         
    public static void main(String[] args) {
        Test test = new Test();
        test.insertar();
        //test.modificar();
        //test.eliminar();
    }
}
