package com.example.HomeTaskSeven

class AtividadeUm {
}
//1. Crie uma funcao de extencao para o tipo primitivo String
//que transforma a stirng em uma lista de strings
//composta por todas as letras da mesma

//P.S. Criei tres. Talvez aprofundei demais no assunto.

//Um tipo da funcao
fun String.transform() = println(this.toList())
//Segundo tipo da funcao
fun String.transform2() = println(this.chunked(1))
//Terceiro tipo da funcao
fun String.transform3() = println(this.toMutableList())

fun main(){
    //2. Crie uma String e utilizando a extensao criada imprima todas as letras da string

    //P.S.Criei tres pra testar todas as tres funcoes
var testStringOne = "TransormaAStringPraListaUM"
    testStringOne.transform()
var testStringTwo = "TransformAStringPraListaDOIS"
testStringTwo.transform2()
    var testStringThree = "TransformAStringPraListaTRES"
    testStringThree.transform3()

}

