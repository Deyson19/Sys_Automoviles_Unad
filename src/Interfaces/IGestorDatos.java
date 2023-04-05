/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Deyson Vente
 * @param <O>
 */
public interface IGestorDatos<T> {
    void creacion(T _t);
    void actualizacion();
    void eliminacion();
    void recuperar();
}
