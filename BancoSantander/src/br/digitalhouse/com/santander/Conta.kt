package br.digitalhouse.com.santander

class Conta(val numero: Int, var saldo: Double, titular: Cliente) {

    fun depositar(valor: Double) {
        saldo += valor
        println("[DEPOSITO] Saldo $saldo")
    }

    fun sacar(valor: Double) {
        when {
            valor > saldo -> println("[SAQUE] Saldo insuficiente")
            else -> {
                saldo -= valor
                println("[SAQUE] Saldo $saldo")
            }
        }

    }

}