/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

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
public class ControladorCompetenciaTest {
    @Test
    public void testFlujoCompleto() {
        
        Competencia comp = new Competencia("Mundial");
        Equipo e = new Equipo("Team X", "Brasil");
        comp.agregarEquipo(e);

        Competidor c = new Competidor("Ronaldo", 26, "Brasil", 25, 1.80, 70);
        comp.agregarCompetidorAEquipo(0, c);

        
        c.actualizarRanking(50);

       
        assertEquals(50, c.getPuntosTotales());
        assertTrue(comp.generarReporte().contains("Ronaldo"));
    }
    
}
