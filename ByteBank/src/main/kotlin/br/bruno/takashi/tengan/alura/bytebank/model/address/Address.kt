package br.bruno.takashi.tengan.alura.bytebank.model.address

class Address(
    var residence: String = "",
    var number: String = "",
    var district: String = "",
    var city: String = "",
    var state: String = "",
    var zip: String = "",
    var complement: String = ""
) {
    override fun toString(): String {
        return """
            Address(
                residence='$residence', 
                number='$number', 
                district='$district', 
                city='$city', 
                state='$state', 
                zip='$zip', 
                complement='$complement'
            )
            """.trimIndent()
    }
}







