package com.kotlin.item1

data class User constructor(
    val name: String,
    val surname: String,
)

fun main(){
    var user = User("Maja", "Markiewicz")
    user = user.copy(surname = "Moskala")
    println(user)
}

// JPA 에서 data class를 사용하면 안되는 이유
// https://velog.io/@heyday_7/JPA-Entity-%EC%8B%AC%EC%B8%B5%ED%83%90%EA%B5%AC-1-Entity%EC%97%90-Kotlin-Data-class%EB%A5%BC-%EC%8D%A8%EB%8F%84-%EB%90%A0%EA%B9%8C
