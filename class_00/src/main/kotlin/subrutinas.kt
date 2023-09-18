/*================================================================================================
Institute....: Universidad Técnica Nacional
Headquarters.: Pacífico
Career.......: Tecnologías de la Información
Period.......: 3-2023
Document.....: subrutinas.py
Goals........: Create external functions for anywhere use.
Professor....: Jorge Ruiz (york)
Student......:
================================================================================================*/
class subrutinas{
    fun ordvec(vc: Array<Int>){
        var aux : Int
        for(i in 0..(vc.size-2)){
            if(vc[i]>vc[i+1]){
                aux = vc[i]
                vc[i] = vc[i+1]
                vc[i+1] = aux
                ordvec(vc)
            }// end of if
        }// end of loop for
    }// end function ordvec

    fun impvec(vc: Array<Int>){
        for(i in 0..(vc.size-1)){
            print("${vc[i]}\t")
        }
        println("")
    }// end function impvec

}// end class
