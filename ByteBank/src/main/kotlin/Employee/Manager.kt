package Employee

open class Manager(
    name: String,
    cpf: String,
    wage: Double,
    private val password: Int
) : Employee(name, cpf, wage) {
    override val gratification: Double
        get() {
            return super.gratification + wage
        }

    fun authenticate(input: Int): Boolean {
        val result: Boolean = input == this.password

        if (result) {
            println("${this.name} succeeded to authenticate")
        }
        else {
            println("${this.name} failed to authenticate")
        }

        return result
    }
}