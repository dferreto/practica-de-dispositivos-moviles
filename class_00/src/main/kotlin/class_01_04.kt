/*================================================================================================
Institute....: Universidad Técnica Nacional
Headquarters.: Pacífico
Career.......: Tecnologías de la Información
Period.......: 3-2023
Document.....: clase_01_04.kt
Goals........: Oriented object programing, use class, get/set and constructors
Professor....: Jorge Ruiz (york)
Student......:
================================================================================================*/

fun main(args: Array<String>){
    //Create instance with parametrized constructor
    var per1 = clsPersona(1,"Morticia Addams","maddamsf@.est.utn.ac.cr",93)
    var per2 = clsPersona(2,"Homero Addams","haddamso@.est.utn.ac.cr",98)

    //Create instance with empty constructor
    var per3 = clsPersona()

    //Apply each property isolatedly
    per3.id = 3
    per3.nombre = "Merlina Addams"
    per3.email = "maddamsa@est.utn.ac.cr"
    per3.edad = 65


    //Printing data from objects
    println("${per1.id}\t${per1.nombre}\t\t${per1.email}\t${per1.edad}")
    println("${per2.id}\t${per2.nombre}\t\t${per2.email}\t${per2.edad}")
    println("${per3.id}\t${per3.nombre}\t\t${per3.email}\t${per3.edad}")


    //Scope functions
    val edad = per3.edad + 3
    println("La edad es: $edad")
    println("${per3.id}\t${per3.nombre}\t\t${per3.email}\t${per3.edad}")

}
