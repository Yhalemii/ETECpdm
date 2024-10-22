/*
    Aula 15: Exercícios de reforço
    Controle de Fluxo: while()
 */

// CONTROLE DE FLUXO - while()
fun main(){
    litros()

    fizzBuzz()

    val entrada = "Meu nome é Asdrúbal"
    println(inverterTexto(entrada))

    val entrada = "xXooOx"
    println(verificarXEO(entrada))
}

// 1. Considere uma caixa d'água de 2 mil litros. Rômulo gostaria de encher a cahixa d'água com balões de 7 litros. Quantos balões cabem na caixa d'água sem que o volume seja excedido? Crie uma rotina usando while() que retorne a resposta.
fun litros(){
    var caixa = 2000
    var numBaloes = 0
    while(caixa >= 7){
        caixa -= 7
        numBaloes++
    }
    println("Cabem $numBaloes balões.")
}

/* 2. FizzBuzz
    Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo. Use while() ou do while()
        a. Quando um número for divisível por 3, imprimir Buzz.
        b. Quando um número for divisível por 5, imprimir Fizz.
        c. Quando um número for divisível por 3 e 5 simultaneamente, imprimir FizzBuzz
 */

fun fizzBuzz() {
    var i = 1
    while (i <= 50) {
        if (i % 15 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Buzz")
        } else if (i % 5 == 0) {
            println("Fizz")
        } else {
            println(i)
        }
        i++
    }
}

/* 3. Escreva um código, usando while() ou do while(), capaz de receber um texto e imprimí-lo invertido
      Exemplo de entrada: Meu nome é Asdrúbal
      Exemplo de saída esperada: labúrdsA é emon ueM
*/
fun inverterTexto(texto: String): String {
    var i = texto.length - 1
    var textoInvertido = ""
    while (i >= 0) {
        textoInvertido += texto[i]
        i--
    }
    return textoInvertido
}

// 4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres "x" e "o" e retorna true ou false. Caso não exista nem "x" nem "o", retornar false. Use while() ou do while()

fun verificarXEO(texto: String): Boolean {
    var i = 0
    var contadorX = 0
    var contadorO = 0

    while (i < texto.length) {
        if (texto[i].lowercaseChar() == 'x') {
            contadorX++
        } else if (texto[i].lowercaseChar() == 'o') {
            contadorO++
        }
        i++
    }
    return if (contadorX == 0 && contadorO == 0) false else contadorX == contadorO
}