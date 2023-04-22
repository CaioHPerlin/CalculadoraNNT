import kotlin.math.pow

fun main() {
    println("Boas-vindas à calculadora! Selecione o número correspondente à opção desejada abaixo:")
    while(true){
        println("\n(1) Soma\n(2) Subtração\n(3) Multiplicação\n(4) Divisão\n(5) Potênciação\n(6) Raiz Qualquer\n(7) SAIR")
        val option = readln()
        if(option == "7") break

        val operationName = when (option){
            "1" -> "Soma"
            "2" -> "Subtração"
            "3" -> "Multiplicação"
            "4" -> "Divisão"
            "5" -> "Potênciação"
            "6" -> "Raiz Qualquer"
            else -> "INVÁLIDO"
        }

        if(operationName == "INVÁLIDO"){
            println("Você inseriu um comando inválido... A aplicação será finalizada.")
            break
        }

        println("Você selecionou $operationName. Insira os valores necessários:")
        print("Valor 1:")
        val n1 = readln().toDouble()
        print("Valor 2:")
        val n2 = readln().toDouble()

        val result = when (option) {
            "1" -> soma(n1, n2)
            "2" -> subtracao(n1, n2)
            "3" -> multiplicacao(n1, n2)
            "4" -> divisao(n1, n2)
            "5" -> potencia(n1, n2)
            "6" -> raizQualquer(n1, n2)
            else -> "OPERAÇÃO INVÁLIDA"
        }

        println("Resultado: $result")
    }
}

fun soma (x: Double, y: Double) = x + y
fun subtracao (x: Double, y: Double) = x - y
fun multiplicacao (x: Double, y: Double) = x * y
fun divisao (x: Double, y: Double) = x / y
fun potencia (x: Double, y: Double) = x.pow(y)
fun raizQualquer (x: Double, y: Double) = x.pow(1/y)