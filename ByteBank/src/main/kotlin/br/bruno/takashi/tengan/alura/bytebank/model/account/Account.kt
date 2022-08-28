package br.bruno.takashi.tengan.alura.bytebank.model.account

import br.bruno.takashi.tengan.alura.bytebank.model.client.Client

abstract class Account(
    val owner: Client,
    val id: Int
) {
    var balance = 0.0
        protected set

    companion object {
        var instanceCount = 0
            private set
    }

    init {
        instanceCount++
    }

    constructor(owner: Client, id: Int, balance: Double) : this(owner, id) {
        this.balance = balance
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

    override fun toString(): String {
        return """
            Account(
                owner=$owner, 
                id=$id, 
                balance=$balance
            )
            """.trimIndent()
    }
}