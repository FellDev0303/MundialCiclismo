/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Competencia {
    private String nombreCompetencia;
    private Equipo[] equipos;
    private int contadorEquipos;

    public Competencia(String nombreCompetencia) {
        this.nombreCompetencia = nombreCompetencia;
        this.equipos = new Equipo[30];
        this.contadorEquipos = 0;
    }

    public boolean agregarEquipo(Equipo e) {
        if (contadorEquipos < equipos.length) {
            equipos[contadorEquipos++] = e;
            return true;
        }
        return false;
    }

    public int getContadorEquipos() {
        return contadorEquipos;
    }

    public Equipo getEquipo(int indice) {
        if (indice >= 0 && indice < contadorEquipos) {
            return equipos[indice];
        }
        return null;
    }
    public boolean agregarCompetidorAEquipo(int indice, Competidor c) {
        if (indice >= 0 && indice < contadorEquipos) {
            return equipos[indice].agregarCompetidor(c);
        }
        return false;
    }
}
