package br.bruno.takashi.tengan.alura.bytebank.InternalSystem

import br.bruno.takashi.tengan.alura.bytebank.IAuthenticable

class InternalSystem {
    fun login(authenticable: IAuthenticable, password: String) {
        if (authenticable.authenticate(password)) {
            println("Welcome to the internal system")
        }
        else {
            println("Internal system authentication failed")
        }
    }
}