package br.bruno.takashi.tengan.alura.bytebank.model.client

import br.bruno.takashi.tengan.alura.bytebank.logField
import br.bruno.takashi.tengan.alura.bytebank.model.authentication.IAuthenticable
import br.bruno.takashi.tengan.alura.bytebank.model.util.ILoggable

class Client (
    var name: String,
    var cpf: String,
    override val password: String
) : IAuthenticable, ILoggable {
    override fun logBody() {
        logField(::name.name, name)
        logField(::cpf.name, cpf)
        logField(::password.name, password)
    }
}