package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {
    private Estudiante estudiante1;
    private Estudiante estudiante2;
    private Estudiante estudiante3;

    @BeforeEach
    public void crearEstudiantes() {
        estudiante1 = new Estudiante("Estudiante1", 20, 8.5);
        estudiante2 = new Estudiante("Estudiante2", 22, 9.7);
        estudiante3 = new Estudiante("Estudiante3", 19, 4.2);
    }

    @Test
    public void testGetNombre() {
        assertEquals("Estudiante1", estudiante1.getNombre());
        assertEquals("Estudiante2", estudiante2.getNombre());
        assertEquals("Estudiante3", estudiante3.getNombre());
    }

    @Test
    public void testGetEdad() {
        assertEquals(20, estudiante1.getEdad());
        assertEquals(22, estudiante2.getEdad());
        assertEquals(19, estudiante3.getEdad());
    }

    @Test
    public void testGetNota() {
        assertEquals(8.5, estudiante1.getNota(), 0.001);
        assertEquals(9.7, estudiante2.getNota(), 0.001);
        assertEquals(4.2, estudiante3.getNota(), 0.001);
    }

    @Test
    public void testObtenerEstadoAcademico() {
        assertEquals("Notable", estudiante1.obtenerEstadoAcademico());
        assertEquals("Sobresaliente", estudiante2.obtenerEstadoAcademico());
        assertEquals("Suspenso", estudiante3.obtenerEstadoAcademico());
    }
}