object EducationalTests {
    fun testPassByValueReference() {
        // Pass by value
        // Primitive types are passed by value.
        val valueA = 10
        var valueB = valueA
        valueB++
        logField("valueA", valueA)
        logField("valueB", valueB)
        println()

        // Pass by reference
        // Objects are passed by reference
        val refA = Account("John", 123, 100.0)
        val refB = refA
        refB.deposit(200.0)
        logField("refA balance", refA.balance)
        logField("refB balance", refB.balance)
        logField("refA hash", refA)
        logField("refB hash", refB)
        println()

        // If you want to pass an object by value, you have to implement in your class a copy method to do so.
    }

    fun testControlFlow() {
//    var i = 0 // Use when using while
//    while (i < 5) {
//    for (i in 0..4) {
//    for (i in 4 downTo 0) {
//    for (i in 4 downTo 0 step 2) {
        for (i in 0 until 5) {
            when (i) {
                3 -> break
                2 -> {
//                i++ // Use when using while
                    continue
                }
            }

            val owner: String = "owner $i"
            val accountID: Long = 9000L + i
            var accountBalance: Double = 50.0 * i
            accountBalance *= if (i % 2 == 0) 1 else -1 // There is no ternary operator since If and When are considered expressions and return a value.

            println("owner: $owner")
            println("account ID: $accountID")
            println("account balance: \$ $accountBalance")
            testConditinals(accountBalance)
            println()

//        i++ // Use when using while
        }

        // Kotlin has labels! It works for control flows and return from functions!
        label@ for (i in 0 until 10) {
            println("i $i")
            for (j in 0 until 10) {
                println("j $j")
                if (j == 3) break@label
            }
        }
    }

    fun testConditinals(number: Double) {
        // This when expression is equivalent to the if expression below.
        when {
            number > 0.0 -> println("positive number")
            number < 0.0 -> println("negative number")
            else -> println("neutral number")
        }

        if (number > 0.0) {
            println("positive number")
        } else if (number < 0.0) {
            println("negative number")
        } else {
            println("neutral number")
        }
    }

    fun testFunctionLabelCall() {
        val accountBruno = Account("Bruno", 123, 200.0)
        val accountAlex = Account("Alex", 456, 100.0)
        val accountMaria = Account(balance = 50.0, id = 789, owner = "Maria")

        println("Deposit")
        accountBruno.deposit(50.0)
        accountBruno.deposit(-50.0)
        accountBruno.logInfo()

        println("Withdraw")
        accountBruno.withdraw(100.0)
        accountBruno.withdraw(-100.0)
        accountBruno.withdraw(-1000.0)
        accountBruno.logInfo()

        println("Transfer")
        accountBruno.transfer(200.0, accountAlex)
        accountBruno.transfer(50.0, accountAlex)
        accountAlex.transfer(to = accountMaria, value = 100.0)
        accountMaria.transfer(value = 200.0, accountAlex)
//    accountMaria.transfer(to = accountBruno, 1.0) // This causes error, unordered label usage require that you label all arguments.
        accountBruno.logInfo()
        accountAlex.logInfo()
        accountMaria.logInfo()
    }
}