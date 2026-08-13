//Data class
//?= puede tener un dato o no
data class Estudiante(
    val nombre: String,
    val alias: String?,
    val puntaje: Int,
    val activo: Boolean
)

fun main(){

    //If como expresión
    val edad = 20
    //?jdjdjdj : f

    //En kotlin podemos crear un if directamente en un valor
    val estado = if (edad >=18) "Adulto" else "Menor de edad"

    println("Edad = $edad")
    println("Estado = $estado")

    // When = Cuando
    val puntaje = 85

    //When permite evaluar multiples condiciones
    val nivel = when {
        puntaje >= 90 -> "Experto"
        puntaje >= 70 -> "Intermedio"
        puntaje >= 50 -> "Principiante"
        else -> "Novato"
    }
    println("Puntaje = $puntaje")
    println("Nivel = $nivel")
    //when con valores
    val opcion = 2
    val lenguaje = when (opcion){
        1-> "Java"
        2-> "Kotlin"
        3-> "JavaScript"
        else -> "Desconocido"
    }
    println("Lenguaje seleccionado = $lenguaje")

    //Null Safety = seguridad datos nulos

    var apodo: String? = null

    println("Apodo: $apodo")

    //asignamos el valor
    apodo = "KotlinMaster"
    println("Nuevo apodo: $apodo")

    // Safe call = llamada segura
    var usuario: String? = null
    //? ejecuta la operacion solamente si no es nulll
    println("Cantidad de letras: ${usuario?.length}")
    usuario = "Marcelo"
    println("Cantidad de letras: ${usuario?.length}")

    //Operador Elvis ?:
    var nickName: String? = null
    //nickName = "Raúl"
    //?: entrega un valor alternativo si encuentra null
    var nombreVisible = nickName ?: "Usuario invitado"
    println("Nombre: $nombreVisible")
    //Smart Cast
    //any puede almacenar valores de distintos tipos
    val dato: Any = "Android"
    //is comprueba el tipo de dato
    if(dato is String){
        println("Texto: $dato")
        println("Cantidad de letras: ${dato.length}")
    }

    //  dataClass

    //Crear un objeto
    val estudiante = Estudiante(
        nombre = "Camila",
        alias = null,
        puntaje = 87,
        activo = true
    )

    //Acceder a sus propiedades
    println("Nombre: ${estudiante.nombre}")
    println("puntaje: ${estudiante.puntaje}")
    println("Activo: ${estudiante.activo}")

    //Null Safety + Data Class
    //Si no existe el alias mostramos otro mensaje
    val aliasVisible = estudiante.alias ?: "Sin alias"
    println("Alias: $aliasVisible")

    //When + Data Class
    val nivelEstudiante = when{
        estudiante.puntaje >=90 -> "Experto"
        estudiante.puntaje >=70 -> "Intermedio"
        estudiante.puntaje >=50 -> "Principiante"
        else -> "Novato"
    }
    println("Nivel: $nivelEstudiante")








}