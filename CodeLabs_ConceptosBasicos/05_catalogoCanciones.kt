/*
 * 5. Catálogo de canciones

Imagina que necesitas crear una app de reproducción de música.

Crea una clase que pueda representar la estructura de una canción. 
La clase Song debe incluir estos elementos de código:

    Propiedades para el título, 
    	el artista, 
        el año de publicación y el 
        recuento de reproducciones
    Propiedad que indica si la 
    	canción es popular (si el recuento de reproducciones es inferior a 1,000, 
        	considera que es poco popular)
    Un método para imprimir la descripción de una canción en este formato:
		"[Título], interpretada por [artista], se lanzó en [año de lanzamiento]".

 */

class Song(
	private val titulo: String,
    private val artista: String,
    private val anioPublicacion: Int, 
    private val recuentoRepros: Int
) {
    val esPopular: Boolean
    	get() = recuentoRepros >= 1000
    
    fun printSong() {
        println("$titulo interpretada por $artista, se lanzó en $anioPublicacion.")
    }
}

fun main() {
    val cancion = Song("La flaca", "Jarabe de Palo", 1996, 2500)
    
    cancion.printSong()
    
    if( cancion.esPopular ){
        println("Es una canción mu'popular!")
    }
    else {
        println("Es una canción poco popular!")
    }
}






