/*================================================================================================
Institute....: Universidad Técnica Nacional
Headquarters.: Pacífico
Career.......: Tecnologías de la Información
Period.......: 3-2023
Document.....: class_01_03.kt
Goals........: Use a local and an external functions.
Professor....: Jorge Ruiz (york)
Student......:
================================================================================================*/

fun main(args: Array<String>){
    //Call the local functions
    saludar()
    saludar("Nazareth")
    println(saludar2("Darna"))
    println(saludar3("Elizabeth"))

    var vector = arrayOf(5,2,4,1,3)

    //Call the external functions
    var remotas = subrutinas()

    println("Vector desordenado")
    remotas.impvec(vector)

    println("Ordenando el vector")
    remotas.ordvec(vector)

    println("Vector ordenado")
    remotas.impvec(vector)

}

//Create a local functions
fun saludar(){
    println("hola... ¿cómo estas?")
}


fun saludar(aquien:String){
    println("hola $aquien.... ¿cómo estas?")
}


fun saludar2(aquien:String) = "hola $aquien.... ¿cómo estas?"


fun saludar3(aquien:String): String {
    return "hola $aquien.... ¿cómo estas?"
}


