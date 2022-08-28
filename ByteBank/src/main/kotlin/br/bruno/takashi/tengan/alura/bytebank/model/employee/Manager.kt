package br.bruno.takashi.tengan.alura.bytebank.model.employee

import br.bruno.takashi.tengan.alura.bytebank.model.authentication.IAuthenticable

open class Manager(
    name: String,
    cpf: String,
    wage: Double,
    override val password: String
) : Employee(name, cpf, wage), IAuthenticable {
    override val gratification: Double
        get() {
            return wage * 2.0
        }
}