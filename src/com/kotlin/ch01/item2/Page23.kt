package com.kotlin.ch01.item2

fun main() {
    // 코틀린의 if는 자바와 다르게 질문이 아닌 결과는 뽑아내는 식이다 when도 마찬가지
    // https://blog.leocat.kr/notes/2019/12/29/kotlin-statement-and-expression
    val s: String = if (1 == 1 * 1 / 1) {
        "1"
    } else {
        "2"
    }
}

// 아래처럼 case 구간에 연산 및 함수 호출도 가능
fun whenTest(v: Int?) {
//    if (v == null) return

    v?.let {
        val rtn = when {
            v < 5 -> "오?"
            v > getTen() -> "텐"
            else -> "응?"
        }
    }

}

fun getTen(): Int {
    return 10
}
