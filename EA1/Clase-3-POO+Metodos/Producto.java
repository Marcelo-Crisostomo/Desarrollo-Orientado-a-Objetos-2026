//Molde de producto
public class Producto {
    //Atributos = caracteristicas
    private String nombre;//""
    private double precio;//100.0
    private int stock;// 90


    //Constructor = construye objetos = instancias => de una clase
    //debe ser publico, con el mismo nombre de la clase
    //(los argumentos de la clase = > atributos)

    //("Cargador Iphone carga rápida", 100000, 100)
    public Producto(String nombre, double precio, int stock){
        //Gurdamos los datos recibidos y lo almacenamos en el atributo
        //para lamar al atributo this.nombreAtributo
        // atributo = argumento = computador , 100000
        //guardando los atributos recibidos dentro del objeto
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Método sin argumento () y sin retorno = void
    //tipoMetodo = public o private
    //retornar = void
    //nombreMetodo(...)
    //{contenido}
    //metodo sin argumento ni retorno
    public void mostarInformacion(){
        //mostrar un título
        System.out.println("-------Producto-------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio $ : " + precio);
        System.out.println("Stock: " + stock);
    }

    //método con argumento pero sin retorno
    public void vender(int cantidad){

        //verificar si existe el stock suficiente
        if(cantidad <= stock){
            //restamos las unidades vendidas
            //stock = stock - cantidad;
            stock -= cantidad;

            //Informar que la venta fué realizada
            System.out.println("Venta realizada: " + cantidad + " unidad(es)");
        }else {
            //Informamos el problema
            System.out.println("El stock es insuficiente");
        }

    }

    //método sin argumento pero con retorno
    public double calcularPrecioConIva(){
        //calculamos el IVA
        double precioConIva = precio* 1.19; //19%
        return precioConIva;
    }

    //método con argumento y retorno
    public double calcularPrecioFinal(int cantidad, double descuento){
        //calcular el precio normal de la compra
        double total = precio * cantidad;
        //calculamos el monto del descuento
        double montoDescuento = total * descuento/ 100;
        //calculamos el precio final
        double totalConDescuento = total - montoDescuento;
        return totalConDescuento;
    }
}
