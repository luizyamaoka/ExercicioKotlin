package br.com.digital

class Documento(override var nome: String) : Imprimivel {

    override var tipoDocumento: String = "documento"

    override fun imprimir() = println("Eu sou um $tipoDocumento $nome")
}