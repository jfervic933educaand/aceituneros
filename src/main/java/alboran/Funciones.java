package alboran;

import javax.swing.JOptionPane;

public class Funciones {

    public static final String ALORENA = "aloreña";
    public static final String PICUAL = "picual";
    public static final String HOJIBLANCA = "hojiblanca";

    public static int pedirOpcion(){
        int opcion = 0;
        String opcionString;
        opcionString = JOptionPane.showInputDialog(Mensajes.menuInicial);
        opcion = Integer.parseInt(opcionString);
        return opcion;
    }

    // Función para pedir el tipo de aceituna
    // Devuelve un tipo de los tres posibles
    public static String pedirTipoAceituna(){
        String tipo="";
        do{
            tipo = JOptionPane.showInputDialog("Introduce un tipo de los posibles (picual, aloreña, hojiblanca)");
        } while(!tipo.equalsIgnoreCase(HOJIBLANCA)&&!tipo.equalsIgnoreCase(ALORENA)&&!tipo.equalsIgnoreCase(PICUAL));
       
        return tipo;
    }
}
