package hosp.vistaverde.bo;

import hosp.vistaverde.dao.EmpleadoDAO;
import hosp.vistaverde.db.Conexion;
import hosp.vistaverde.entity.Empleado;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EmpleadoBO {

    private String mensaje = "";
    private EmpleadoDAO edao = new EmpleadoDAO();

    public String agregarEmpleado(Empleado emp) {
        Connection conn = Conexion.getConnection();
        try {

            mensaje = edao.agregarEmpleado(conn, emp);

        } catch (Exception e) {

            mensaje += "  " + e.getMessage();

        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                mensaje += "  " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String modificarEmpleado(Empleado emp) {
        Connection conn = Conexion.getConnection();
        try {

            mensaje = edao.modificarEmpleado(conn, emp);

        } catch (Exception e) {

            mensaje += "  " + e.getMessage();

        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                mensaje += "  " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String eliminarEmpleado(int id) {
        Connection conn = Conexion.getConnection();
        try {

            mensaje = edao.eliminarEmpleado(conn, id);

        } catch (Exception e) {

            mensaje += "  " + e.getMessage();

        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                mensaje += "  " + e.getMessage();
            }
        }
        return mensaje;
    }

    public void listarEmpleado(JTable tabla) {

        Connection conn = Conexion.getConnection();
        edao.listarEmpleado(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public boolean comprovarEmpleado(Empleado emp) throws SQLException {

        boolean ok = false;
        Connection conn = Conexion.getConnection();
        String passwordV;
        passwordV = edao.getPassword(conn, emp);
        
        if (passwordV.equals(emp.getPassword())) {
            ok = true;
        }

        return ok;
    }
    public String buscarEmpleado(Empleado emp) throws SQLException {
        Connection conn = Conexion.getConnection();
        
        String datos = "";
        
        datos = edao.buscarEmpleado(conn, emp);
     
        return datos;
    }

}
