
package Forms.panelPrincipal.Reportes;

import Controller.VehiculosController;
import DTOs.VehiculosDTO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deyson Vente
 */
public class frmHistorial extends javax.swing.JInternalFrame {

    public frmHistorial() {
        initComponents();

        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHistorial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListarHistorial = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        lblHistorial.setBackground(new java.awt.Color(0, 204, 204));
        lblHistorial.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        lblHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorial.setText("Listado del historial de cada vehículo en el sistema");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(lblHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHistorial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbListarHistorial.setAutoCreateRowSorter(true);
        tbListarHistorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), java.awt.Color.orange, new java.awt.Color(0, 255, 255), java.awt.Color.darkGray));
        tbListarHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbListarHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tbListarHistorial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JTable tbListarHistorial;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        VehiculosController listadoVehiculosRecuperados = new VehiculosController();
        List<VehiculosDTO> listadoVehiculos = listadoVehiculosRecuperados.listaCompleta();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Placa");
        modelo.addColumn("Tipo");
        modelo.addColumn("Estado ID");
        modelo.addColumn("Propietario ID");
        modelo.addColumn("Ingreso");
        modelo.addColumn("Salida");
        modelo.addColumn("Motivo");
        modelo.addColumn("Costo");

        tbListarHistorial.setModel(modelo);
        for (VehiculosDTO vehiculos : listadoVehiculos) {
            Object[] fila = new Object[8];
            fila[0] = vehiculos.getPlaca();
            fila[1] = vehiculos.getTipoVehiculo_Id();
            fila[2] = vehiculos.getEstado();
            fila[3] = vehiculos.getPropietario_Id();
            fila[4] = vehiculos.getFechaEntrada();
            fila[5] = vehiculos.getFechaSalida();
            fila[6] = vehiculos.getRazonIngreso();
            fila[7] = vehiculos.getCostoServicio();
            modelo.addRow(fila);

        }
        tbListarHistorial.setModel(modelo);

        tbListarHistorial.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbListarHistorial.doLayout();
        tbListarHistorial.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

}
