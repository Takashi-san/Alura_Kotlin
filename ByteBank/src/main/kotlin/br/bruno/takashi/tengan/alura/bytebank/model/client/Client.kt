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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (cpf != other.cpf) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + cpf.hashCode()
        return result
    }
}