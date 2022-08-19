package control

import business.ConvidadoBusiness
import entity.Convite

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()
    init{
        println("Portaria inicializada!")
        println(controle())
    }
    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade?")
        val convidado = Convite(idade = idade)
        if(!convidadoBusiness.maiorDeIdade(idade)){
            return "Negado, Menores de idade não são permitidos"

        }
        convidado.tipo = Console.readString("Qual é o tipo de convite?")
        if(!convidadoBusiness.tipoValido(convidado.tipo)){
            return "Negado. Convite inválido!"
        }
        convidado.codigo = Console.readString("Qual é o tipo de convite?")

        if(!convidadoBusiness.convidadoValido(convidado)){
            return "Negado. Convite inválido!"
        }


        return "Welcome! :D!"
    }
}