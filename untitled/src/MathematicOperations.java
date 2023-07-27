public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));
        //devuelve un entero hacia abajo
        System.out.println(Math.floor(x));
        //Devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));
        //Devuelve el número mayor
        System.out.println(Math.max(x,y));
        //Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));
        //Área de circulo
        System.out.println(Math.PI*Math.pow(y,2));
        //Volumen de una esfera
        System.out.println(Math.PI*(4/3)*Math.pow(y,3));
    }
}
