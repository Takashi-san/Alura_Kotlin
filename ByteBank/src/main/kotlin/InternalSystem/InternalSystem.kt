package InternalSystem

import IAuthenticable

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