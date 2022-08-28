package br.bruno.takashi.tengan.alura.bytebank.model.client

import br.bruno.takashi.tengan.alura.bytebank.logField
import br.bruno.takashi.tengan.alura.bytebank.model.address.Address
import br.bruno.takashi.tengan.alura.bytebank.model.authentication.IAuthenticable
import br.bruno.takashi.tengan.alura.bytebank.model.util.ILoggable

class Client (
    var name: String,
    var cpf: String,
    override val password: String,
    var address: Address = Address()
) : IAuthenticable, ILoggable {
    override fun logBody() {
        logField(::name.name, name)
        logField(::cpf.name, cpf)
        logField(::password.name, password)
        address.log()
    }
}