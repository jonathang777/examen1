package com.example.examen1.Cliente

class recibo {

    var nom_clie: String = ""
    var dni: String = ""
    var serv_inst: Int = 0
    var cos_ser: Double = 0.0
    var cos_inst: Double = 0.0
    var dsct: Double = 0.0
    var total: Double = 0.0

    constructor(nom_cli: String, dni: String, serv_inst: Int) {
        this.nom_clie = nom_cli
        this.dni = dni
        this.serv_inst = serv_inst
        this.cos_inst = calcular_instalacion(serv_inst)
        this.cos_ser = calcular_servicio(serv_inst)
        this.dsct = calcular_descuento(serv_inst)
        this.total = cos_inst + cos_ser - dsct

    }

    fun calcular_servicio(serv_inst: Int): Double {
        when (serv_inst) {
            1 -> return 109.00
            2 -> return 159.00
            3 -> return 89.00
            4 -> return 59.00
            else -> return 79.00
        }
    }

    fun calcular_instalacion(serv_inst: Int): Double {
        when (serv_inst) {
            1 -> return 35.00
            2 -> return 60.00
            3 -> return 15.00
            4 -> return 12.00
            else -> return 15.00
        }
    }

    fun calcular_descuento(serv_inst: Int): Double {
        when (serv_inst) {
            1 -> return 109.00 * 0.05
            2 -> return 159.00 * 0.10
            3 -> return 89.00 * 0.02
            4 -> return 59.00 * 0.01
            else -> return 79.00 * 0.01
        }
    }

}
