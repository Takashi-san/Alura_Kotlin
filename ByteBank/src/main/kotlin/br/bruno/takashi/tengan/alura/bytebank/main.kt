package br.bruno.takashi.tengan.alura.bytebank

import br.bruno.takashi.tengan.alura.bytebank.model.employee.Director
import br.bruno.takashi.tengan.alura.bytebank.model.internal_system.InternalSystem
import br.bruno.takashi.tengan.alura.bytebank.model.client.Client

fun main() {
    println("Welcome to the ByteBank!")
    println()

    val system = InternalSystem()

    val client = Client(
        "Bruno",
        "000.000.000-00",
        "banana"
    )
    val director = Director(
        "Carol",
        "111.111.111-11",
        5000.0,
        "uva",
        500.0
    )

    system.login(client, "abacaxi")
    system.login(director, "uva")
}


