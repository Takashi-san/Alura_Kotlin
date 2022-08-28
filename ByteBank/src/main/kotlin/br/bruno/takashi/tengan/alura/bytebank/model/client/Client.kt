package br.bruno.takashi.tengan.alura.bytebank.model.client

import br.bruno.takashi.tengan.alura.bytebank.model.authentication.IAuthenticable

class Client (
    val name: String,
    val cpf: String,
    override val password: String
) : IAuthenticable {
}