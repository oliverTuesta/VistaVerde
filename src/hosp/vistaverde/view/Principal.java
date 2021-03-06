/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.vistaverde.view;

import hosp.vistaverde.bo.ClienteBO;
import hosp.vistaverde.entity.Cliente;
import java.awt.Color;
import java.awt.Image;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author henry
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Cliente c = new Cliente();
    Color gris = new Color(237, 237, 237);
    Color amarillo = new Color(255, 204, 0);
    Color naranja = new Color(255, 173, 0);
    Image icono = new ImageIcon(getClass().getResource("/hosp/vistaverde/images/maleta.png")).getImage();

    public Principal() {

        setUndecorated(true);
        setIconImage(icono);
        initComponents();
        diseño();
        gananciasMes();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoR = new javax.swing.JToggleButton();
        btnGanancia = new javax.swing.JToggleButton();
        btnEmpleados = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JToggleButton();
        btnRegistro = new javax.swing.JToggleButton();
        txtGanancia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bannerSuperior = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondoAmarillo = new javax.swing.JLabel();
        fondoBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        btnNuevoR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/Botonnuevo.png"))); // NOI18N
        btnNuevoR.setBorder(null);
        btnNuevoR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoR.setOpaque(false);
        btnNuevoR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoR);
        btnNuevoR.setBounds(50, 480, 210, 130);

        btnGanancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/botonGanancia.png"))); // NOI18N
        btnGanancia.setBorder(null);
        btnGanancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGanancia.setOpaque(false);
        btnGanancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGananciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGanancia);
        btnGanancia.setBounds(800, 480, 210, 130);

        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/BotonEMP.png"))); // NOI18N
        btnEmpleados.setBorder(null);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.setOpaque(false);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados);
        btnEmpleados.setBounds(300, 480, 210, 130);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/btnSalir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setOpaque(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(970, 670, 100, 40);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/X.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar);
        btnCerrar.setBounds(1060, 0, 20, 20);

        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/BotonRegis.png"))); // NOI18N
        btnRegistro.setBorder(null);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.setOpaque(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro);
        btnRegistro.setBounds(540, 480, 210, 130);

        txtGanancia.setBackground(new java.awt.Color(102, 102, 102));
        txtGanancia.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        getContentPane().add(txtGanancia);
        txtGanancia.setBounds(130, 200, 60, 20);

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel3.setText("ESTE MES");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 200, 60, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/bolsa-de-dinero mini.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 200, 20, 20);
        getContentPane().add(bannerSuperior);
        bannerSuperior.setBounds(0, 0, 1080, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosp/vistaverde/images/logo3.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 500, 150);
        getContentPane().add(fondoAmarillo);
        fondoAmarillo.setBounds(0, 20, 1080, 380);
        getContentPane().add(fondoBlanco);
        fondoBlanco.setBounds(0, 400, 1080, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        EmpleadoView ev = new EmpleadoView();
        ev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnNuevoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRActionPerformed
        NuevoClienteView nr = new NuevoClienteView();
        nr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoRActionPerformed

    private void btnGananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGananciaActionPerformed
        GananciasView g = new GananciasView();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGananciaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        RegistroView re = new RegistroView();
        re.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bannerSuperior;
    private javax.swing.JToggleButton btnCerrar;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JToggleButton btnGanancia;
    private javax.swing.JToggleButton btnNuevoR;
    private javax.swing.JToggleButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondoAmarillo;
    private javax.swing.JLabel fondoBlanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txtGanancia;
    // End of variables declaration//GEN-END:variables

    ClienteBO bo = new ClienteBO();
    
    private void gananciasMes() {
        
        txtGanancia.setText(bo.listarClienteFecha(null, c.getFechaActual())+"0");
        
    }

    private void diseño() {
        setLocationRelativeTo(null);
        
        btnNuevoR.setBackground(Color.BLUE);

        bannerSuperior.setBackground(naranja);
        bannerSuperior.setOpaque(true);

        fondoAmarillo.setBackground(amarillo);
        fondoAmarillo.setOpaque(true);

        fondoBlanco.setBackground(Color.white);
        fondoBlanco.setOpaque(true);

        //tamaño de jframe
        setSize(1080, 720);

        //boton transparente
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setFocusPainted(false);
        //boton transparente

    }

}
