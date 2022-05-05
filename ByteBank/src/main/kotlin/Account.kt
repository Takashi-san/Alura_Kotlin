class Account {
    var owner = ""
    var id = 0
    var balance = 0.0

    fun logInfo() {
        logField("owner", owner)
        logField("id", id)
        logField("balance", balance)
        println()
    }

    fun isValidDepositValue(value: Double): Boolean {
        return value >= 0
    }

    fun deposit(value: Double) {
        if (isValidDepositValue(value)) {
            balance += value
        }
    }
}