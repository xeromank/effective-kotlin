package com.kotlin.ch02

import java.lang.Exception

class Item11 {

    fun voidReturn(): Unit{
        println("없지롱")
    }

    fun nullReturn(): String? {
        println("나는 null을 리턴해")
        return null
    }

    fun page74ProblemInLet(){

        val map = mutableMapOf<String, String>()
        val list = mutableListOf<String>()
        val test:String? = "123"
        test?.let{
            println("test는 null이 아니다")
            list.add("b")
            voidReturn()
//            nullReturn()
            map.put("b", "b") // <<== 이녀석이 null을 리턴함...
        } ?: run {
            println("let의 결과는 null")
            throw Exception("let의 결과가 null이야")
        }
    }

}
fun main(){
    Item11().page74ProblemInLet()
}
