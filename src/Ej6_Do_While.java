public class Ej6_Do_While {

    //con esta froma podremos llevar un control en el restaurante
    public static void pedidosRestaurante() {
        System.out.println("\n*** Pedidos en el Restaurante ***");
        int platosPedidos = 0;
        int maxPlatos = 3;

        do {
            platosPedidos++;
            System.out.println("Ha pedido el plato número " + platosPedidos);
        } while (platosPedidos < maxPlatos);
    }

    public static void comprasTienda() {
        System.out.println("\n*** Compras en la Tienda de Barrio ***");
        int productosComprados = 0;
        int maxProductos = 4;

        do {
            productosComprados++;
            System.out.println("Ha comprado el producto número " + productosComprados);
        } while (productosComprados < maxProductos);
    }

    public static void carritoElectrodomesticos() {
        System.out.println("\n*** Carrito de Electrodomésticos ***");
        int electrodomesticosAgregados = 0;
        int maxElectrodomesticos = 2;

        do {
            electrodomesticosAgregados++;
            System.out.println("Ha agregado el electrodoméstico número " + electrodomesticosAgregados + " al carrito.");
        } while (electrodomesticosAgregados < maxElectrodomesticos);
    }

    public static void main(String[] args) {

        pedidosRestaurante();
        comprasTienda();
        carritoElectrodomesticos();
    }
}