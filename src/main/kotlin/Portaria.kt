class Portaria {


    fun controle() {
        val idade = Console.readInt("Qual sua idade?")
        if(idade < 18){
            println("Negado, Menores de idade não são permitidos")

        }
        val tipoConvite = Console.readString("Qual é o tipo de convite?")
        println(tipoConvite)
    }
}