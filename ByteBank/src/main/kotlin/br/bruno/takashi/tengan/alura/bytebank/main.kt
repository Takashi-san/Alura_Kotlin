package br.bruno.takashi.tengan.alura.bytebank

import br.bruno.takashi.tengan.alura.bytebank.model.account.CheckingAccount
import br.bruno.takashi.tengan.alura.bytebank.model.account.accountCount
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

    val account1 = CheckingAccount(client, 1)
    val account2 = CheckingAccount(client, 2)
    val account3 = CheckingAccount(client, 3)

    logField(::accountCount.name, accountCount)
}


