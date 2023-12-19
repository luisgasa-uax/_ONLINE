interface Tiempo { 
    fun horasOcio(): Float 
}

enum class Semana2(val laborable: Boolean) : Tiempo {
    LUNES(true) {
        override fun horasOcio(): Float {
            return 0.1F;
        }
    },
    MARTES(true){
        override fun horasOcio(): Float {
            return 0.4F;
        }
    },
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false) {
        override fun horasOcio(): Float {
            return 18F;
        }
    };

    override fun horasOcio() = if (laborable) 2F else 5F
}

fun main() {
    Semana2.values().iterator().forEach { dia -> println(dia.horasOcio()) }

}