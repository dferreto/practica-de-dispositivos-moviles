
fun main(args: Array<String>) {

    var seguir = true

    while (seguir) {
        println()
        println("BIENVENIDO")
        println()
        println("Selecciona una opción:")
        println("1. Problema01")
        println("2. Problema02")
        println("3. Problema03")
        println("4. Salir")

        var opcion = readlnOrNull()?.toInt() as Int

        when (opcion) {
            1 -> {
                println()
              problema01()
            }
            2 -> {
                problema02()
            }
            3 -> {
                problema03()
            }
            4 -> {
                println("Gracias por utilizar el programa")
                seguir = false
            }
            else -> {
                println("Opción no válida")

            }
        }
    }
}






fun problema01(){
    val resultadoEsperado = 7
    val x = 2

    val formula = "(3 * ($x + 9) - 5) / 4"
    val result = (3 * (x + 9) - 5) / 4

    if(result == resultadoEsperado){
        println("Fórmula planteada en el problema: 3 * (x + 9) - 5) / 4 = $resultadoEsperado")
        println("Fórmula aplicada para resolver el problema: $formula = $resultadoEsperado")
        println("El número pensado al principio es: $x")
    }
}

fun problema02(){
    println("Problema02")
}

fun problema03(){
    println("problema03")
}
