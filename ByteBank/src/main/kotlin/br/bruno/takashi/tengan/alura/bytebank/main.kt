package br.bruno.takashi.tengan.alura.bytebank

import br.bruno.takashi.tengan.alura.bytebank.model.account.CheckingAccount
import br.bruno.takashi.tengan.alura.bytebank.model.account.accountCount
import br.bruno.takashi.tengan.alura.bytebank.model.client.Client

fun main() {
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


