package br.digitalhouse.com.exemplo

fun main() {
    val pessoa = Pessoa("Luiz", "Yamaoka", 30)
    val cachorro = Cachorro("Kimi", "Vira lata")

    pessoa.passearComCachorro(cachorro)
}