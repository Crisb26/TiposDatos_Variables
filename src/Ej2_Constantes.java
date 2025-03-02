public class Ej2_Constantes {

    //ej contantes en unrestaurante
    public static void constantesRestaurante() {
        final String NOMBRE_RESTAURANTE = "La Buena Mesa"; //una constante que no se va a cambiar
        final float IVA = 0.19f; //un impuesto que no se va a cambiar mucho
        final int MAX_PLATOS = 50; //el tope que habria de platos

        System.out.println("\n*** Constantes del Restaurante ***");
        System.out.println("Nombre del Restaurante: " + NOMBRE_RESTAURANTE);
        System.out.println("IVA: " + (IVA * 100) + "%");
        System.out.println("Máximo de Platos: " + MAX_PLATOS);
    }

    //ej constantes en una tienda de barrio
    public static void constantesTienda() {
        final String NOMBRE_TIENDA = "Tienda del Vecino";
        final float IVA = 0.19f;
        final int MAX_PRODUCTOS = 100;

        System.out.println("\n*** Constantes de la Tienda ***");
        System.out.println("Nombre de la Tienda: " + NOMBRE_TIENDA);
        System.out.println("IVA: " + (IVA * 100) + "%");
        System.out.println("Máximo de Productos: " + MAX_PRODUCTOS);
    }

    // Método para constantes de electrodomésticos
    public static void constantesElectrodomesticos() {
        final String NOMBRE_TIENDA = "ElectroHogar";
        final float IVA = 0.19f;
        final int MAX_PRODUCTOS = 200;

        System.out.println("\n*** Constantes de Electrodomésticos ***");
        System.out.println("Nombre de la Tienda: " + NOMBRE_TIENDA);
        System.out.println("IVA: " + (IVA * 100) + "%");
        System.out.println("Máximo de Electrodomésticos: " + MAX_PRODUCTOS);
    }

    public static void main(String[] args) {
        constantesRestaurante();
        constantesTienda();
        constantesElectrodomesticos();
    }
}
