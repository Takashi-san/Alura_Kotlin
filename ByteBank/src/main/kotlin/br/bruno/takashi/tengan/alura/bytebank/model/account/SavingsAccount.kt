package br.bruno.takashi.tengan.alura.bytebank.model.account

import br.bruno.takashi.tengan.alura.bytebank.model.client.Client

class SavingsAccount : Account {
    constructor(owner: Client, id: Int) : super(owner, id)
    constructor(owner: Client, id: Int, balance: Double) : super(owner, id, balance)

    override fun withdraw(value: Double): Boolean {
        if (!super.isValidMoneyInput(value)) return false
        if (value <= super.balance) {
            super.balance -= value
            return true
        }
        return false
    }
}