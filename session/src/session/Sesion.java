package session;

import java.io.BufferedReader; // Lee el texto de un flujo de entrada de caracteres

import java.io.FileReader; // Importa la clase de archivo

import java.io.IOException; // Importa esta clase para manejar errores

public class Sesion {

    public boolean login(String nombreusuario, String contraseña) {

        // Abre el archivo en el directorio de activos

        String rutaarchivo = "./assets/usuarios.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaarchivo))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Divide la linea en campos

                String[] fields = line.split("#");

                if (fields.length >= 3 && fields[1].equals(contraseña) && fields[0].equals(nombreusuario)) {

                    // Si el nombre de usuario y la contraseña coinciden devuelve verdadero


                    return true;

                }

            }

        } catch (IOException e) {

            // Si hay un error al abrir el archivo, devuelve falso

            System.err.println("Error no se pudo abrir: " + e.getMessage());

        }

        // Si no se encuentra ninguna coincidencia, devuelve falso

        return false;

    }

}