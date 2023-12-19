
class Persona( val nombre: String, var edad: Int, var estatura: Double ){
    
    constructor( nombre: String ) : this(nombre, 0, 0.0) {
        println("Este es un constructor secundario")
    }
    
    constructor( nombre: String,  estatura: Double) : this(nombre, 0, estatura){
        println("Este es otro constructor secundario")
    }
     
    init {
        println("Persona creada: $nombre con $edad años")
    }
}

fun main(){
	val pepe = Persona("Jose", 43, 1.8)
    pepe.edad = 56
	println(pepe.edad)    
    
    val maria= Persona("Maria")
    println(maria.edad)
    
    val katia = Persona("Katia", 1.7)
    println(katia.estatura + katia.edad)
}

