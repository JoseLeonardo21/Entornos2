package metodosestaticos;

public class Utils {

	 // Este metodo verifica si tres valores forman un triangulo y devuelve su tipo
    public static String tipoTriangulo(double lado1, double lado2, double lado3) {
        if (esTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                return "EQUILATERO";
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                return "ISOSCELES";
            } else {
                return "ESCALENO";
            }
        } else {
            return "ERROR";
        }
    }

    // Este metodo verifica si tres valores forman un triangulo
    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    // Este metodo encuentra el valor mas frecuente en un array de enteros
    public static int masFrecuenteInt(int[] array) {
        int maxCount = 0;
        int mostFrequent = array[0];

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = array[i];
            }
        }

        return mostFrequent;
    }

    // Este metodo busca un valor en un array de enteros y devuelve su indice
    public static int buscarInt(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
		

	


