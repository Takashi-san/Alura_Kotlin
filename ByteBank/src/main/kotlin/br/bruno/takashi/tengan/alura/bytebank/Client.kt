package br.bruno.takashi.tengan.alura.bytebank

class Client (
    val name: String,
    val cpf: String,
    override val password: String
) : IAuthenticable {
}