/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import javax.swing.JOptionPane;
import Controlador.ControladorCompetencia;

/**
 *
 * @author LENOVO
 */
public class Taller2Punto1 {

    public static void main(String[] args) {
        ControladorCompetencia controlador = new ControladorCompetencia("Mundial de Ciclismo de Pista - Cali 2025");
        int opcion = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                        ==== MENÚ ====
                        1. Registrar equipo
                        2. Registrar competidor
                        3. Asignar puntos a competidor
                        4. Mostrar reporte general
                        5. Salir
                        """));

                switch (opcion) {
                    case 1 ->
                        controlador.registrarEquipo();
                    case 2 ->
                        controlador.registrarCompetidor();
                    case 3 ->
                        controlador.asignarPuntos();
                    case 4 ->
                        controlador.mostrarReporte();
                    case 5 ->
                        controlador.salir();
                    default ->
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        } while (true);
    }

}
