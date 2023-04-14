package com.kotlin.item2

fun main(){
    val users = listOf("A", "B")

    // withIndex 몰랐음. 그래서 타이핑 해봄 ㅋㅋㅋ
    // 좋은건 따라해야지 ㅋㅋㅋ
    for((i, user) in users.withIndex()){
        println("User at $i is $user")
    }
}
