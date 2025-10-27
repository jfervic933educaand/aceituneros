package alboran;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;

        do {

            try {
                opcion = Funciones.pedirOpcion();
                // Si continua mi programa por aquí significa
                // que no hay excepción NumberFormat
                switch (opcion) {
                    case 1 -> {
                        // Vender
                        // Pedir tipo
                        // Pedir tamaño
                        // Pedir kg
                        // calcular
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, "Hasta pronto");
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");

                    }

                }

            } catch (NumberFormatException nfe) {
                // Repite el bucle al saltar la excepción
                opcion = 0;
            }

        } while (opcion != 2);
    }
}