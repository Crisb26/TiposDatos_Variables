public class Ej7_For {

    //restaurante
    public static void menuRestaurante() {
        System.out.println("\n*** Menú del Restaurante ***");
        String[] categorias = {"Entradas", "Platos principales", "Postres"};
        String[][] platos = {
                {"Sopa", "Ensalada"},
                {"Arroz con pollo", "Bandeja paisa"},
                {"Flan", "Helado"}
        };

        for (int i = 0; i < categorias.length; i++) {
            System.out.println("Categoría: " + categorias[i]);
            for (int j = 0; j < platos[i].length; j++) {
                System.out.println("  - " + platos[i][j]);
            }
        }
    }

    //tienda
    public static void inventarioTienda() {
        System.out.println("\n*** Inventario de la Tienda de Barrio ***");
        String[] categorias = {"Bebidas", "Snacks", "Productos de limpieza"};
        String[][] productos = {
                {"Agua", "Gaseosa", "Jugo"},
                {"Papas", "Galletas"},
                {"Jabón", "Detergente"}
        };

        for (int i = 0; i < categorias.length; i++) {
            System.out.println("Categoría: " + categorias[i]);
            for (int j = 0; j < productos[i].length; j++) {
                System.out.println("  - " + productos[i][j]);
            }
        }
    }

    //electrodomesticos
    public static void inventarioElectrodomesticos() {
        System.out.println("\n*** Inventario de Electrodomésticos ***");
        String[] categorias = {"Neveras", "Estufas", "Licuadoras"};
        String[][] electrodomesticos = {
                {"Nevera estándar", "Nevera doble puerta"},
                {"Estufa a gas", "Estufa eléctrica"},
                {"Licuadora básica", "Licuadora profesional"}
        };

        for (int i = 0; i < categorias.length; i++) {
            System.out.println("Categoría: " + categorias[i]);
            for (int j = 0; j < electrodomesticos[i].length; j++) {
                System.out.println("  - " + electrodomesticos[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        menuRestaurante();
        inventarioTienda();
        inventarioElectrodomesticos();
    }
}