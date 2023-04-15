package com.kotlin.ch01.item5


fun main(){

    earlyReturn(null)
    earlyReturn("영남")
    testRequire(11)
    testCheck(false)


}

fun testRequire(i: Int){
    require(i > 10){
        "${i}는 10보다 작은데? 이럼 안됨"
    }
}

fun testCheck(b: Boolean){
    check(b) { "false?" }
}

fun earlyReturn(name: String?){
    // 자바에선 상상조차 못 하던 코드...
//    val name: String = name ?: return

    val name: String = name ?: run {
        println("이름이 널이다")
        return
    }

    println("이름은 ${name}이다")
}
