public class Funciones {
    public static void main(String[] args) {
        double y=3;
        System.out.println(circleArea(y));
        System.out.println(sphereArea(y));
        System.out.println(sphereVolume(y));
        System.out.println("Pesos a Dolares: " + convertToDolar(200,"MXN"));

    }

    public static double circleArea(double r){
        return (Math.PI*Math.pow(r,2));
    }
    public static double sphereArea(double r){
        return (Math.PI*4*Math.pow(r,2));
    }
    public static double sphereVolume(double r){
        return (Math.PI*(4/3)*Math.pow(r,3));
    }
    /**
     * Descripción: Función que especificando su moneda
     * convierte una cantidad de dinero a dolares.
     * @param currency Tipo de moneda, acepta solo MXN y COP.
     * @param quantity Cantidad de dinero a convertir
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDolar (double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity= quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
