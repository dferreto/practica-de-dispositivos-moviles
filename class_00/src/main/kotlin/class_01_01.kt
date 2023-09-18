/*================================================================================================
Institute....: Universidad Técnica Nacional
Campus.......: Pacífico
Career.......: Tecnologías de la Información
Period.......: 3-2023
Document.....: class_01_01.kt
Goals........: Example code to declare and use constants and variables.
Professor....: Jorge Ruiz (york)
Student......:
================================================================================================*/

// Same java main function
fun main(args: Array<String>) {
    println("Mi primer aplicación creada con Kotlin")
    println("==================================================\n")

    //Local variables
    var entera: Int = 69

    var cadena: String = "mi mamá me míma....!"

    var flotante: Float = 35.9876543210f

    var doble: Double = 35.98765432109

    var caracter: Char = 'A'

    var logico: Boolean = true

    //Printing local variables
    println("Expresión entera....: $entera")
    println("Expresión cadena....: $cadena")
    println("Expresión flotante..: $flotante")
    println("Expresión doble.....: $doble")
    println("Expresión caracter..: $caracter")
    println("Expresión lógica....: $logico")
    println("==================================================\n")


    //Another way to declare variables
    var cantidad = 10
    var nombre = "Morticia Addams Frug"

    //Using java code
    System.out.println("Cantidad...:" + cantidad)
    System.out.println("Nombre.....:" + nombre)
    println("==================================================\n")


    //Constants declaration
    val pi = 3.14333333
    val email = "jruiz@utn.ac.cr"

    println("pi.....: $pi")
    println("email..: $email")
    println("==================================================\n")


    //Capturing data from console
    print("Capture un valor entero   ")
    var num = readlnOrNull()?.toInt() as Int


    print("\nCapture un expresión textual   ")
    var texto = readlnOrNull() as String
    print("\n")

    println("Los valores leídos fueron $num y $texto")
    println("==================================================\n")


    //Arithmetic functions
    var x = 5.0
    var y = 3.0

    println("X => $x, Y => $y")
    println("Suma..............: $x + $y = ${x+y}")
    println("Resta.............: $x - $y = ${x-y}")
    println("Multiplicación....: $x * $y = ${x*y}")
    println("División..........: $x / $y = ${x/y}")
    println("Módulo............: $x % $y = ${x%y}")

    //format output div result
    println("División..........: %.1f / %.1f = %.2f".format(x,y,(x/y)))

    //add 1 to current value after use
    x++
    println("X => $x")

    //add y value at x variable
    x += y
    println("X => $x")

    //subtract 1 to current value before use
    --y
    println("Y => $y")

}
