import Employee.Employee
import Employee.Manager

fun main() {
    println("Welcome to the ByteBank!")
    println()

    val bruno = Employee(
        "Bruno",
        "101.010.001-10",
        1000.0
    )
    bruno.logInfo()

    val maria = Manager(
        "Maria",
        "222.222.222-22",
        4000.0,
        1234
    )
    maria.logInfo()
    if (maria.authenticate(1234)) {
        println("${maria.name} succeded to authenticate")
    }
    else {
        println("${maria.name} failed to authenticate")
    }
}


