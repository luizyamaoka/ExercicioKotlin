package br.com.digital

class Contrato(override var nome: String) : Imprimivel {
    override var tipoDocumento: String = "contrato"

    override fun imprimir() = println("Sou um $tipoDocumento $nome")
}