public class Ej4_EstruControlMultiple {

    //multiple en restaurante
    public static void menuRestaurante(int opcion) {
        System.out.println("\n***Menú del Restaurante***");

        switch (opcion) {
            case 1:
                System.out.println("Categoria seleccionada: Entradas.");
                System.out.println("Platos disponibles: Sopa, Ensalada.");
                break;
            case 2:
                System.out.println("Categoria seleccionada: Platos principales.");
                System.out.println("Platos disponibles: Arroz con pollo, Bandeja paisa.");
                break;
            case 3:
                System.out.println("Categoria seleccionada: Postres.");
                System.out.println("Platos disponibles: Flan, Helado.");
                break;
            default:
                System.out.println("esta opcion no es valida en nuestro restaurante, por favor verifique");
        }
    }

    //tienda de barrio
    public static void menuTienda(int opcion) {
        System.out.println("\n***categorias en mi tienda***");

        switch (opcion) {
            case 1:
                System.out.println("Categoria seleccionada: Bebidas.");
                System.out.println("Productos disponibles: Agua, Gaseosa, Jugo.");
                break;
            case 2:
                System.out.println("Categoria seleccionada: Snacks.");
                System.out.println("Productos disponibles: Papas, Galletas.");
                break;
            case 3:
                System.out.println("Categoria seleccionada: Productos de limpieza.");
                System.out.println("Productos disponibles: Jabón, Detergente.");
                break;
            default:
                System.out.println("esta opcion no es valida en esta tienda, favor verificar");
        }
    }

    //electrodomesticos
    public static void menuElectrodomesticos(int opcion) {
        System.out.println("\n***opciones en electrodomesticos***");

        switch (opcion) {
            case 1:
                System.out.println("Categoria seleccionada: Neveras.");
                System.out.println("Modelos disponibles: Nevera estandar, Nevera doble puerta.");
                break;
            case 2:
                System.out.println("Categoria seleccionada: Estufas.");
                System.out.println("Modelos disponibles: Estufa a gas, Estufa electrica.");
                break;
            case 3:
                System.out.println("Categoria seleccionada: Licuadoras.");
                System.out.println("Modelos disponibles: Licuadora basica, Licuadora profesional.");
                break;
            default:
                System.out.println("esta opción no es valida para electrodomesticos, favor verificar");
        }
    }

    public static void main(String[] args) {
        int opcionRestaurante = 6;
        int opcionTienda = 7;
        int opcionElectrodomesticos = 9;


        menuRestaurante(opcionRestaurante);
        menuTienda(opcionTienda);
        menuElectrodomesticos(opcionElectrodomesticos);
    }
}