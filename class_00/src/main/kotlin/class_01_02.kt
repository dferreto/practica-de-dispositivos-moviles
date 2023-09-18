import java.util.*
import kotlin.collections.HashMap

/*================================================================================================
Institute....: Universidad Técnica Nacional
Headquarters.: Pacífico
Career.......: Tecnologías de la Información
Period.......: 3-2023
Document.....: class_01_02.kt
Goals........: Use control structures (decisions - cycles), and to use one-dimensional arrays.
Professor....: Jorge Ruiz (york)
Student......:
================================================================================================*/

fun main(args: Array<String>){
    //Capturing data from console
    print("Digite un número ")
    var valor1 = readlnOrNull()?.toInt() as Int

    print("Digite otro número ")
    var valor2 = readlnOrNull()?.toInt() as Int


    //Simple if
    if(valor1 == valor2)
        println("Las expresiones son iguales")


    //if else
    if(valor1 == valor2)
        println("Las expresiones son iguales")
    else
        println("Las expresiones son diferentes")


    //inner if into text
    println("Las expresiones son ${if(valor1 == valor2) "iguales" else "diferentes"}")


    //if as expression
    var salida = if(valor1 == valor2) "iguales" else "diferentes"
    println("Salida => $salida")


    //Case or switch instructions hasn't implemented in Kotlin language, in this situation
    //use when functioned.
    when(valor1){
        1 -> println("valor1 = 1")
        2 -> println("valor2 = 2")
        else -> {
            println("no puedo definir a valor1")
        }// end of block
    }//end when sentence


    //Example 2
    when(valor1){
        0, 1 -> println("valor1 es 0 o 1")
        else -> println("sigo sin poder definir a valor1")
    }


    //Example 3
    //Create numbers list
    val lstNumeros = listOf(11, 12, 13, 14, 15)

    when(valor2) {
        in 1..10 -> println("valor2 se encuentra entre un rango de 1 a 10")
        in lstNumeros -> println("valor2 es un número valido de la lista")
        !in 16..20 -> println("valor2 no pertenece al rango 16 a 20")
        else -> println("Ninguna de las anteriores")
    }
    println("==================================================\n")


    //For example code
    //Example 1
    println("Lista de valores..: ")
    for(item in lstNumeros)
        print("$item \t")
    println("")


    //Example 2
    println("Imprimiendo de 5 a 0..: ")
    for(i in 5 downTo 0 step 2)
        print("$i \t")
    println("")


    //Example 3
    println("Imprimiendo por posiciones..: ")
    for(i in lstNumeros.indices)
        print("${lstNumeros[i]}\t")
    println("")


    //Example 4
    println("Imprimiendo par valores..: ")
    for((posi,valor) in lstNumeros.withIndex()){
        print("[$posi] => $valor\t")
    }
    println("\n==================================================\n")


    //Example 5
    println("Imprimiendo los caracteres de una expresión..: ")
    for(caracter in "Hola mundo..!"){
        println("$caracter")
    }
    println("==================================================\n")


    //Example 6
    println("Utilizando la clausula until..: ")
    for(posi in 1 until 10){
        print("$posi.. ")
    }
    println("\n==================================================\n")


    //While example code
    //Example 1
    println("Usando while..: ")
    var x = valor1
    while(x > 0){
        print("X => ${x--}\t")
    }
    println("")


    //Example 2
    println("Usando while 2..: ")
    var control = false
    var exp = ""
    while(!control) {
        print("digite el nombre de un mes..: ")
        exp = readLine()?.toString() as String
        control = exp.lowercase(Locale.getDefault()) in listOf(
            "enero", "febrero", "marzo", "abril",
            "mayo", "junio", "julio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre"
        )
        if (!control)
            println("El mes digitado no existe. Vuelva a intentar")
    }//end of while

    println("El mes digitado fue ${exp.lowercase(Locale.getDefault())}")


    //Example 3
    println("Usando do...while")
    do{
        print("X => ${x++}\t")
    }while(x < 10)
    println("\n")


    // Break and continue labels
    println("Usando break...")
    var j = 10
    for(i in 0..25){
        j += 5
        if(j > 25){
            break
        }
        println("i = $i y j = $j")
    }
    println()


    println("Usando continue...")
    j = 1
    while(j < 20){
        j++
        if(j % 2 != 0){
            continue
        }
        println("j = $j")
    }
    println("\n==================================================\n")


    //Create associative array
    var hortalizas =
        hashMapOf("Lechuga" to 300.0f, "Cebollin" to 690.0f, "Brocoli" to 860.0f, "Zanahoria" to 500.0f)

    println("Imprimiendo los datos del vector asociativo")
    println(hortalizas)
    println(hortalizas["Brocoli"])
    println(hortalizas?.get("Cebollin"))

    //Declaring a second associative array
    var miscompras =
        hashMapOf<String,Float>("Cebollin" to 0.50f, "Brocoli" to 2.0f, "Lechuga" to 1.0f)

    var factura = 0.0f
    for(producto in miscompras) {
        factura += hortalizas[producto.key]?.toFloat() as Float *
                miscompras[producto.key]?.toFloat() as Float
    }

    println("La factura es: $factura")


    var subtotal : HashMap<String, Float>
    subtotal = HashMap()
    for(producto in miscompras)
        subtotal.put(producto.key, (hortalizas[producto.key]?.toFloat() as Float *
                miscompras[producto.key]?.toFloat() as Float))

    println("El subtotal es: $subtotal")

}//end of main function
