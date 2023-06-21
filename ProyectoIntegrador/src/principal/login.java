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

/**
 *
 * @author Maluli
 */
public class login extends javax.swing.JFrame {

    ConexionDB conexionDB = null;

    public login() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clave");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 60, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 60, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 102));
        jButton1.setText("Registrarse");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 255), null, null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 110, 40));

        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 51, 102));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 255), null, null));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 120, 40));

        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 255), null, null));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 240, 40));

        txtPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 255), null, null));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 240, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosVisuales/Beauty SPOT.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        System.out.println("Datos de acceso: " + txtUser.getText());
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!*_])[a-zA-Z\\d!*_]+$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(String.valueOf(txtPassword.getPassword()));
        //validaciones de formulario
        if (txtUser.getText().isEmpty()
                && String.valueOf(txtPassword.getPassword()).isEmpty()) {

            JOptionPane.showMessageDialog(null, "Debe ingresar el usuario y clave", "Intentelo nuevamente", ERROR_MESSAGE);
            return;
        } else if (!(txtUser.getText().isEmpty())
                && String.valueOf(txtPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el campo clave", "Intentelo nuevamente", ERROR_MESSAGE);
            return;
        } else if (txtUser.getText().isEmpty()
                && !(String.valueOf(txtPassword.getPassword()).isEmpty())) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el campo usuario", "Intentelo nuevamente", ERROR_MESSAGE);
            return;
        } else if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "su contraseña debe ser alfanúmerica con mayúsculas y minúsculas además de contener cualquira de estos caracteres: !*_", "Intentelo nuevamente", ERROR_MESSAGE);
            return;
        }
        //fin validaciones formulario
        
        
        String queryDB = "select idRegistro, primer_nombre, segundo_nombre, "
                + "primer_apellido, segundo_apellido "
                + "from tb_registro "
                + "where usuario = ? and clave = ?";

        TbRegistro registro = null;

        try (Connection conn = conexionDB.obtenerConexion(); PreparedStatement ps = conn.prepareStatement(queryDB)) {

            ps.setString(1, txtUser.getText());
            ps.setString(2, String.valueOf(txtPassword.getPassword()));

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Encontro registro! se lee el resultado");

                    registro = new TbRegistro();

                    registro.setIdRegistro(rs.getLong(1));
                    registro.setPrimerNombre(rs.getString(2));
                    registro.setSegundoNombre(rs.getString(3));
                    registro.setPrimerApellido(rs.getString(4));
                    registro.setSegundoApellido(rs.getString(5));
                } else {
                    System.err.println("No se encontraron registro del usuario");
                    JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos", "Intentelo nuevamente", ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            //TODO: Presentar error amigable
            JOptionPane.showMessageDialog(null, "Lo sentimos tuvimos problemas al iniciar sesión", "Intentelo nuevamente", ERROR_MESSAGE);

        }

        if (Objects.nonNull(registro)) {
            //TODO: Cambiar a la pagina principal
            this.dispose();
            menuPrincipal menu = new menuPrincipal();
            menu.setVisible(true);

        } else {
            //TODO: Presentar error de login fallido
            System.err.println("Problemas con el login, no se lleno el objeto registro");
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        registrarUsuarios registrar = new registrarUsuarios();
        registrar.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
