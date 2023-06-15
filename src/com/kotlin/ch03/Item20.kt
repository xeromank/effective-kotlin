package com.kotlin.ch03

class Item20 {
}

fun main() {

    val numberFromUser = 200

    val percent = numberFromUser.coerceIn(0, 100)

    println(percent)
}