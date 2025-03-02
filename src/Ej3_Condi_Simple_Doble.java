public class Ej3_Condi_Simple_Doble {

    //ejemplo de condiciones en un restaurante
    public static void condicionesRestaurante() {
        boolean disponible = true;
        boolean enPromocion = false;

        System.out.println("\n***Condiciones en Restaurante***");

        //condicion simple
        System.out.println(disponible ? "El plato está disponible." : "El plato no está disponible.");

        //condicion doble
        System.out.println(enPromocion ? "¡El plato está en promoción!" : "El plato no está en promoción.");

        //condicion anidada
        if (disponible) {
            System.out.println(enPromocion
                    ? "El plato está disponible y en promoción."
                    : "El plato está disponible, pero no en promoción.");
        }
    }

    //ahora condicion para una tienda de barrio
    public static void condicionesTienda() {
        int stock = 10;
        boolean enOferta = true;

        System.out.println("\n*** Condiciones en Tienda de Barrio ***");

        //condicion simple
        System.out.println(stock > 0 ? "El producto está en stock." : "El producto no está en stock.");

        //condicion doble
        System.out.println(enOferta ? "¡El producto está en oferta!" : "El producto no está en oferta.");

        //condicion anidada
        if (stock > 0) {
            System.out.println(enOferta
                    ? "El producto está disponible y en oferta."
                    : "El producto está disponible, pero no está en oferta.");
        }
    }

    //ejemplo de condiciones en electrodomesticos
    public static void condicionesElectrodomesticos() {
        int garantiaAnios = 2;
        boolean disponible = true;

        System.out.println("\n*** Condiciones en Electrodomésticos ***");

        //condicion simple
        System.out.println(disponible ? "El electrodoméstico está disponible." : "El electrodoméstico no está disponible.");

        //condicion doble
        System.out.println(garantiaAnios > 1
                ? "El electrodoméstico tiene garantía extendida."
                : "El electrodoméstico tiene garantía básica.");

        //condicion anidada
        if (disponible) {
            System.out.println(garantiaAnios > 1
                    ? "El electrodoméstico está disponible y tiene garantía extendida."
                    : "El electrodoméstico está disponible, pero tiene garantía básica.");
        }
    }

    public static void main(String[] args) {
        condicionesRestaurante();
        condicionesTienda();
        condicionesElectrodomesticos();
    }
}