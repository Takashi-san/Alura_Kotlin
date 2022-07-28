package Tests

import Calculator.GratificationCalculator
import Employee.Director
import Employee.Employee
import Employee.Manager
import logField

fun testEmployeePolimorphism() {
    val bruno = Employee(
        "Bruno",
        "101.010.001-10",
        1000.0
    )
    bruno.logInfo()
    println()

    val maria = Manager(
        "Maria",
        "222.222.222-22",
        1000.0,
        1234
    )
    maria.logInfo()
    maria.authenticate(1234)
    println()

    val guilherme = Director(
        "Guilherme",
        "333.333.333-33",
        1000.0,
        5678,
        300.0
    )
    guilherme.logInfo()
    guilherme.authenticate(1234)
    println()

    val calculator = GratificationCalculator()
    calculator.register(bruno)
    calculator.register(maria)
    calculator.register(guilherme)
    logField("gratification total", calculator.total)
}