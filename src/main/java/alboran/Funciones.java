package alboran;

import javax.swing.JOptionPane;

public class Funciones {

    public static int pedirOpcion(){
        int opcion = 0;
        String opcionString;
        opcionString = JOptionPane.showInputDialog(Mensajes.menuInicial);
        opcion = Integer.parseInt(opcionString);
        return opcion;
    }

}
