package hosp.vistaverde.bo;

import hosp.vistaverde.dao.ClienteDAO;
import hosp.vistaverde.db.Conexion;
import hosp.vistaverde.entity.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class ClienteBO {
    
      private String mensaje = "";
    private ClienteDAO cdao = new ClienteDAO();

    public String agregarCLiente(Cliente cli) {
        Connection conn = Conexion.getConnection();
        try {

            mensaje = cdao.agregarCliente(conn, cli);

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

    public String modificarCliente(Cliente cli) {
        Connection conn = Conexion.getConnection();
        try {

            mensaje = cdao.modificarCliente(conn, cli);

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

    public String eliminarCliente(int id) {
        Connection conn = Conexion.getConnection();
        try {

            mensaje = cdao.eliminarCliente(conn, id);

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

    public void listarCliente(JTable tabla) {

        Connection conn = Conexion.getConnection();
        cdao.listarCliente(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }
    
    public Float listarClienteFecha(JTable tabla, String fecha) {

        Connection conn = Conexion.getConnection();
        float ganancias = cdao.listarClientesFechaYGanancia(conn, tabla, fecha);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return ganancias;
    }


    public String buscarCliente(Cliente cli) throws SQLException {
        Connection conn = Conexion.getConnection();
        
        String datos = "";
        
        datos = cdao.buscarCliente(conn, cli);
     
        return datos;
    }
    
}
