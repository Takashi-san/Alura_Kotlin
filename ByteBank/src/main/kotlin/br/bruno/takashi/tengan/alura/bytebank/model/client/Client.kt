package br.bruno.takashi.tengan.alura.bytebank.model.client

import br.bruno.takashi.tengan.alura.bytebank.model.address.Address
import br.bruno.takashi.tengan.alura.bytebank.model.authentication.IAuthenticable

class Client (
    var name: String,
    var cpf: String,
    override val password: String,
    var address: Address = Address()
) : IAuthenticable {
    override fun toString(): String {
        return """
            Client(
                name='$name', 
                cpf='$cpf', 
                password='$password', 
            )
            """.trimIndent()
    }
}