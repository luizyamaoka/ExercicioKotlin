package br.com.digital

fun main() {

    val foto = Foto("selfie")
    val contrato = Contrato("muito legal")
    val documento = Documento("word")

    val impressora = Impressora()
    impressora.add(foto)
    impressora.add(contrato, documento)

    impressora.imprimirTudo()

}