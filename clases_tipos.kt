// Tipos de clases
// data class  ==> almacemaniento de datos
// selaled class ==> restringen el número de subclases dentro del mismo fichero
// Genéricos


data class Alumno (val id : Int, val nombre: String, val apellidos: String, val telefono: String, 
	val anioNacimiento: Int)

sealed class Fruta( numero: Int) {
    class Platano(numero: Int) : Fruta(numero)
    class Pera(numero : Int, tipo: String ) : Fruta(numero)
}

class Melon(numero: Int) : Fruta(numero){}

fun comerPiel( fruta: Fruta) = when(fruta) {
    is Fruta.Platano -> false
    is Fruta.Pera -> true
    is Melon -> false
    //else -> false
}

fun main() {
    
    val pera = Fruta.Pera(3, "Moscatel")
    val platano = Fruta.Platano(6)
    val melon = Melon(6)
    
    println(comerPiel(pera))
    println(comerPiel(platano))
    println(comerPiel(melon))
}