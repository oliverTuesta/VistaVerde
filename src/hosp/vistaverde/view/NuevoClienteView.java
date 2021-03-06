/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.vistaverde.view;

import hosp.vistaverde.bo.ClienteBO;
import hosp.vistaverde.cons.Constantes;
import hosp.vistaverde.entity.Cliente;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author henry
 */
public class NuevoClienteView extends javax.swing.JFrame {

    /**
     * Creates new form Registrar
     */
    Cliente c = new Cliente();

    Image icono = new ImageIcon(getClass().getResource("/hosp/vistaverde/images/maleta.png")).getImage();

    public NuevoClienteView() {

        setUndecorated(true);
        setIconImage(icono);
        initComponents();

        teclaEnCboHabitacion();

        setSize(1080, 720);
        diseño();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtProsedencia = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cboHabitacion = new javax.swing.JComboBox<>();
        txtDias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        persona = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fondoBlanco = new javax.swing.JLabel();
        fondoAmarillo = new javax.swing.JLabel();
        bannerSuperior = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        txtNombre.setBackground(new java.awt.Color(245, 248, 249));
        txtNombre.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 229, 233)));
        txtNombre.setCaretColor(new java.awt.Color(51, 51, 51));
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtNombre.setOpaque(false);
        txtNombre.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(640, 110, 310, 40);

        txtApellido.setBackground(new java.awt.Color(245, 248, 249));
        txtApellido.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(102, 102, 102));
        txtApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 229, 233)));
        txtApellido.setCaretColor(new java.awt.Color(51, 51, 51));
        txtApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtApellido.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtApellido.setOpaque(false);
        txtApellido.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido);
        txtApellido.setBounds(640, 170, 310, 40);

        txtProsedencia.setBackground(new java.awt.Color(245, 248, 249));
        txtProsedencia.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtProsedencia.setForeground(new java.awt.Color(102, 102, 102));
        txtProsedencia.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 229, 233)));
        txtProsedencia.setCaretColor(new java.awt.Color(51, 51, 51));
        txtProsedencia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtProsedencia.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtProsedencia.setOpaque(false);
        txtProsedencia.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtProsedencia);
        txtProsedencia.setBounds(640, 230, 310, 40);

        txtDni.setBackground(new java.awt.Color(245, 248, 249));
        txtDni.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtDni.setForeground(new java.awt.Color(102, 102, 102));
        txtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 229, 233)));
        txtDni.setCaretColor(new java.awt.Color(51, 51, 51));
        txtDni.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDni.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtDni.setOpaque(false);
        txtDni.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        getContentPane().add(txtDni);
        txtDni.setBounds(640, 290, 310, 40);

        cboHabitacion.setBackground(new java.awt.Color(204, 204, 204));
        cboHabitacion.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        cboHabitacion.setForeground(new java.awt.Color(102, 102, 102));
        cboHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "N° 01", "N° 02", "N° 03", "N° 04", "N° 05", "N° 06", "N° 07", "N° 08", "N° 09", "N° 10" }));
        cboHabitacion.setToolTipText("");
        cboHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHabitacionActionPerformed(evt);
            }
        });
        getContentPane().add(cboHabitacion);
        cboHabitacion.setBounds(640, 420, 310, 40);

        txtDias.setBackground(new java.awt.Color(245, 248, 249));
        txtDias.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtDias.setForeground(new java.awt.Color(102, 102, 102));
        txtDias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDias.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 229, 233)));
        txtDias.setCaretColor(new java.awt.Color(51, 51, 51));
        txtDias.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDias.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtDias.setOpaque(false);
        txtDias.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtDias);
        txtDias.setBounds(640, 500, 68, 40);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Habitacion");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(520, 430, 90, 21);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Dias");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(520, 510, 36, 21);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Precio S/.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(740, 510, 74, 21);

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(245, 248, 249));
        txtPrecio.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 229, 233)));
        txtPrecio.setCaretColor(new java.awt.Color(51, 51, 51));
        txtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPrecio.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtPrecio.setOpaque(false);
        txtPrecio.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(840, 500, 100, 40);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/X.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar);
        btnCerrar.setBounds(1060, 0, 20, 20);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nombres");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 120, 73, 21);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Apellidos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 180, 76, 21);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Procedencia");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 240, 100, 21);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("DNI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 300, 50, 21);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Fecha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 360, 70, 21);

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(245, 248, 249));
        txtFecha.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 229, 233)));
        txtFecha.setCaretColor(new java.awt.Color(204, 204, 204));
        txtFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtFecha.setOpaque(false);
        txtFecha.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtFecha);
        txtFecha.setBounds(640, 350, 130, 40);

        txtHora.setEditable(false);
        txtHora.setBackground(new java.awt.Color(245, 248, 249));
        txtHora.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtHora.setForeground(new java.awt.Color(102, 102, 102));
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 229, 233)));
        txtHora.setCaretColor(new java.awt.Color(204, 204, 204));
        txtHora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtHora.setOpaque(false);
        txtHora.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtHora);
        txtHora.setBounds(850, 350, 100, 40);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Hora");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(800, 360, 41, 21);

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/boton aceptar.png"))); // NOI18N
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setOpaque(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(800, 600, 140, 40);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/boton cancelar.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(640, 600, 140, 40);

        persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/persona.png"))); // NOI18N
        getContentPane().add(persona);
        persona.setBounds(160, 190, 205, 205);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/registr.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 480, 112, 110);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/logopeque.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(150, 90, 240, 40);
        getContentPane().add(fondoBlanco);
        fondoBlanco.setBounds(460, 40, 560, 640);
        getContentPane().add(fondoAmarillo);
        fondoAmarillo.setBounds(70, 40, 390, 640);
        getContentPane().add(bannerSuperior);
        bannerSuperior.setBounds(0, 0, 1080, 20);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void cboHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHabitacionActionPerformed
        precios();
    }//GEN-LAST:event_cboHabitacionActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        cerrar();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        confirmar();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        cerrar();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bannerSuperior;
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JToggleButton btnCerrar;
    private javax.swing.JComboBox<String> cboHabitacion;
    private javax.swing.JLabel fondoAmarillo;
    private javax.swing.JLabel fondoBlanco;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel persona;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProsedencia;
    // End of variables declaration//GEN-END:variables

    Principal p = new Principal();
    ClienteBO cbo = new ClienteBO();

    private float precioD;

    private void precios() {

        int cuarto = cboHabitacion.getSelectedIndex();

        switch (cuarto) {
            case 1:
                precioD = 15;
                txtPrecio.setText("" + precioD + 0);
                break;
            case 2:
                precioD = 15;
                txtPrecio.setText("" + precioD + 0);
                break;
            case 3:
                precioD = 20;
                txtPrecio.setText("" + precioD + 0);
                break;
            case 4:
                precioD = 15;
                txtPrecio.setText("" + precioD + 0);
                break;
            case 5:
                precioD = 20;
                txtPrecio.setText("" + precioD + 0);
                break;
            case 6:
                precioD = 15;
                txtPrecio.setText("" + precioD + 0);
                break;
            case 7:
                precioD = 15;
                txtPrecio.setText("" + precioD + 0);
                break;
            case 8:
                precioD = 15;
                txtPrecio.setText("" + precioD + 0);
                break;
            case 9:
                precioD = 15;
                txtPrecio.setText("" + precioD + 0);
                break;
            case 10:
                precioD = 20;
                txtPrecio.setText("" + precioD + 0);
                break;
            default:
                txtPrecio.setText("");

        }

    }

    private void confirmar() {

        try {
            int noches = Integer.parseInt(txtDias.getText());
            float precioT = precioD * noches;
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String dni = txtDni.getText();
            String prosedencia = txtProsedencia.getText();
            String Fecha = txtFecha.getText();
            String Hora = txtHora.getText();
            int dias = Integer.parseInt(txtDias.getText());
            String cuarto = "" + cboHabitacion.getSelectedIndex();

            if (cboHabitacion.getSelectedIndex() > 0 && precioT > 0 && !txtApellido.getText().isEmpty()
                    && txtDni.getText().length() == 8 && !txtNombre.getText().isEmpty()
                    && !txtProsedencia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Se completo la registracion,"
                        + '\n' + " el precio total es: " + precioT);

                precioT = precioD * dias;

                c.setNombre(nombre);
                c.setApellidos(apellido);
                c.setCostoTotal(precioT);
                c.setDni(dni);
                c.setProsedencia(prosedencia);
                c.setCuarto(cuarto);
                c.setFecha(Fecha);
                c.setHora(Hora);
                c.setCostoTotal(precioT);
                c.setDias(dias);

                cbo.agregarCLiente(c);

                cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo completar, revise todos los datos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar, revise todos los datos");
        }

    }

    private void cerrar() {
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        dispose();
    }

    private void diseño() {
        fondoBlanco.setBackground(Color.white);
        fondoBlanco.setOpaque(true);

        bannerSuperior.setBackground(Constantes.naranja);
        bannerSuperior.setOpaque(true);

        fondoAmarillo.setBackground(Constantes.amarillo);
        fondoAmarillo.setOpaque(true);

        //color del JFrame
        this.getContentPane().setBackground(Constantes.gris);
        setLocationRelativeTo(null);
        //boton transparente
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setFocusPainted(false);

        txtDias.setText("1");
        txtHora.setText(c.getHoraActual());
        txtFecha.setText(c.getFechaActual());
    }

    private void teclaEnCboHabitacion() {

        cboHabitacion.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    confirmar();
                }
            }
        });

    }

}
