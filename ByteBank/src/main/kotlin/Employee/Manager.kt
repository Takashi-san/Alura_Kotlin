package Employee

class Manager(
    name: String,
    cpf: String,
    wage: Double,
    private val password: Int
) : Employee(name, cpf, wage) {
    override fun gratification(): Double {
        return wage * 0.20
    }

    fun authenticate(input: Int): Boolean {
        return input == password
    }
}