public class Main {

    //el inicio de mi aplicación
    public static void main(String[] args) {


        System.out.println("BIENVENIDO A TECH STORE");

        //Crear objetos o instancias
        //1-NombreClase, 2- nombreObjeto, 3 = new NombreClase , 4 (poblar argumentos = datos del producto);
        Producto cargador = new Producto("Cargador Iphone carga rápida", 100000, 100);

        Producto teclado = new Producto("Teclado macánico SnapDragon", 35000.0, 20);

        //Ejecutar el método sin argumentos
        cargador.mostarInformacion();
        teclado.mostarInformacion();

        //Venta //con argumento
        System.out.println("VENTAS");
        cargador.vender(10);
        teclado.vender(15);

        //mostrar info una vez vendidos
        cargador.mostarInformacion();
        teclado.mostarInformacion();

        //IVA // método con retorno
        System.out.println("PRECIO CON IVA");
        double precioConIva = teclado.calcularPrecioConIva();
        System.out.println("PRECIO CON IVA del teclado" + precioConIva);

        //Mostrar precio de la compra
        System.out.println("Compra normal");
        int cantidad2 = 3;
        //calcular el total utilizando un metodo con arg y retorno
        double totalCompra = teclado.calcularPrecioFinal(cantidad2, 20);

        //mostramos resultado retornado
        System.out.println("Cantidad: " +cantidad2);
        System.out.println("Total: " +totalCompra);


        //Mostrar la sobrecarga
        System.out.println("Compra con descuento");
        double totalDescuento = teclado.calcularPrecioFinal(2, 30);

        //Mostramos el total después del descuento
        System.out.println("Total con 30% de descuento"+ totalDescuento);

        //
        System.out.println("Fin del programa TECH STORE");


    }
}
