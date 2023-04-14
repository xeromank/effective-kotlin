package com.kotlin.item2

fun main(){
    var numbers  = (2..100).toList()
    val primes = mutableListOf<Int>()
    while (numbers.isNotEmpty()) {
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter { it % prime != 0 }
    }
    println(primes)


    // 자바에선 함수형 프로그래밍 안에서 처리시에 아토믹 타입을 강제함
    val primes2: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        var prime: Int
        while(true){
            prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1).filter { it % prime != 0 }
        }
    }

    println(primes2.take(10).toList())
}
