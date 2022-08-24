package Account

import logField

abstract class Account(
    val owner: String,
    val id: Int
) {
    var balance = 0.0
        protected set

    constructor(owner: String, id: Int, balance: Double) : this(owner, id) {
        this.balance = balance
    }

    fun logInfo() {
        logField("owner", owner)
        logField("id", id)
        logField("balance", balance)
        println()
    }

    protected fun isValidMoneyInput(value: Double): Boolean = value > 0.0

    fun deposit(value: Double): Boolean {
        if (!isValidMoneyInput(value)) return false
        balance += value
        return true
    }

    abstract fun withdraw(value: Double): Boolean

    fun transfer(value: Double, to: Account): Boolean {
        if (!isValidMoneyInput(value)) return false
        if (!withdraw(value)) return false
        return to.deposit(value)
    }
}