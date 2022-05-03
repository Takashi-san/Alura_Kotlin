fun main() {
    println("Welcome to the ByteBank!")

    val owner: String = "Bruno Takashi"
    val accountID: Long = 9001
    var accountBalance = 0.0
    accountBalance += 100
    accountBalance -= 50

    println("owner: $owner")
    println("account ID: $accountID")
    println("account balance: \$$accountBalance")
}