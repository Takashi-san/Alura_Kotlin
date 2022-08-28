package br.bruno.takashi.tengan.alura.bytebank

import br.bruno.takashi.tengan.alura.bytebank.model.authentication.IAuthenticable
import br.bruno.takashi.tengan.alura.bytebank.model.client.Client
import br.bruno.takashi.tengan.alura.bytebank.model.internal_system.InternalSystem

fun main() {
    val banana = object : IAuthenticable {
        val name: String = "banana"
        override val password: String = "fruit"
    }
    val system = InternalSystem()
    system.login(banana, "fruit")

    val client = Client(
        "Bruno",
        "000.000.000-00",
        "banana"
    )
    println(client)

    println(client)
}


