/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
public class Competidor extends Persona {

    private int rankingMundial;
    private double estatura;
    private double peso;
    private int puntosTotales;

    public Competidor(String nombre, int edad, String pais, int rankingMundial, double estatura, double peso) {
        super(nombre, edad, pais);
        this.rankingMundial = rankingMundial;
        this.estatura = estatura;
        this.peso = peso;
        this.puntosTotales = 0;
    }

    // Métodos getter y setter
    public int getRankingMundial() {
        return rankingMundial;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setRankingMundial(int rankingMundial) {
        this.rankingMundial = rankingMundial;
    }  
} 
