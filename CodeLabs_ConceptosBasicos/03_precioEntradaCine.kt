/*
 *
 3. Precio de la entrada de cine

Las entradas de cine suelen tener un precio diferente según la edad de los espectadores.

En el código inicial que se proporciona en el siguiente fragmento de código, 
escribe un programa que calcule los precios de estas entradas basados en la edad:

 - Un precio de entrada infantil de USD 15 para personas de 12 años o menos.
 - Un precio de entrada estándar de USD 30 para personas de entre 13 y 60 años. 
 		Los lunes, un precio estándar con descuento de USD 25 para el mismo grupo etario
 - Un precio para adultos mayores de USD 20 para personas de 61 años o más 
 		(asumimos que la edad máxima de un espectador es de 100 años)
 - Un valor de -1 para indicar que el precio no es válido cuando un usuario 
 	ingresa una edad fuera de las especificaciones

 */
fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    var isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is Monday is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    println("The movie ticket price for a person aged $adult is not Monday is \$${ticketPrice(adult, false)}.")
    println("The movie ticket price for a person aged -3 is \$${ticketPrice(-3, isMonday)}.")
	println("The movie ticket price for a person aged 103 is \$${ticketPrice(103, isMonday)}.")
    
    println("Dime la edad: ")
    val ageString = readLine() // Lee la entrada por consola
    println("Dime si es lunes: ")
    val dayString = readLine()
    try {
        val age = ageString?.toInt() ?: -1 // Convertimos el string en int. 
        							   // Pero si el string es nulo asignamos el valor -1
		var esLunes = true
		when {
            dayString.equals("Si", ignoreCase = true) -> esLunes = true
            dayString.equals("Sí", ignoreCase = true) -> esLunes = true
            else -> esLunes = false
        }
        println("El precio de la entrada para una persona de edad $age es \$${ticketPrice(age, esLunes)}.")
    }
    catch ( e: NumberFormatException ) {
        println("ERROR: Ingresa un número válido")
    }
    
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age < 0 || age > 100 -> -1
        age <= 12 -> 15
        //age in 0..12 -> 15
        age in 13..60 -> if (isMonday) 5 else 30
        age in 61..100 -> 20 
        else -> -1
    }
    
}