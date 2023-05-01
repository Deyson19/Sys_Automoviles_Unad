
package Forms.panelPrincipal;

import Controller.PropietarioController;
import DTOs.PropietarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class frmNuevoPropietario extends javax.swing.JInternalFrame {

   
    public frmNuevoPropietario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        lblInformacion = new javax.swing.JLabel();
        panelInformacion = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        placaVehiculo = new javax.swing.JLabel();
        placaVehiculo1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCartaPropiedad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbxDocumento = new javax.swing.JComboBox<>();
        lbl_IdBucar = new javax.swing.JLabel();
        txtBuscar_Id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pnlInferior = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingresar nuevo propietario");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/propietario.png"))); // NOI18N

        panelSuperior.setBackground(new java.awt.Color(102, 204, 255));

        lblInformacion.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacion.setText("Ingresa la información del nuevo propietario");
        lblInformacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 204, 204), new java.awt.Color(51, 255, 204)));

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lblInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformacion)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        panelInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(" Name "));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Documento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Dirección:");

        placaVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        placaVehiculo.setText("Nombres:");

        placaVehiculo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        placaVehiculo1.setText("Apellidos:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Carta propiedad:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Teléfono:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Correo:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Tipo documento:");

        cbxDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula Ciudadanía", "Pasaporte", "Cédula Extranjería" }));

        lbl_IdBucar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_IdBucar.setText("Buscar Id:");

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInformacionLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbl_IdBucar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar_Id))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(placaVehiculo)))
                            .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)))
                        .addGap(12, 12, 12)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCartaPropiedad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo))))
                .addGap(20, 20, 20)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(placaVehiculo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxDocumento, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cbxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCartaPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(placaVehiculo1))
                            .addComponent(placaVehiculo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_IdBucar)
                    .addComponent(txtBuscar_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlInferior.setBackground(new java.awt.Color(0, 153, 153));

        btnConsultar.setBackground(new java.awt.Color(255, 255, 204));
        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 153));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(153, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInferiorLayout = new javax.swing.GroupLayout(pnlInferior);
        pnlInferior.setLayout(pnlInferiorLayout);
        pnlInferiorLayout.setHorizontalGroup(
            pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        pnlInferiorLayout.setVerticalGroup(
            pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnNuevo)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInformacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelInformacion.getAccessibleContext().setAccessibleName("Datos para el propietario");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        String idUsuario = txtBuscar_Id.getText();

        if (idUsuario.equals("")) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un ID para buscar.", "ATENCIÓN!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PropietarioController controller = new PropietarioController();
        PropietarioDTO traerDatos = controller.lectura(Integer.parseInt(idUsuario));

        if (traerDatos != null) {
            txtNombres.setText(traerDatos.getNombre());
            txtApellidos.setText(traerDatos.getApellido());
            txtDocumento.setText(traerDatos.getCedula());
            txtDocumento.setEditable(false);
            txtDireccion.setText(traerDatos.getDireccion());
            txtCartaPropiedad.setText(traerDatos.getCarta_Propiedad());
            txtCartaPropiedad.setEditable(false);
            txtTelefono.setText(traerDatos.getNumeroCelular());
            txtCorreo.setText(traerDatos.getCorreo());
            txtCorreo.setEditable(false);

            switch (traerDatos.getTipoDocumento()) {
                case "Cedula Ciudadania":
                    cbxDocumento.setSelectedIndex(0);
                    break;
                case "Pasaporte":
                    cbxDocumento.setSelectedIndex(1);
                    break;
                case "Cedula Extranjeria":
                    cbxDocumento.setSelectedIndex(2);
                    break;
                default:
                    System.out.println("Entra aquí porque no toma un dato seleccionado.");
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        String nombre, apellidos, telefono, documento, carta_propiedad, correo;
        String tipoDocumento = null;
        nombre = txtNombres.getText();
        apellidos = txtApellidos.getText();
        documento = txtDocumento.getText();
        carta_propiedad = txtCartaPropiedad.getText();
        telefono = txtTelefono.getText();
        correo = txtCorreo.getText();
        if (nombre.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || documento.isEmpty() || carta_propiedad.isEmpty() || correo.isEmpty()) {
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        } else {
            // Los campos de entrada son válidos
            // Continúa con el procesamiento de los datos
            switch (cbxDocumento.getSelectedIndex()) {
                case 0:
                    //Admin
                    tipoDocumento = "Cedula de Ciudadania";
                    break;
                case 1:
                    //Propietario
                    tipoDocumento = "Pasaporte";
                    break;
                default:
                    //Empleado
                    tipoDocumento = "Cedula de Extranjeria";
                    break;
            }
            PropietarioDTO nuevoPropietario = new PropietarioDTO();
            nuevoPropietario.setNombre(nombre);
            nuevoPropietario.setApellido(apellidos);
            nuevoPropietario.setCarta_Propiedad(carta_propiedad);
            nuevoPropietario.setDireccion(txtDireccion.getText());
            nuevoPropietario.setCedula(documento);
            nuevoPropietario.setTipoDocumento(tipoDocumento);
            nuevoPropietario.setNumeroCelular(telefono);
            nuevoPropietario.setCorreo(correo);

            PropietarioController ingresarPropietario = new PropietarioController();
            ingresarPropietario.creacion(nuevoPropietario);
            limpiarCampos();
        }


    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String nombre, apellidos, telefono;
        String tipoDocumento = null;
        nombre = txtNombres.getText();
        apellidos = txtApellidos.getText();
        telefono = txtTelefono.getText();
        if (nombre.isEmpty() || apellidos.isEmpty() || telefono.isEmpty()) {
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        } else {
            // Los campos de entrada son válidos
            // Continúa con el procesamiento de los datos
            switch (cbxDocumento.getSelectedIndex()) {
                case 0:
                    //Admin
                    tipoDocumento = "Cedula de Ciudadania";
                    break;
                case 1:
                    //Propietario
                    tipoDocumento = "Pasaporte";
                    break;
                default:
                    //Empleado
                    tipoDocumento = "Cedula de Extranjeria";
                    break;
            }
            PropietarioDTO nuevoPropietario = new PropietarioDTO();
            nuevoPropietario.setNombre(nombre);
            nuevoPropietario.setApellido(apellidos);
            nuevoPropietario.setDireccion(txtDireccion.getText());
            nuevoPropietario.setTipoDocumento(tipoDocumento);
            nuevoPropietario.setNumeroCelular(telefono);

            PropietarioController ingresarPropietario = new PropietarioController();
            int id_propietario = Integer.parseInt(txtBuscar_Id.getText());

            ingresarPropietario.actualizacion(nuevoPropietario, id_propietario);
            limpiarCampos();
            habilitarCampos();
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed

        String idUsuario = txtBuscar_Id.getText();

        if (idUsuario.equals("")) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un ID de Propietario");

        } else {
            PropietarioController eliminar = new PropietarioController();
            eliminar.eliminacion(Integer.parseInt(idUsuario));
            limpiarCampos();
            habilitarCampos();
        }

    }//GEN-LAST:event_btnEliminar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxDocumento;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lbl_IdBucar;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel placaVehiculo;
    private javax.swing.JLabel placaVehiculo1;
    private javax.swing.JPanel pnlInferior;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar_Id;
    private javax.swing.JTextField txtCartaPropiedad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {

        txtNombres.setText("");
        txtApellidos.setText("");
        txtDocumento.setText("");
        txtDireccion.setText("");
        txtCartaPropiedad.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtBuscar_Id.setText("");
        txtCartaPropiedad.setText("");
        cbxDocumento.setSelectedIndex(0);
        txtDocumento.setText("");
        txtCorreo.setText("");

    }

    void habilitarCampos() {
        txtCartaPropiedad.setEditable(true);
        txtCorreo.setEditable(true);
        txtDocumento.setEditable(true);
    }
}
