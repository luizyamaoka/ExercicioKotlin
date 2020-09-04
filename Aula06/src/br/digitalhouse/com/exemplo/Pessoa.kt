package br.digitalhouse.com.exemplo

class Pessoa(var nome: String, var sobrenome: String, var idade: Int) {

    init {
        jantar()
    }

    fun jantar() {
        println("Pessoa $nome $sobrenome esta jantando")
    }

    init {
        println("$nome $sobrenome completou $idade anos")
    }

    fun passearComCachorro(cachorro: Cachorro) {
        println("$nome $sobrenome passeou com o cachorro ${cachorro.nome}")
    }
}