/*================================================================================================
Institute....: Universidad Técnica Nacional
Headquarters.: Pacífico
Career.......: Tecnologías de la Información
Period.......: 3-2023
Document.....: clsPersona.py
Goals........: Oriented Object Programming, using an external class for create instance variables
Professor....: Jorge Ruiz (york)
Student......:
================================================================================================*/

class clsPersona{
    //Create properties
    private var _id: Int = 0
    private var _nombre: String = ""
    private var _email: String = ""
    private var _edad: Short = 0

    //Default constructor
    constructor()

    //Constructor with parameters
    constructor(id: Int, nombre: String, email: String, edad: Short) {
        this._id = id
        this._nombre = nombre
        this._email = email
        this._edad = edad
    }

    //Geters/Seters same the .Net properties, public declared
    var id : Int
        get() =  this._id
        set(value){ this._id = value }

    var nombre: String
        get() =  _nombre
        set(value){ this._nombre = value }

    var email: String
        get() =  this._email
        set(value){ this._email = value }

    var edad: Short
        get() =  this._edad
        set(value){ this._edad = value }
}
