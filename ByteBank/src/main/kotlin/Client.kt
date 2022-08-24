class Client (
    val name: String,
    val cpf: String,
    override val password: String
) : IAuthenticable {
}