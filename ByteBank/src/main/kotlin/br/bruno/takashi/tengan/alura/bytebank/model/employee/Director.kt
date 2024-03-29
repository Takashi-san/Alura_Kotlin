package br.bruno.takashi.tengan.alura.bytebank.model.employee

import br.bruno.takashi.tengan.alura.bytebank.logField

class Director(
    name: String,
    cpf: String,
    wage: Double,
    password: String,
    private val plr: Double
) : Manager(name, cpf, wage, password) {
    override val gratification: Double get() = super.gratification + plr

    override fun logInfo() {
        super.logInfo()
        logField("plr", plr)
    }
}