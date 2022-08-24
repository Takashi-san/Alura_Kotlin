package Account

class SavingsAccount : Account {
    constructor(owner: String, id: Int) : super(owner, id)
    constructor(owner: String, id: Int, balance: Double) : super(owner, id, balance)

    override fun withdraw(value: Double): Boolean {
        if (!super.isValidMoneyInput(value)) return false
        if (value <= super.balance) {
            super.balance -= value
            return true
        }
        return false
    }
}