fun main() {
    println("Welcome to the ByteBank!")
    println()

    val accountBruno = Account()
    accountBruno.owner = "Bruno"
    accountBruno.id = 123
    accountBruno.balance = 9000.1

    val accountMarcos = Account()
    accountMarcos.owner = "Marcos"
    accountMarcos.id = 987
    accountMarcos.balance = -372.90

    accountBruno.logInfo()
    accountMarcos.logInfo()
}

fun logField(label: String, value: Any) {
    println("$label: $value")
}


