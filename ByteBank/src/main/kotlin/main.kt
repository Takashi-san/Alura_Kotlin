import Account.CheckingAccount
import Account.SavingsAccount
import Calculator.GratificationCalculator
import Employee.Director
import Employee.Employee
import Employee.Manager
import InternalSystem.InternalSystem
import Tests.testAccountPolimorphism
import Tests.testEmployeePolimorphism

fun main() {
    println("Welcome to the ByteBank!")
    println()

    val system = InternalSystem()

    val client = Client(
        "Bruno",
        "000.000.000-00",
        "banana"
    )
    val director = Director(
        "Carol",
        "111.111.111-11",
        5000.0,
        "uva",
        500.0
    )

    system.login(client, "abacaxi")
    system.login(director, "uva")
}


