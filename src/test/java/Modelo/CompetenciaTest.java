/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Modelo.*;
/**
 *
 * @author LENOVO
 */
public class CompetenciaTest {

    @Test
    public void testAgregarEquipo() {
        Competencia comp = new Competencia("Mundial de Ciclismo");
        Equipo e = new Equipo("Team C", "Francia");
        assertTrue(comp.agregarEquipo(e));
    }

    @Test
    public void testAgregarCompetidorAEquipo() {
        Competencia comp = new Competencia("Mundial");
        Equipo e = new Equipo("Team D", "Italia");
        comp.agregarEquipo(e);
        Competidor c = new Competidor("Marco", 30, "Italia", 20, 1.75, 68);
        assertTrue(comp.agregarCompetidorAEquipo(0, c));
    }

    @Test
    public void testGenerarReporte() {
        Competencia comp = new Competencia("Mundial");
        Equipo e = new Equipo("Team E", "Alemania");
        comp.agregarEquipo(e);
        String reporte = comp.generarReporte();
        assertTrue(reporte.contains("MUNDIAL"));
        assertTrue(reporte.contains("Equipo"));
    }

}
