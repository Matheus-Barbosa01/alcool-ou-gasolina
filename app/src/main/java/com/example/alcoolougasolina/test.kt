package com.example.alcoolougasolina

import android.view.View
var textoInformar = arrayOf("É calculado através de uma formula de divisão do alcool pela gasolina\n",
    "Se a divisão for maior que 0.70 então é melhor gasolina \n",
    "se a divisão for menor que 0.70 então é melhor alcool \n",
    "se a divisão for iguai a 0.70 então não tem diferença em qual usar \n")
var informarCalculo = ""
fun main() {
    TesteOpercao(informarCalculo)
}
fun TesteOpercao(test:String){
    if(informarCalculo != textoInformar.joinToString()) {
       var preparo = textoInformar.joinToString()
        informarCalculo = preparo.replace(","," ")
        println(informarCalculo)
    } else if(informarCalculo == textoInformar.joinToString()){
        informarCalculo = textoInformar.drop(4).joinToString()
        println(informarCalculo)
    }
}