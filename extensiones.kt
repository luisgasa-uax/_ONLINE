
open class Animal(open val nombre: String){
    open fun comer() {}
    fun desplazarse(){
        println("Me desplazo")
    }
}

class Omnivoro(nombre: String) : Animal(nombre) {
    override fun comer(){
        println("Como de todo")
    }
    fun buscarAlimento(){
        super.desplazarse()
        println("Encontré!!!")
    }
}

class Herbivoro(nombre: String, open val habitat: String) : Animal(nombre) {
    override fun comer(){
        println("Como hierba")
    }
    fun buscarAlimento(){
        super.desplazarse()
        println("Encontré!!!")
    }
    override fun toString() : String {
        return "Soy un $nombre. Y vivo en $habitat"
    }
}



// Extensiones

fun List<String>.palindromos(): List<String> {
    return this.filter {
        palabra -> StringBuilder(palabra).reverse().toString().equals(palabra, ignoreCase = true)
    }
}

fun List<Int>.pares(): List<Int> {
    return this.filter {
        numero -> numero % 2 == 0;
    }
}

fun List<Animal>.herbivoros() : List<Animal> {
    return this.filter {
        animalico -> animalico is Herbivoro;
    }
}


fun main() {
    val nombres = listOf("Ana", "Pepe", "Antonio")
    val sonPalindromos = nombres.palindromos()
    println(sonPalindromos)
    println(nombres)
    
    val numeros = listOf(1,2,3,4,5,6,7,8,9)
    val numPares = numeros.pares()
    println(numPares)
    
    val animales = listOf(Herbivoro("Conejo", "Campo"), Omnivoro("Oso"), Omnivoro("Gato"), Herbivoro("Vaca", "Prado"))
    println(animales.herbivoros())
}