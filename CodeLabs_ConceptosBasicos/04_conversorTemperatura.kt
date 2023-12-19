/*
 4. Conversor de temperatura

En el mundo, se usan tres escalas de temperatura principales: Celsius, Fahrenheit y Kelvin.

En el código inicial que se proporciona en el siguiente fragmento de código, 
escribe un programa que convierta una temperatura de una escala a otra con estas fórmulas:

    De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
    Kelvin a Celsius: °C = K - 273.15
    De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15

Ten en cuenta que el método String.format("%.2f", /* measurement */ ) se usa para 
convertir un número en un tipo String con 2 decimales.

 */
fun main() {
    val initialMeasurement = 100.0
    val initialUnit = "ºF"
    val finalUnit = "ºK"
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement, initialUnit, finalUnit )) 
    
    println(conversionFormula( 100.0, "ºC", "ºF"))
    println(conversionFormula( 100.0, "ºC", "ºK"))
    println(conversionFormula( 100.0, "ºF", "ºK"))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

fun conversionFormula( temp: Double,  escalaOrig: String,  escalaDest: String): Double{
    return when{
        escalaOrig.equals("ºC") && escalaDest.equals("ºF") -> celsius2fahrenheit(temp)
        escalaOrig.equals("ºC") && escalaDest.equals("ºK") -> celsius2kelvin(temp)
        escalaOrig.equals("ºF") && escalaDest.equals("ºK") -> fahrenheit2kelvin(temp)
        escalaOrig.equals("ºK") && escalaDest.equals("ºC") -> kelvin2celsius(temp)
        else -> -1.0
    }
}

fun celsius2fahrenheit( temp: Double): Double {
    return (9/5 * temp ) + 32
}

fun celsius2kelvin( temp: Double): Double {
    return temp + 273.15
}

fun fahrenheit2kelvin( temp: Double): Double {
    return ((5/9) * (temp - 32)) + 273.15
}

fun kelvin2celsius( temp: Double): Double {
    return temp - 273.15
}



fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) 
    // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
