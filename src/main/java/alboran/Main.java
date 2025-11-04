package alboran;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        String tipoAceituna = "";
        String nombreProductor="";
        int tamanioAceituna = 0;
        double kg = 0;
        double precioVenta = 0;

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
                        nombreProductor = JOptionPane.showInputDialog("¿Cómo te llamas?");
                        // Pedir tipo
                        tipoAceituna = Funciones.pedirTipoAceituna();
                        //System.out.println("El tipo es: " + tipoAceituna);
                        // Pedir tamaño
                        // Devuelve un int indicando 1 gruesa y 2 fina
                        tamanioAceituna = Funciones.pedirTamanioAceituna();
                        //System.out.println("El tamaño es " + pasarTamanioAceituna(tamanioAceituna));
                        // Pedir kg
                        kg = Funciones.pedirKg();
                        //System.out.println("Los kg son " + kg);
                        // calcular
                        // Necesitamos: Precio inicial kg, total kg, tipo y tamaño aceituna
                        // Devuelve: precio venta double
                        precioVenta = Funciones.calcularPrecioVenta(Funciones.PRECIO_INICIAL, kg, pasarTamanioAceituna(tamanioAceituna), tipoAceituna);    
                        //System.out.println("El precio de venta es " + precioVenta);

                        String resultado = """
                                El vendedor %s, trae a la almazara de Estepona
                                %s kg de aceituna %s %s y se le ha vendido a %.3f€
                                """.formatted(nombreProductor, kg, pasarTamanioAceituna(tamanioAceituna),tipoAceituna, precioVenta);

                        System.out.println(resultado);        
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