public class Main {

    public static void main(String[] args) {

        //Clase 2 Estructuras de control

        //1 Estructura IF = condicional

        //alamacenar la edad
        int edad = 17;
        System.out.println("Estructura IF");

        //If evalua true o false = 0 1
        //si es true se ejecuta
        if(edad >= 18){
            System.out.println("La persona es mayor de edad");
        }

        //If else
        System.out.println("Estructura IF-ELSE");

        int edadCliente = 18;

        if(edadCliente >=18){
            System.out.println("La persona es mayor de edad, puede ingresar");
        }else{
            System.out.println("La persona es menor de edad, no puede ingresar");
        }

        System.out.println("Condiciones combinadas");
        int edadUsuario = 22;
        boolean tieneEntrada = true;
        //&&= AND = true + true = true
        if(edadUsuario >= 18 && tieneEntrada){
            System.out.println("Puede ingresar al concierto");
        }else{
            System.out.println("No cumple con los requisitos");
        }

        System.out.println("ELSE-IF");
        double nota = 3.5;
        if(nota >=6.0){
            System.out.println("excelente");
        }else if (nota >=5.0){
            System.out.println("Bueno");
        } else if (nota>=4.0) {
            System.out.println("Aprobado");
        }else {
            System.out.println("Lo siento, reprobaste");
        }

        System.out.println("SWITCH");

        int opcion = 2;

        //Switch = compara un valor con diferentes casos
        switch(opcion){

            case 1:
                System.out.println("Crear usuario");
                break;

            case 2:
                System.out.println("Buscar Usuario");
                break;

            case 3:
                System.out.println("Eliminar usuario");
                break;

            case 4:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion inválida, escoge un número por favor");

        }


        System.out.println("---Operador ternario :---");

        int edadPersonaTernario = 25;
        //Operador ternario = permite generar una opracion condicional en una sola línea
        // ?->if :->else

        String mensajeEdad = edadPersonaTernario >=18 ? "Mayor de edad" : "Menor de edad";
        System.out.println("Operador ternario " + mensajeEdad);

        System.out.println("---Caso práctico :---");

        //Control de acceso
        String nombrePersona = "Camila";

        int edadPersonaC = 17;

        double altura = 1.65;

        boolean tieneEntradaAtraccion = true;

        int tipoEntrada = 2;

        System.out.println("Nombre: "+nombrePersona);
        System.out.println("Edad: "+edadPersonaTernario);
        System.out.println("Altura: "+altura);

        //Tipo de entrada

        switch (tipoEntrada){
            case 1:
                System.out.println("Entrada general");
                break;

            case 2:
                System.out.println("Entradas VIP");
                break;
            case 3:
                System.out.println("Entrada Estudiantes");
                break;
            default:
                System.out.println("Entrada desconocida");
        }

        //Validación de acceso

        //revisamos si tiene entrada
        if(!tieneEntradaAtraccion){
            System.out.println("Acceso rechazado, no tiene su entrada");
        } else if (edadPersonaC < 12) {
            System.out.println("Acceso rechazado, no cumple con la edad mínima");
        } else if (altura < 1.40) {
            System.out.println("Acceso rechazado, no tiene la altura mínima");
        }else{
            System.out.println("Acceso autorizado");
        }


    }
}
