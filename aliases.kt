typealias MiMapa = List<Map<String, String>>


fun main() {
    val miListaDeMapas: List<Map<String, String>> = listOf<Map<String, String>>(mapOf("Clave" to "Valor"))

    val acortado: MiMapa = listOf(mapOf("Clave1" to "Valor2"))

     miListaDeMapas.forEach { a -> println(a) }
}