package Account

class CheckingAccount(
    owner: String,
    id: Int
) : Account(
    owner,
    id
) {
    override fun withdraw(value: Double): Boolean {
        val taxes = 0.1
        return super.withdraw(value + taxes)
    }
}