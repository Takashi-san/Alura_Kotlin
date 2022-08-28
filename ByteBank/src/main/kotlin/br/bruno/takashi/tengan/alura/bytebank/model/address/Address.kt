package br.bruno.takashi.tengan.alura.bytebank.model.address

import br.bruno.takashi.tengan.alura.bytebank.logField
import br.bruno.takashi.tengan.alura.bytebank.model.util.ILoggable

class Address(
    var residence: String = "",
    var number: String = "",
    var district: String = "",
    var city: String = "",
    var state: String = "",
    var zip: String = "",
    var complement: String = ""
): ILoggable {
    override fun logBody() {
        logField(::residence.name, residence)
        logField(::number.name, number)
        logField(::district.name, district)
        logField(::city.name, city)
        logField(::state.name, state)
        logField(::zip.name, zip)
        logField(::complement.name, complement)
    }
}







