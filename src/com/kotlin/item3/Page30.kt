package com.kotlin.item3


fun platformType(){
    // 널 안정성 여부를 떠나, 타입은 강제로 지정해야함
    val value = JavaClass().value
    println(value.length)
}

fun statedType(){
    val value: String = JavaClass().value
    println(value.length)
}

fun statedTypeNullable(){
    val value: String? = JavaClass().value

    println(value?.length)
    value?.let { println(it.length) }
}


fun main() {
    statedTypeNullable()
}
