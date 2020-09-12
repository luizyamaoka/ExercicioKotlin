package br.com.digital

class Foto(override var nome: String) : Imprimivel {

    override var tipoDocumento: String = "foto"

    override fun imprimir() = println("Eu sou uma $tipoDocumento $nome")

}