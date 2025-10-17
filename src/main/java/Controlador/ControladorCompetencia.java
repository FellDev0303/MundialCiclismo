/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ControladorCompetencia {

    private Competencia competencia;

    public ControladorCompetencia(String nombreEvento) {
        this.competencia = new Competencia(nombreEvento);
    }

    public void registrarEquipo() {
        String nombre = JOptionPane.showInputDialog("Nombre del equipo:");
        String pais = JOptionPane.showInputDialog("País del equipo:");
        Equipo eq = new Equipo(nombre, pais);
        if (competencia.agregarEquipo(eq)) {
            JOptionPane.showMessageDialog(null, "Equipo registrado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el equipo (límite alcanzado).");
        }
    }

}
