package br.bruno.takashi.tengan.alura.bytebank.model.account

import br.bruno.takashi.tengan.alura.bytebank.logField
import br.bruno.takashi.tengan.alura.bytebank.model.client.Client
import br.bruno.takashi.tengan.alura.bytebank.model.util.ILoggable

abstract class Account(
    val owner: Client,
    val id: Int
) : ILoggable {
    var balance = 0.0
        protected set

    constructor(owner: Client, id: Int, balance: Double) : this(owner, id) {
        this.balance = balance
    }

    override fun logBody() {
        owner.log()
        logField(::id.name, id)
        logField(::balance.name, balance)
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