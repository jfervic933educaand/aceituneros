package alboran;

import javax.swing.JOptionPane;
// Importamos la clase venta del paquete modelos
import modelos.Venta;

public class Main {
    public static void main(String[] args) {

        // Variables de tipo array para guardar los datos del programa
        // Los arrays de objetos se crean con el contenido de cada casilla
        // apuntando a null
        Venta[] ventas = new Venta[50];
        String nombre, tipo, tamanio;
        double kg, precioVenta;

        // Variable para controlar las posiciones de los arrays
        // Empieza introduciendo la primera venta en la posición cero, luego la 1 ,...
        int contadorVentas = 0;
        int opcion = 0;

        do {

            try {
                opcion = Funciones.pedirOpcion();
                // Si continua mi programa por aquí significa
                // que no hay excepción NumberFormat
                switch (opcion) {
                    case 0 -> {
                        JOptionPane.showMessageDialog(null, "Hasta pronto");
                    }
                    case 1 -> {
                        // Vender
                        // Pedir nombre
                        nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
                        // Pedir tipo
                        tipo = Funciones.pedirTipoAceituna();
                        // System.out.println("El tipo es: " + tipoAceituna);
                        // Pedir tamaño
                        // Devuelve un int indicando 1 gruesa y 2 fina
                        tamanio = pasarTamanioAceituna(Funciones.pedirTamanioAceituna());
                        // System.out.println("El tamaño es " + pasarTamanioAceituna(tamanioAceituna));
                        // Pedir kg
                        kg = Funciones.pedirKg();
                        // System.out.println("Los kg son " + kg);
                        // calcular
                        // Necesitamos: Precio inicial kg, total kg, tipo y tamaño aceituna
                        // Devuelve: precio venta double
                        precioVenta= Funciones.calcularPrecioVenta(Funciones.PRECIO_INICIAL,
                                kg, tamanio, tipo);
                        // System.out.println("El precio de venta es " + precioVenta);
                        Venta venta = new Venta(nombre, tamanio, tipo, kg, precioVenta);
                        //venta.mostrarValores();
                        // Se guarda en un array de ventas la venta creada
                        ventas[contadorVentas] = venta;
                        contadorVentas++;
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, "Ver todas las ventas");
                        for (int i = 0; i < contadorVentas; i++) {
                            // String resultado = """
                            //         El vendedor %s, trae a la almazara de Estepona
                            //         %s kg de aceituna %s %s y se le ha vendido a %.2f€
                            //         """.formatted(nombres[i], kgs[i],
                            //         tamanioAceitunas[i], tipoAceitunas[i],
                            //         preciosVenta[i]);
                            System.out.println(ventas[i]);

                            //System.out.println(resultado);
                        }

                    }

                    default -> {
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    }

                }

            } catch (NumberFormatException nfe) {
                // Repite el bucle al saltar la excepción
                opcion = -1;
            }

        } while (opcion != 0);
    }

    public static String pasarTamanioAceituna(int numero) {
        String tamanio;
        tamanio = numero == 1 ? Funciones.GRUESA : Funciones.FINA;
        return tamanio;
    }
}