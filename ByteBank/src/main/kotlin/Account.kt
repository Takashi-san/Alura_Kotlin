class Account {
    var owner = ""
    var id = 0
    var balance = 0.0

    private fun logField(label: String, value: Any) {
        println("$label: $value")
    }

    fun logInfo() {
        logField("owner", owner)
        logField("id", id)
        logField("balance", balance)
        println()
    }
}