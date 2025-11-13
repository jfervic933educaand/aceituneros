package alboran;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Variables de tipo array para guardar los datos del programa
        // Los arrays de objetos se crean con el contenido de cada casilla
        // apuntando a null
        String[] nombres = new String[50];
        String[] tipoAceitunas = new String[50];
        String[] tamanioAceitunas = new String[50];
        // Los arrays de numeros se crean con el contenido de cada casilla
        // a 0.0
        double[] kgs = new double[50];
        double[] preciosVenta = new double[50];

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
                    case 0->{
                        JOptionPane.showMessageDialog(null, "Hasta pronto");
                    }
                    case 1 -> {
                        // Vender
                        // Pedir nombre
                        nombres[contadorVentas] = JOptionPane.showInputDialog("¿Cómo te llamas?");
                        // Pedir tipo
                        tipoAceitunas[contadorVentas] = Funciones.pedirTipoAceituna();
                        //System.out.println("El tipo es: " + tipoAceituna);
                        // Pedir tamaño
                        // Devuelve un int indicando 1 gruesa y 2 fina
                        tamanioAceitunas[contadorVentas] = pasarTamanioAceituna(Funciones.pedirTamanioAceituna());
                        //System.out.println("El tamaño es " + pasarTamanioAceituna(tamanioAceituna));
                        // Pedir kg
                        kgs[contadorVentas] = Funciones.pedirKg();
                        //System.out.println("Los kg son " + kg);
                        // calcular
                        // Necesitamos: Precio inicial kg, total kg, tipo y tamaño aceituna
                        // Devuelve: precio venta double
                        preciosVenta[contadorVentas] = Funciones.calcularPrecioVenta(Funciones.PRECIO_INICIAL, kgs[contadorVentas], tamanioAceitunas[contadorVentas], tipoAceitunas[contadorVentas]);    
                        //System.out.println("El precio de venta es " + precioVenta);

                        String resultado = """
                                El vendedor %s, trae a la almazara de Estepona
                                %s kg de aceituna %s %s y se le ha vendido a %.3f€
                                """.formatted(nombres[contadorVentas], kgs[contadorVentas], 
                                tamanioAceitunas[contadorVentas],tipoAceitunas[contadorVentas],
                                 preciosVenta[contadorVentas]);

                        System.out.println(resultado);     
                        contadorVentas++;   
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, "Ver todas las ventas");
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

    public static String pasarTamanioAceituna(int numero){
        String tamanio;
        tamanio = numero == 1?Funciones.GRUESA:Funciones.FINA;
        return tamanio;
    }
}