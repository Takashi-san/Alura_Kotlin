class Account {
    private var owner = ""
    private var id = 0
    private var balance = 0.0

    constructor(owner: String, id: Int, balance: Double) {
        this.owner = owner
        this.id = id
        this.balance = balance
    }

    fun getOwner(): String = owner
    fun getID(): Int = id
    fun getBalance(): Double = balance
    fun setBalance(value: Double) {
        if (isValidMoneyInput(value)) {
            balance = value
        }
    }

    fun logInfo() {
        logField("owner", owner)
        logField("id", id)
        logField("balance", balance)
        println()
    }

    private fun isValidMoneyInput(value: Double): Boolean = value > 0.0

    fun deposit(value: Double): Boolean {
        if (!isValidMoneyInput(value)) return false
        balance += value
        return true
    }

    fun withdraw(value: Double): Boolean {
        if (!isValidMoneyInput(value)) return false
        if (value <= balance) {
            balance -= value
            return true
        }
        return false
    }

    fun transfer(value: Double, to: Account): Boolean {
        if (!isValidMoneyInput(value)) return false
        if (!withdraw(value)) return false
        return to.deposit(value)
    }
}