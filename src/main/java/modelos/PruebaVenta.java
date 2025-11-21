package modelos;

public class PruebaVenta {

    public static void main(String[] args) {

        // Instanciación de un objeto de tipo Venta
        // Para instanciar necesito el constructor y usar el 
        // operador new --> reservar memoria
        // 
        Venta v1 = new Venta("AgriculturaEstepona",
         "Fina", "Picual",100);

        v1.mostrarValores();

        Venta v2 = new Venta("Casares","Gruesa",
        "Hojiblanca" , 10);
        v2.mostrarValores();
        
    }

}
