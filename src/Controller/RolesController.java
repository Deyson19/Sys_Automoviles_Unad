/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Configuration.ConexionLocal;
import Models.ErroresSistema;
import Models.Roles;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class RolesController {

    private Connection cnn;
    private final ConexionLocal connConsultar = new ConexionLocal();
    private Roles mostrarRoles = new Roles();

    public List<Roles> traerRoles() {
        List<Roles> roles = new ArrayList<>();
        ErroresSistema errorCrear = new ErroresSistema();
        String sql = "SELECT rolname, idRoles FROM roles ORDER BY idRoles";

        try {
            connConsultar.conectar();
            PreparedStatement stmt = connConsultar.getConexion().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Roles rol = new Roles();
                rol.setNombreRol(rs.getString("rolname"));
                rol.setIdRol(rs.getInt("idRoles"));
                roles.add(rol);
            }
            return roles;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar: " + this.getClass().getName());
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            errorCrear.insertarError(errorCrear);

            return Collections.emptyList();
        }
    }

    public List<Roles> obtenerRoles() {
        return traerRoles(); // devuelve la lista de roles recuperados
    }

}
