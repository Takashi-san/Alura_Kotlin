package br.bruno.takashi.tengan.alura.bytebank.Test

import br.bruno.takashi.tengan.alura.bytebank.Account.CheckingAccount
import br.bruno.takashi.tengan.alura.bytebank.Account.SavingsAccount

fun testAccountPolimorphism() {
    val checkingAccount = CheckingAccount("Carlos", 101)
    val savingsAccount = SavingsAccount("Maria", 202)

    checkingAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("deposit 1000.0")
    checkingAccount.logInfo()
    savingsAccount.logInfo()

    checkingAccount.withdraw(100.0)
    savingsAccount.withdraw(100.0)

    println("withdraw 100.0")
    checkingAccount.logInfo()
    savingsAccount.logInfo()

    checkingAccount.transfer(100.0, savingsAccount)

    println("transfer 100.0 from checking to saving")
    checkingAccount.logInfo()
    savingsAccount.logInfo()

    savingsAccount.transfer(100.0, checkingAccount)

    println("transfer 100.0 from saving to checking")
    checkingAccount.logInfo()
    savingsAccount.logInfo()
}