package br.bruno.takashi.tengan.alura.bytebank

import br.bruno.takashi.tengan.alura.bytebank.model.account.SavingsAccount
import br.bruno.takashi.tengan.alura.bytebank.model.client.Client
import br.bruno.takashi.tengan.alura.bytebank.model.employee.Director
import br.bruno.takashi.tengan.alura.bytebank.model.internal_system.InternalSystem

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

    println()
    client.log()
    println()

    val account = SavingsAccount(client, 123, 500.00)
    account.log()
}


