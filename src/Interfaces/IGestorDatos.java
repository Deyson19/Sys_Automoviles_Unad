/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Deyson Vente
 * @param <T>
 */
public interface IGestorDatos<T> {
    void creacion(T objeto);
    T lectura(int id);
    void actualizacion(T objeto);
    void eliminacion(int id);
}
