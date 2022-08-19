class Portaria {
    private val console = Console()

    fun controle() {
        val idade = console.readInt("Qual sua idade?")
        println(idade)
    }
}