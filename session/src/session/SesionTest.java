package session;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SesionTest {

    private Sesion sesion = new Sesion();


    @Test

    public void testLoginTrue() {

        // Test con nombre de usuario y contraseña valida

        boolean result = sesion.login("dmunuera", "123456");

        assertEquals(true, result);

    }


    @Test

    public void testLoginTrue2() {

        // Test con otro usuario y contraseña valida

        boolean result = sesion.login("pepe", "654321");

        assertEquals(true, result);

    }


    @Test

    public void testLoginFalse() {

        // Test con usuario y contraseña falsa

        boolean result = sesion.login("invalido", "invalido");

        assertEquals(false, result);

    }


    @Test

    public void testLoginFalse2() {

        // Test con usuario y contraseña no existente

        boolean result = sesion.login("noexiste", "noexiste");

        assertEquals(false, result);

    }

}