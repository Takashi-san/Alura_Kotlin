package br.bruno.takashi.tengan.alura.bytebank.model.employee

class Assistant(name: String, cpf: String, wage: Double) : Employee(name, cpf, wage) {
    override val gratification: Double
        get() = wage * 0.1
}