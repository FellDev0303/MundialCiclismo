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

/**
 *
 * @author LENOVO
 */
public class CompetidorTest {
    
    @Test
    public void testActualizarRankingInt() {
        Competidor c = new Competidor("Patapim", 25, "Colombia", 50, 1.78, 70);
        c.actualizarRanking(100);
        assertEquals(40, c.getRankingMundial()); 
        assertEquals(100, c.getPuntosTotales());
    }

    @Test
    public void testActualizarRankingDouble() {
        Competidor c = new Competidor("Sahur", 28, "Ecuador", 30, 1.80, 72);
        c.actualizarRanking(50.5);
        assertEquals(20, c.getRankingMundial()); 
        assertEquals(50, c.getPuntosTotales());
    }

    @Test
    public void testObtenerDatos() {
        Competidor c = new Competidor("Verónica", 23, "México", 10, 1.65, 55);
        String datos = c.obtenerDatos();
        assertTrue(datos.contains("Laura"));
        assertTrue(datos.contains("México"));
    }
}
