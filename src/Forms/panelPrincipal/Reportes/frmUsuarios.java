
package Forms.panelPrincipal.Reportes;

import Controller.UsuarioController;
import DTOs.UsuariosDTO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deyson Vente
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    public frmUsuarios() {
        initComponents();

        llenarTablas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbListarUsuarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblUsuarios = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios_1.png"))); // NOI18N

        tbListarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Rol", "Usuario"
            }
        ));
        jScrollPane1.setViewportView(tbListarUsuarios);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        lblUsuarios.setBackground(new java.awt.Color(0, 204, 204));
        lblUsuarios.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarios.setText("Listado de los usuarios del sistema de vehículos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(lblUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(225, 225, 225))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void llenarTablas() {
        UsuarioController listadoUsuariosRecuperados = new UsuarioController();
        List<UsuariosDTO> listadoUsuarios = listadoUsuariosRecuperados.listaCompleta();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Rol Asignado");
        modelo.addColumn("Nombre de Usuario");

        tbListarUsuarios.setModel(modelo);
        for (UsuariosDTO usuarios : listadoUsuarios) {
            Object[] fila = new Object[8];
            fila[0] = usuarios.getNombre();
            fila[1] = usuarios.getApellido();
            fila[2] = usuarios.getRol_Id();
            fila[3] = usuarios.getNombreUsuario();

            modelo.addRow(fila);

        }
        tbListarUsuarios.setModel(modelo);

        tbListarUsuarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbListarUsuarios.doLayout();
        tbListarUsuarios.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JTable tbListarUsuarios;
    // End of variables declaration//GEN-END:variables
}
