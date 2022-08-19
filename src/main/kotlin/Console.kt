class Console {
    fun readInt(msg: String): Int {
        var retorno: Int? = null
        do{
            print(msg)
            val info = readLine()

            if (info != null && info != "") {
                retorno = info.toIntOrNull()
                if (retorno == null || retorno <=0) {
                    println("Valor Invalido.")
                }
            }else{
                println("Valor Invalido.")
            }
        }while(retorno == null || retorno <= 0)

        return retorno
    }
}