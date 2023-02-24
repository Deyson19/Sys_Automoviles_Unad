/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Forms.panelPrincipal;

/**
 *
 * @author Deyson Vente
 */
public class frmNuevoVehiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmNuevoVehiculo
     */
    public frmNuevoVehiculo() {
        initComponents();
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
        lblInformacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCostoServicio = new javax.swing.JLabel();
        txtPropietarioVehiculo = new javax.swing.JTextField();
        cbxTipoVehiculo = new javax.swing.JComboBox<>();
        lblDocPropietario = new javax.swing.JLabel();
        txtFechaIngresoV = new javax.swing.JTextField();
        lblMotivoIngresoV = new javax.swing.JLabel();
        lblFechaIngresoV = new javax.swing.JLabel();
        lblEstadoV = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        lblTipoV = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        txtPlacaVehiculo = new javax.swing.JTextField();
        txtDuracionServicio = new javax.swing.JTextField();
        placaVehiculo = new javax.swing.JLabel();
        lblDuracionServicio = new javax.swing.JLabel();
        txtCostoServicio = new javax.swing.JTextField();
        txtFechaEntregaV = new javax.swing.JTextField();
        txtMotivoIngresoV = new javax.swing.JTextField();
        lblfechaEntrega = new javax.swing.JLabel();
        cbxEstadoVehiculo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        pnlInferior = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();

        setClosable(true);
        setForeground(new java.awt.Color(255, 255, 102));
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coche.png"))); // NOI18N

        lblInformacion.setBackground(new java.awt.Color(153, 255, 204));
        lblInformacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInformacion.setForeground(new java.awt.Color(0, 204, 204));
        lblInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacion.setText("Ingresa la información del nuevo vehículo");
        lblInformacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(lblInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformacion)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar datos del vehículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 12))); // NOI18N

        lblCostoServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCostoServicio.setText("Costo Servicio:");

        txtPropietarioVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        cbxTipoVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automóvil", "Camioneta", "Motocarro", "Quads", "Turismo" }));

        lblDocPropietario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDocPropietario.setText("Documento Propietario:");

        txtFechaIngresoV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lblMotivoIngresoV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMotivoIngresoV.setText("Motivo de Ingreso:");

        lblFechaIngresoV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFechaIngresoV.setText("Fecha ingreso:");

        lblEstadoV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEstadoV.setText("Estado:");

        txtTurno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lblTipoV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTipoV.setText("Tipo Vehículo:");

        lblTurno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTurno.setText("Turno:");

        txtPlacaVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtDuracionServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        placaVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        placaVehiculo.setText("Placa:");

        lblDuracionServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDuracionServicio.setText("Duración:");

        txtCostoServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtFechaEntregaV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lblfechaEntrega.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfechaEntrega.setText("Fecha entrega:");

        cbxEstadoVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxEstadoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bueno", "Malo", "Regular" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoV)
                            .addComponent(lblEstadoV)
                            .addComponent(placaVehiculo))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(txtPlacaVehiculo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(cbxTipoVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(cbxEstadoVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDocPropietario)
                            .addComponent(lblFechaIngresoV)
                            .addComponent(lblMotivoIngresoV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaIngresoV)
                            .addComponent(txtPropietarioVehiculo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMotivoIngresoV))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCostoServicio)
                    .addComponent(lblfechaEntrega)
                    .addComponent(lblDuracionServicio)
                    .addComponent(lblTurno))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTurno)
                        .addGap(18, 18, 18))
                    .addComponent(txtCostoServicio)
                    .addComponent(txtFechaEntregaV)
                    .addComponent(txtDuracionServicio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaEntregaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfechaEntrega))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCostoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDuracionServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTurno)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placaVehiculo)
                            .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoV)
                            .addComponent(cbxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostoServicio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstadoV)
                            .addComponent(cbxEstadoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDuracionServicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocPropietario)
                            .addComponent(txtPropietarioVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaIngresoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaIngresoV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMotivoIngresoV)
                            .addComponent(txtMotivoIngresoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pnlInferior.setBackground(new java.awt.Color(51, 255, 255));

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
                .addGap(37, 37, 37)
                .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(123, 123, 123)
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pnlInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed

    }//GEN-LAST:event_btnEliminar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxEstadoVehiculo;
    private javax.swing.JComboBox<String> cbxTipoVehiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCostoServicio;
    private javax.swing.JLabel lblDocPropietario;
    private javax.swing.JLabel lblDuracionServicio;
    private javax.swing.JLabel lblEstadoV;
    private javax.swing.JLabel lblFechaIngresoV;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblMotivoIngresoV;
    private javax.swing.JLabel lblTipoV;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblfechaEntrega;
    private javax.swing.JLabel placaVehiculo;
    private javax.swing.JPanel pnlInferior;
    private javax.swing.JTextField txtCostoServicio;
    private javax.swing.JTextField txtDuracionServicio;
    private javax.swing.JTextField txtFechaEntregaV;
    private javax.swing.JTextField txtFechaIngresoV;
    private javax.swing.JTextField txtMotivoIngresoV;
    private javax.swing.JTextField txtPlacaVehiculo;
    private javax.swing.JTextField txtPropietarioVehiculo;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}