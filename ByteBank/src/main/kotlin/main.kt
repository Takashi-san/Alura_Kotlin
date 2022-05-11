fun main() {
    println("Welcome to the ByteBank!")
    println()

    val accountBruno = Account("Bruno", 123, 200.0)
    val accountAlex = Account("Alex", 456, 100.0)

    println("Deposit")
    accountBruno.deposit(50.0)
    accountBruno.deposit(-50.0)
    accountBruno.logInfo()

    println("Withdraw")
    accountBruno.withdraw(100.0)
    accountBruno.withdraw(-100.0)
    accountBruno.withdraw(-1000.0)
    accountBruno.logInfo()

    println("Transfer")
    accountBruno.transfer(200.0, accountAlex)
    accountBruno.transfer(50.0, accountAlex)
    accountBruno.logInfo()
    accountAlex.logInfo()
}

fun logField(label: String, value: Any) {
    println("$label: $value")
}


