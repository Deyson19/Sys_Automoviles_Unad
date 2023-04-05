/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Deyson Vente
 */
public class MisConexiones {

    public static void main(String[] args) {
        String cadenaConexionLocal = "jdbc:mysql://localhost/db_sys_vehiclesjava";
        String usuarioLocal, claveLocal;
        usuarioLocal = "root";
        claveLocal = "";
        String cadenaConexionRemota = "jdbc:mysql://68.178.244.186/db_sys_vehiclesJava?useSSL=false";
        String usuarioRemoto = "Sys_vehicles_java";
        String claveRemota = "admin.mrkurt95";

//Probando las interfaces para las conexiones
        ConexionLocal cnnLocal = new ConexionLocal();
        cnnLocal.conectar();
        System.out.println("Conexion abierta");
        cnnLocal.testearConexion();
        System.out.println("Funcionará la conexion?");

    }

}
