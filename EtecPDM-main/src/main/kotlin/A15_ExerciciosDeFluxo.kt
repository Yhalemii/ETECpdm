//Yalem Hay e Henrique Bernardino (3 Jogos)
    // Aula 15: Controle de fluxo ecercicios

//Controle de Fluxo - for()
fun main() {
    // crescente()
    // decrescente()
    // excetoM5()
    // somaSequencia()
    //escada(5)
    escadaInvertida(n: Int){}
}

//1. imprimir os números de 1 a 50 na mesma linha em ordem crescente.
// A saída esperada deve ser semelhante a esta: 1 2 3 4 5 6 7 8 9 10 ....... 49 50.
// Você usará o loop for() para esta tarefa.

fun crescente(){
    for(i in 1..50){
        print("$i")
    }

}

//2.Imprimirá os números de 1 a 50 na mesma linha em ordem decrescente usando o loop for().
// A saída esperada deve ser: 50 49 48 47 46 45 ......... 3 2 1.

fun decrescente() {
    for (i in 50 downTo 1){
        print("$1")
    }
}

//3.sua próxima tarefa é imprimir os números de 1 a 50 na mesma linha em ordem crescente, excluindo os múltiplos de 5.
// Você conseguirá isso usando o loop for().

fun excetoM5(){
    for(i in 1..50){
        if(i % 5 !=0){
             print("$i")
            }
        }
    }

//4.Para a quarta tarefa, você somará todos os números no intervalo de 1 a 500 usando o loop for().
// No final, você imprimirá o valor da soma.
fun somaSequencia(){
    var soma = 0
    for (i in 1..500){
        //soma = soma + i
        soma += i
    }
    println(soma)
}

/*5. Escrever um programa capaz de pegar um inteiro n e imprimir uma escada de tamanho n usando o caractere de libra (#).
 Você usará o loop for() para esta tarefa. Por exemplo, se a entrada for 5, a saída deverá ser:
            #
            ##
            ###
            ####
            #####

 */
fun escada(n: Int){
    for (i in 1..n){
        for (j in 1..i) {
            print("#-")
        }
        println()
        }
    }

// Teste aleátório escada invertida
fun escadaInvertida(){
    for (i in 1 downTo n) {
        for (j in 1 downTo i) {
            print("#-")
        }
        println()
        }
    }



