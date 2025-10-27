package alboran;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;

        do {

            try {
                opcion = Funciones.pedirOpcion();
            } catch (NumberFormatException nfe) {
                // Repite el bucle al saltar la excepción
                opcion = 0;
            }

        } while (opcion != 2);
    }
}