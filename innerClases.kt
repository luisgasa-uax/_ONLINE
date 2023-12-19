class Facturacion(val año: Int, val bruto: Float) {
    inner class Factura(val id: Int, val empresa: String, val bruto: Float) {
        inner class Impuesto(val porcentaje: Float) {
            fun impuesto() : Float {
                // la propiedad bruto sólo es accesible si la clase se declara como inner
                return bruto * porcentaje // bruto del ámbito más cercano, en este caso Factura
                return this@Facturacion.bruto * porcentaje // explícitamente le indicamos que use bruto de la clase Facturación
            }
        }
    }
}


fun main() {
    val factura = Facturacion(2020, 100000F).Factura(1, "Empresa S.A", 2000F)
    val impuesto = factura.Impuesto(0.21F)
}