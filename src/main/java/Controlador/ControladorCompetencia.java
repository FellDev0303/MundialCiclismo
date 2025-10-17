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

    public void registrarCompetidor() {
        if (competencia.getContadorEquipos() == 0) {
            JOptionPane.showMessageDialog(null, "Debe registrar al menos un equipo primero.");
            return;
        }

        String nombre = JOptionPane.showInputDialog("Nombre del competidor:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
        String pais = JOptionPane.showInputDialog("País:");
        int ranking = Integer.parseInt(JOptionPane.showInputDialog("Ranking mundial actual:"));
        double estatura = Double.parseDouble(JOptionPane.showInputDialog("Estatura (m):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso (kg):"));

        Competidor c = new Competidor(nombre, edad, pais, ranking, estatura, peso);
        String listaEquipos = competencia.listarEquipos();
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Seleccione equipo (índice):\n" + listaEquipos));

        boolean agregado = competencia.agregarCompetidorAEquipo(indice, c);

        if (agregado) {
            JOptionPane.showMessageDialog(null, "Competidor agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el competidor.");
        }
    }

}
