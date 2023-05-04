package Forms;

import Configuration.ConexionLocal;
import Controller.UsuarioAdminController;
import Helpers.ValidarPassword;
import Models.UsuarioAdmin;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class frmNuevoAdmin extends javax.swing.JFrame {

    ValidarPassword validarPassword = ValidarPassword.getInstanciaValidarPassword();

    public frmNuevoAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        imgLogin = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        txtConfirmaClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblPassword.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        lblPassword.setText("Contraseña:");

        lblUsuario.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        lblUsuario.setText("Nombre Usuario:");

        lblIniciarSesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        lblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarSesion.setText("Crear nuevo usuario administrador");
        lblIniciarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIngresar.setBackground(new java.awt.Color(255, 255, 51));
        btnIngresar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnIngresar.setText("Registrar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnCancelar.setText("Calcelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        imgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        imgLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblPassword1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        lblPassword1.setText("Confirmar Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(lblIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(142, 142, 142))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnIngresar)
                                                .addGap(161, 161, 161))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(231, 231, 231))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblPassword,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblUsuario,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblPassword1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnCancelar)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(txtConfirmaClave,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 300,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(txtClave,
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtUsuario)))
                                                .addGap(152, 152, 152)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 128,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPassword1)
                                        .addComponent(txtConfirmaClave, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCancelar)
                                        .addComponent(btnIngresar))
                                .addGap(34, 34, 34)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        UsuarioAdmin nAdmin = new UsuarioAdmin();
        String usuario = txtUsuario.getText().trim();
        String clave = new String(txtClave.getPassword());
        String confirmacion = new String(txtConfirmaClave.getPassword());

        if (usuario.isEmpty() || clave.isEmpty() || confirmacion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        } else if (!clave.equals(confirmacion)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            txtConfirmaClave.requestFocus();
            return;
        } else {
            if (usuario.length() < 8) {
                JOptionPane.showMessageDialog(rootPane, "Debes ingresar un usuario más largo.");
                txtUsuario.requestFocus();
                return;
            }
            if (clave.length() < 10 && confirmacion.length() < 10) {
                JOptionPane.showMessageDialog(rootPane, "Debes ingresar una contraseña más larga.");
                txtClave.requestFocus();
                return;
            } else {
                if (validarPassword.Comprueba(clave)) {
                    // Los campos de entrada son válidos
                    // Continúa con el procesamiento de los datos
                    nAdmin.setUsuario(usuario);
                    nAdmin.setPassword(clave);

                    nAdmin.encriptaPassword(nAdmin);
                    limpiezaCampos();
                    return;
                }
                JOptionPane.showMessageDialog(null, "Esta contraseña no es segura, ingresa una nueva. Debe incluir signos, letras y/o números.", "Contraseña Insegura", HEIGHT);
            }

        }

    }// GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiezaCampos();
    }// GEN-LAST:event_btnCancelarActionPerformed

    void limpiezaCampos() {
        txtUsuario.setText("");
        // Limpiar campos de contraseña de forma segura
        char[] claveVacia = new char[txtClave.getPassword().length];
        Arrays.fill(claveVacia, '0');
        txtClave.setText("");
        Arrays.fill(claveVacia, '0');
        txtConfirmaClave.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmNuevoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNuevoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNuevoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNuevoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmNuevoAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel imgLogin;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirmaClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
