public class Main {
    /*más de una línea*/
    //una sola línea
    //metodo principal para ejecutar java
    public static void main(String[] args) {

        System.out.println("======Tipos de datos========");

        int edad = 38;
        double estatura = 1.78;
        char inicial = 'M';
        boolean estudiante = true;
        String nombre = "Marcelo";

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante? : " + estudiante);

        System.out.println("======Operadores Aritméticos========");
        int numero1 = 20;
        int numero2 = 15;

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicacion: " + (numero1 * numero2));
        System.out.println("Division: " + (numero1 / numero2));
        System.out.println("Modulo: " + (numero1 % numero2));

        System.out.println("======Operadores Comparación========");

        int edadPersona = 20;

        System.out.println("Es mayor: " + (edadPersona > 18)); // true
        System.out.println("Es menor a 18: " + (edadPersona < 18));
        System.out.println("Es mayor o o igual : " + (edadPersona >= 18));
        System.out.println("Es menor o igual : " + (edadPersona <= 18));
        System.out.println("Es igual: " + (edadPersona == 18));
        System.out.println("Es distinto de: " + (edadPersona != 18));

        System.out.println("======Operadores Lógicos========");
        boolean tieneDinero = false;
        boolean productoDisponible = true;

        boolean puedeComprar = tieneDinero && productoDisponible;
        System.out.println("se puede comprar?: "+puedeComprar);

        System.out.println("======Precedencia========");
        int resultado1 = 10 + 5 * 2;
        int resultado2 = (10 + 5) * 2;

        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);

        System.out.println("======Asignación ========");

        //variable = caja
        int saldo = 10000;

        //saldo = saldo + 20000;
        saldo += 20000;
        saldo -= 10000;

        System.out.println("======Incremento o Decremento ========");

        int vidas = 3;

        vidas++; //vidas + 1
        vidas--;//vidas -1
        System.out.println("Vidas: DK : "+vidas);





    }

}
