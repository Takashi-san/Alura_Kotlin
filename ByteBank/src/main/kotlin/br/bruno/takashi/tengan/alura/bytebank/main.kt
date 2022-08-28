package br.bruno.takashi.tengan.alura.bytebank

import br.bruno.takashi.tengan.alura.bytebank.model.client.Client

fun main() {
    val client1 = Client(
        "Bruno",
        "000.000.000-00",
        "banana"
    )
    val client2 = Client(
        "Carlos",
        "000.000.000-00",
        "banana"
    )

    logField("is equal", client1.equals(client2))
    logField("hash1", client1.hashCode())
    logField("hash2", client2.hashCode())
    println(client1)
    println(client2)
}


