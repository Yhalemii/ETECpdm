// Aula 8 - Atividade pra aula de semana q vem a partir de 27/09/2024 - Henrique Bernardino Silva

fun main()
{
    anos(1)
    println("A palavra inserida tem ${qtdCaracteres("Mementos")} caracteres")
    println("O cubo do número inserido é ${cubo(5)}")
    println("O valor em milhas inserido equivale a ${conversorKm(50)} Km")
    troca("Personaaaaaaaa")
}

// 1. Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e seggundos

fun anos(data: Int)
{
    var meses = (data * 12)
    var dias = (data * 365)
    var horas = (data * 8760)
    var minutos = (data * 525600)
    var segundos = (data * 31536000)
    println("1) O numero de anos escolhido tem: $meses meses, $dias dias, $horas horas , $minutos minutos e $segundos segundos")
}

// 2. Escreva uma função capaz de receber um string e retornar a quantidade de caracteres

fun qtdCaracteres(qtdString: String) = qtdString.length

// 3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n)

fun cubo(numero: Int) = (numero*numero*numero)

// 4. Escreva uma função capaz de receber uma medida em milhas e converter em km (1 milha = 1.6 km)

fun conversorKm(milhas: Int) = milhas * 1.6

/* 5. Escreva um programa que seja capaz de receber uma string e fazer a troca todas as letras "a" ou "A" por "x". Observando que:
    a. Não deve existir lógica dentro da função main. Main só deve ser usada como ponto de entrada.
    b. Escrever uma função para a troca de letras e impressão do valor final.
    c. String final deve estar com todas as letras maiúsculas
    Exemplo: Entrada = "Programação em Kotlin" - Saída = "PROGRxMxÇxO EM KOTLIN"
 */

fun troca(palavra: String) {
    val palavraTrocada = palavra.replace(Regex("[aA]"), "x").uppercase()
    println("A palavra $palavra se tornou $palavraTrocada")
}

// 6. Sobre as funções criadas nos exercícios 2, 3 e 4, é possível transfomá-las em fuções de uma única linha? Se sim, trasforme-as.
// Feito
