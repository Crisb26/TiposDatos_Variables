public class Ej1_DatosVariables {

    //ejercicio de datos de un restaurante
    public static void datosRestaurante() {
        byte mesa = 5; //numero de la mesa
        short precioPlato = 15000; //valor unitario de cada plato
        int calorias = 500; //cuantas calorias tendria el plato
        long idPlato = 123456789L; //el codigo que identificaria cada plato
        float descuento = 10.5f; //el descuento que tendria si hay promociones
        double precioFinal = 13495.50; //el precio final con su respectivo descuento
        char categoria = 'A'; //la categoria en este caso 'A' entrada, 'B' plato principal, etc
        boolean disponible = true; //disponibilidad del plato, true o false

        System.out.println("\n*** Datos del Restaurante ***");
        System.out.println("Mesa: " + mesa);
        System.out.println("Precio del plato: " + precioPlato);
        System.out.println("Calorías: " + calorias);
        System.out.println("ID del plato: " + idPlato);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("Categoría: " + categoria);
        System.out.println("Disponible: " + disponible);
    }

    //ejercicios basicos de datos de una tienda
    public static void datosTienda() {
        byte stock = 10;
        short precioProducto = 3000;
        int codigoBarras = 123456;
        long numeroProveedor = 9876543210L;
        float descuento = 5.5f;
        double precioConDescuento = 2849.50;
        char categoria = 'B';
        boolean disponible = true;

        System.out.println("\n*** Datos de la Tienda ***");
        System.out.println("Stock: " + stock);
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("Número del proveedor: " + numeroProveedor);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio con descuento: $" + precioConDescuento);
        System.out.println("Categoría: " + categoria);
        System.out.println("Disponible: " + disponible);
    }

    //ejercicio de datos de electrodomesticos
    public static void datosElectrodomesticos() {
        byte garantiaAnios = 2;
        short precioElectrodomestico = 25000;
        int capacidadLitros = 400;
        long numeroSerie = 987654321012345L;
        float descuento = 15.5f;
        double precioConDescuento = 1058750.75;
        char categoria = 'N';
        boolean disponible = true;

        System.out.println("\n*** Datos de Electrodomésticos ***");
        System.out.println("Garantía (años): " + garantiaAnios);
        System.out.println("PrecioElectrodomestico: $" + precioElectrodomestico);
        System.out.println("Capacidad (litros): " + capacidadLitros);
        System.out.println("Número de serie: " + numeroSerie);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio con descuento: $" + precioConDescuento);
        System.out.println("Categoría: " + categoria);
        System.out.println("Disponible: " + disponible);
    }

    public static void main(String[] args) {
        datosRestaurante();
        datosTienda();
        datosElectrodomesticos();
    }
}