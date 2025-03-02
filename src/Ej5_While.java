public class Ej5_While {

    //ahora este metodo nos ayudara mostrando las mesas ocupadas
    public static void mesasRestaurante() {
        System.out.println("\n*** Mesas Ocupadas en el Restaurante ***");
        int mesa = 1;

        while (mesa <= 5) {
            System.out.println("Mesa " + mesa + " está ocupada.");
            mesa++;
        }
    }

    //este nos ayudara a mostrar los productos que estan en la tienda
    public static void productosTienda() {
        System.out.println("\n*** Productos en Stock en la Tienda de Barrio ***");
        int producto = 1;
        int maxProductos = 4;

        while (producto <= maxProductos) {
            System.out.println("Producto " + producto + " está en stock.");
            producto++;
        }
    }

    //este nos mostrara los electrodomesticos
    public static void electrodomesticosDisponibles() {
        System.out.println("\n*** Electrodomésticos Disponibles ***");
        int modelo = 1;
        int maxModelos = 3;

        while (modelo <= maxModelos) {
            System.out.println("Electrodoméstico " + modelo + " está disponible.");
            modelo++;
        }
    }

    public static void main(String[] args) {
        mesasRestaurante();
        productosTienda();
        electrodomesticosDisponibles();
    }
}

