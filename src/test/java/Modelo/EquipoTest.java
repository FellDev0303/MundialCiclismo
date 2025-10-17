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
public class EquipoTest {

    @Test
    public void testAgregarCompetidor() {
        Equipo e = new Equipo("Team A", "Colombia");
        Competidor c = new Competidor("Carlos", 22, "Colombia", 15, 1.70, 65);
        assertTrue(e.agregarCompetidor(c));
        assertEquals(1, e.getContadorCompetidores());
    }

    @Test
    public void testListarCompetidores() {
        Equipo e = new Equipo("Team B", "España");
        Competidor c = new Competidor("Luis", 29, "España", 12, 1.82, 75);
        e.agregarCompetidor(c);
        String lista = e.listarCompetidores();
        assertTrue(lista.contains("Luis"));
    }

}
