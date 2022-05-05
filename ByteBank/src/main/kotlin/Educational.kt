object Educational {
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
            for (j in  0 until 10) {
                println("j $j")
                if (j == 3) break@label
            }
        }
    }

    fun testConditinals(balance: Double) {
        when {
            balance > 0.0 -> println("positive account")
            balance < 0.0 -> println("negative account")
            else -> println("neutral account")
        }

        // equivalent to the if below.
//    if (balance > 0.0) {
//        println("positive account")
//    }
//    else if (balance < 0.0) {
//        println("negative account")
//    }
//    else {
//        println("neutral account")
//    }
    }
}