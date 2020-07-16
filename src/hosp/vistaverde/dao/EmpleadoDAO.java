package hosp.vistaverde.dao;

//import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import hosp.vistaverde.entity.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpleadoDAO {

    private String mensaje = "";

    public String agregarEmpleado(Connection con, Empleado emp) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO EMPLEADO (id_empleado, nombres, apellidos, password, usuario)"
                + " VALUES(empleado_seq.NEXTVAL, ?, ?, ?, ?)";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, emp.getNombres());
            pst.setString(2, emp.getApellidos());
            pst.setString(3, emp.getPassword());
            pst.setString(4, emp.getUsuario());
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "ERROR AL GUARDAR  ";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }

        return mensaje;
    }

    public String modificarEmpleado(Connection con, Empleado emp) {
        PreparedStatement pst = null;
        String sql = "UPDATE empleado SET nombres = ?, apellidos = ?, password = ?, usuario = ? "
                + "WHERE id_empleado = ?";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, emp.getNombres());
            pst.setString(2, emp.getApellidos());
            pst.setString(3, emp.getPassword());
            pst.setString(4, emp.getUsuario());
            pst.setInt(5, emp.getIdEmpleado());
            mensaje = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "ERROR AL MODIFICAR  ";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }

        return mensaje;
    }

    public String eliminarEmpleado(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM empleado WHERE id_empleado = ?";

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

    public void listarEmpleado(Connection conn, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRES", "APELLIDOS", "USUARIO"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT id_empleado, nombres, apellidos, usuario FROM empleado ORDER BY apellidos, nombres";

        String[] filas = new String[4];

        Statement st = null;
        ResultSet rs = null;


        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                for (int i = 0; i < 4; i++) {

                    filas[i] = rs.getString(i + 1);

                }

                model.addRow(filas);

            }

            tabla.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se puede mostrar la tabla");
            System.out.println(e.getMessage());
        }

    }

    public String getPassword(Connection conn, Empleado emp) throws SQLException {

        PreparedStatement pst = conn.prepareStatement("SELECT * FROM empleado WHERE usuario = ?");

        pst.setString(1, emp.getUsuario());

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

    public String buscarEmpleado(Connection conn, Empleado emp) {

        String datos = "";

        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM empleado WHERE id_empleado = ?");

            pst.setInt(1, emp.getIdEmpleado());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                datos = rs.getString("nombres") + "#" + rs.getString("apellidos") + "#" + rs.getString("usuario") + "#" + rs.getString("password");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EMPLEADO");
        }

        return datos;
    }
}
