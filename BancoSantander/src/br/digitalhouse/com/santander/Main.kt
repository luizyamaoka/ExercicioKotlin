package br.digitalhouse.com.santander

fun main() {

    val joao = Cliente("joao", "silva")
    val maria = Cliente("maria", "souza")

    val conta1 = Conta(1, 0.0, joao)
    val conta2 = Conta(2, 0.0, maria)

    conta1.depositar(200.0)
    conta1.sacar(100.0)
    conta1.sacar(1000.0)

    conta2.depositar(500.70)
    conta2.sacar(100.8)
}