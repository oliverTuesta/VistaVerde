package hosp.vistaverde.dao;

//import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import hosp.vistaverde.entity.Cliente;
import hosp.vistaverde.entity.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {

    private String mensaje = "";

    public String agregarCliente(Connection con, Cliente cli) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO cliente (id_cliente, nombre, apellido, dni, prosedencia, fecha, hora, cuarto, dias, precio)"
                + " VALUES(cliente_seq.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, cli.getNombre());
            pst.setString(2, cli.getApellidos());
            pst.setString(3, cli.getDni());
            pst.setString(4, cli.getProsedencia());
            pst.setString(5, cli.getFecha());
            pst.setString(6, cli.getHora());
            pst.setString(7, cli.getCuarto());
            pst.setInt(8, cli.getDias());
            pst.setFloat(9, cli.getCostoTotal());

            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "ERROR AL GUARDAR  ";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }

        return mensaje;
    }

    public String modificarCliente(Connection con, Cliente cli) {
        PreparedStatement pst = null;
        String sql = "UPDATE cliente SET nombre = ?, apellido = ?, dni = ?, prosedencia = ?, cuarto = ?, dias = ?, precio = ? "
                + "WHERE id_cliente = ?";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, cli.getNombre());
            pst.setString(2, cli.getApellidos());
            pst.setString(3, cli.getDni());
            pst.setString(4, cli.getProsedencia());
            pst.setString(5, cli.getCuarto());
            pst.setInt(6, cli.getDias());
            pst.setFloat(7, cli.getCostoTotal());
            pst.setInt(8, cli.getId());
            mensaje = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "ERROR AL MODIFICAR  ";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }

        return mensaje;
    }

    public String eliminarCliente(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "ERROR AL ELIMINAR  ";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }

        return mensaje;
    }

    public void listarCliente(Connection conn, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRES", "APELLIDOS", "DNI", "FECHA",
            " H"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT id_cliente, nombre, apellido, dni, fecha, cuarto FROM cliente ORDER BY id_cliente DESC";

        String[] filas = new String[6];

        Statement st = null;
        ResultSet rs = null;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                for (int i = 0; i < 6; i++) {

                    filas[i] = rs.getString(i + 1);

                }

                model.addRow(filas);

            }

            tabla.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se puede mostrar la tabla");
        }

    }

    public float listarClientesFechaYGanancia(Connection conn, JTable tabla, String fechaElegida) {

        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRES", "APELLIDOS", "DNI", "FECHA",
            " H", "   S/."};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT id_cliente, nombre, apellido, dni, fecha, cuarto, precio FROM cliente ORDER BY id_cliente DESC";

        String[] filas = new String[7];

        Statement st = null;
        ResultSet rs = null;

        float ganancia = 0;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                for (int i = 0; i < 7; i++) {

                    filas[i] = rs.getString(i + 1);

                }

                //pone la fecha en formato mm/yy
                String[] fechaEle = fechaElegida.split("/");
                String fechaSinDia = fechaEle[1]+"/"+fechaEle[2];

                filas[6] += ".00";

                String[] fecha = filas[4].split("/");
                String mesYear = fecha[1] + "/" + fecha[2];
                
                if (mesYear.equals(fechaSinDia)) {
                    ganancia += Double.parseDouble(filas[6]);
                    model.addRow(filas);
                }

            }

            if (tabla!=null) {
                 tabla.setModel(model);
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se puede mostrar la tabla");
        }
        return ganancia;

    }

    public String getPassword(Connection conn, String usuario) throws SQLException {

        PreparedStatement pst = conn.prepareStatement("SELECT * FROM empleado WHERE usuario = ?");

        pst.setString(1, usuario);

        ResultSet rs = pst.executeQuery();

        String password = "";

        while (rs.next()) {
            password = rs.getString("password");
        }

//        System.out.println("id: " + rs.getString("id_empleado"));
//        System.out.println("password: " + password);
//        System.out.println("usuario: " + usuario);
        return password;

    }

    public String buscarCliente(Connection conn, Cliente cli) {

        String datos = "";

        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM cliente WHERE id_cliente = ?");

            pst.setInt(1, cli.getId());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                datos = rs.getString("nombre") + "#" + rs.getString("apellido") + "#" + rs.getString("dni")
                        + "#" + rs.getString("prosedencia") + "#" + rs.getString("fecha") + "#" + rs.getString("hora") + "#" + rs.getString("cuarto")
                        + "#" + rs.getString("dias") + "#" + rs.getString("precio");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EMPLEADO");
        }

        return datos;
    }
}
