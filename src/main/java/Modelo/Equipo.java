/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Equipo {

    private String nombre;
    private String pais;
    private Competidor[] competidores;
    private int contadorCompetidores;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.competidores = new Competidor[10];
        this.contadorCompetidores = 0;
    }

    public boolean agregarCompetidor(Competidor c) {
        if (contadorCompetidores < competidores.length) {
            competidores[contadorCompetidores++] = c;
            return true;
        }
        return false;
    }

    public Competidor getCompetidor(int indice) {
        if (indice >= 0 && indice < contadorCompetidores) {
            return competidores[indice];
        }
        return null;
    }

    public int getContadorCompetidores() {
        return contadorCompetidores;
    }

    public String obtenerDatosEquipo() {
        return "Equipo: " + nombre + " | País: " + pais;
    }

    public String listarCompetidores() {
        String datos = "";
        for (int i = 0; i < contadorCompetidores; i++) {
            datos += (i + 1) + ". " + competidores[i].toString() + "\n";
        }
        return datos.isEmpty() ? "No hay competidores registrados.\n" : datos;
    }

}
