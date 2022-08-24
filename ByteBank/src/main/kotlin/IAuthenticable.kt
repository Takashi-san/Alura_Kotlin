interface IAuthenticable {
    val password: String

    fun authenticate(password: String): Boolean {
        val result = this.password == password
        if (result) {
            println("succeeded to authenticate")
        }
        else {
            println("failed to authenticate")
        }
        return result
    }
}