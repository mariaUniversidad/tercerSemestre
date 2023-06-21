/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import conexionSQL.ConexionDB;
import entidades.TbRegistro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Maluli
 */
public class registrarUsuarios extends javax.swing.JFrame {

    ConexionDB conexionDB = null;

    /**
     * Creates new form registrarUsuarios
     */
    public registrarUsuarios() {
        initComponents();
        conexionDB = new ConexionDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        apellido2 = new javax.swing.JTextField();
        nombre1 = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        clave = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        registrarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Segundo apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Segundo nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Primer nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));
        jPanel1.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 180, 30));
        jPanel1.add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 180, 30));
        jPanel1.add(apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 180, 30));

        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 30));
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 180, 30));
        jPanel1.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 180, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clave");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Primer apellido");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        registrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrarBtn.setForeground(new java.awt.Color(255, 51, 102));
        registrarBtn.setText("Registrar");
        registrarBtn.setToolTipText("");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(registrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 110, 30));

        cancelarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarBtn.setForeground(new java.awt.Color(102, 102, 102));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 100, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosVisuales/registroPage.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed

        String queryDB = "Insert into tb_registro (primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,usuario,clave)"
                + "values (?,?,?,?,?,?);";

        TbRegistro registro = null;
        try (Connection conn = conexionDB.obtenerConexion(); PreparedStatement ps = conn.prepareStatement(queryDB)) {

            ps.setString(1, nombre1.getText());
            ps.setString(2, nombre2.getText());
            ps.setString(3, apellido1.getText());
            ps.setString(4, apellido2.getText());
            ps.setString(5, usuario.getText());
            ps.setString(6, clave.getText());
            
            ps.execute();
             JOptionPane.showMessageDialog(null, "Usuario guardado con éxito!", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
            
            
        }catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Lo sentimos tuvimos problemas al registrar", "Intentelo nuevamente", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
       this.dispose();
    }//GEN-LAST:event_cancelarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(registrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido1;
    private javax.swing.JTextField apellido2;
    private javax.swing.JLabel background;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}