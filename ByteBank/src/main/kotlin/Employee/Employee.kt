package Employee

import logField

abstract class Employee(
    val name: String,
    val cpf: String,
    val wage: Double
) {
    open fun logInfo() {
        logField("name", name)
        logField("cpf", cpf)
        logField("wage", wage)
        logField("gratification", gratification)
    }

    // This property being abstract forces every definition of Employee to make an implementation of their own.
    abstract val gratification: Double
}