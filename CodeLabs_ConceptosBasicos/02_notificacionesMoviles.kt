/*
 *En el código inicial que se proporciona en el siguiente fragmento de código, 
 escribe un programa que imprima el mensaje de resumen según la cantidad de 
 notificaciones que recibiste. El mensaje debe incluir lo siguiente:
	- La cantidad exacta de notificaciones cuando haya menos de 100
    - 99+ como cantidad de notificaciones cuando haya 100 o más
 */
fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numOfMsg: Int) {
    
    if (numOfMsg < 100) {
        println("Tienes $numOfMsg notificaciones")
    }
    else {
        println("Tu teléfono está a punto de petar!!! Tienes 99+ notificaciones")
    }
    // alternativa
    when( numOfMsg ){
        in 0..99 -> println("Tienes $numOfMsg notificaciones. When")
        else -> println("Tu teléfono está a punto de petar!!! Tienes 99+ notificaciones. When")
    }
    
}