package br.bruno.takashi.tengan.alura.bytebank.model.account

import br.bruno.takashi.tengan.alura.bytebank.model.client.Client

class CheckingAccount : Account {
    constructor(owner: Client, id: Int) : super(owner, id)
    constructor(owner: Client, id: Int, balance: Double) : super(owner, id, balance)

    override fun withdraw(value: Double): Boolean {
        if (!super.isValidMoneyInput(value)) return false
        val taxes = 0.1
        val valueWithTaxes = value * (1 + taxes)
        if (valueWithTaxes <= super.balance) {
            super.balance -= valueWithTaxes
            return true
        }
        return false
    }
}