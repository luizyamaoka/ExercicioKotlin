package br.com.digital

class Impressora {

    var listaImprimivel = mutableListOf<Imprimivel>()

    fun add(vararg imprimivel: Imprimivel) = listaImprimivel.addAll(imprimivel)

    fun imprimirTudo() {
        for (imp in listaImprimivel)
            imp.imprimir()
    }
}