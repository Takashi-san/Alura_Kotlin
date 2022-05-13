fun main() {
    println("Welcome to the ByteBank!")
    println()

    val accountBruno = Account("Bruno", 123, 200.0)
    val accountAlex = Account("Alex", 456, 100.0)
    val accountMaria = Account(balance = 50.0, id = 789, owner = "Maria")

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
    accountAlex.transfer(to = accountMaria, value = 100.0)
    accountMaria.transfer(value = 200.0, accountAlex)
//    accountMaria.transfer(to = accountBruno, 1.0) // This causes error, unordered label usage require that you label all arguments.
    accountBruno.logInfo()
    accountAlex.logInfo()
    accountMaria.logInfo()
}

fun logField(label: String, value: Any) {
    println("$label: $value")
}


