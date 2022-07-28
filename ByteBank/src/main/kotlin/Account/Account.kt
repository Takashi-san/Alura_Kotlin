package Account

import logField

open class Account(
    val owner: String,
    val id: Int
) {
    var balance = 0.0
        private set

    constructor(owner: String, id: Int, balance: Double) : this(owner, id) {
        this.balance = balance
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

    open fun withdraw(value: Double): Boolean {
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