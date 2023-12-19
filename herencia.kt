/*
val valores --> inmutables
var variables --> mutables
*/

open class Animal(nombre: String){
    open fun comer() {}
    fun desplazarse(){
        println("Me desplazo")
    }
}

class Omnivoro(nombre: String) : Animal(nombre) {
    override fun comer(){
        println("Como de todo")
    }
    /* 
     override fun desplazarse(){
        print("Esto no puede ser")
    }
    */
    
    fun buscarAlimento(){
        super.desplazarse()
        println("Encontré!!!")
    }
}


// Clases abstractas

open class Forma {
	open fun dibujar(){}    
}

abstract class Poligono : Forma() {
    abstract override fun dibujar()
}

class Rectangulo : Poligono() {
    override fun dibujar(){
        println("Esto es un rectángulo")
    }
}


/* INTERFACES */

interface Bipedo {
    fun andar() {
        println("Camino a dos patas")
    }
    fun correr()
}

interface Humanoide : Bipedo {
    val pulgares : Boolean
    override fun andar() {
        super.andar()
        println("como humanoide")
    }
}

class SerHumano : Humanoide {
    override val pulgares: Boolean
    	get() = true
   	override fun correr(){
        println("Corro como una persona humana con sentimientos")
    }
}


fun main(){
	val animal = Animal("Perro")	
    
    val oso = Omnivoro("Oso")
    //oso.desplazarse()
    oso.buscarAlimento()
    
    val forma = Forma()
    //val poli = Poligono()    /// aquí fallará
    val rect = Rectangulo()
    rect.dibujar()
    
    /*
    Any
    equals()
    hashCode()
    toString()
	*/
    
    // instanceof en java es equivalente a is en Kotlin
    println("operador is\n")
    println(oso is Any)
    println(oso is Animal)
    println(oso is Omnivoro)
    
    val humano = SerHumano()
    println("Tienes pulgares? " + humano.pulgares)
    
    
    /// NIVELES DE ACCESO
    // public: por defecto. visible en todas partes
    // private: sólo visible en la clase
    // protected: muy parecido a private. Pero es visible por sus subclases
    // internal: visible para quienes comparten el módulo
    
    
    
}



