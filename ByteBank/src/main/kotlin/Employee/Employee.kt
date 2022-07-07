package Employee

import logField

open class Employee(
    val name: String,
    val cpf: String,
    val wage: Double
) : IEmployee {
    override fun logInfo() {
        logField("name", name)
        logField("cpf", cpf)
        logField("wage", wage)
        logField("gratification", gratification())
        println()
    }

    override fun gratification(): Double {
        return wage * 0.10
    }
}