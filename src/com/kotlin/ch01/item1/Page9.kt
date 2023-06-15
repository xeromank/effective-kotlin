package com.kotlin.ch01.item1

class Page9 {
    fun calculate(): Int {
        println("Calculation... ")
        return 42
    }

    val fizz = calculate()
    val buzz
        get() = calculate()

}
fun main() {
    val aa = listOf<String>()
    val bb = mutableListOf<String>()
    val page9 = Page9()
    println(page9.fizz)
    println(page9.fizz)
    println(page9.buzz)
    println(page9.buzz)


//    Calculation... # 객체 초기화 과정에서 fizz에 담기 위해 calculate() 실행
//    42             # fizz 출력
//    42             # fizz 출력
//    Calculation... # custom getter 호출과정에서 calculate() 실행
//    42             # buzz 출력
//    Calculation... # custom getter 호출과정에서 calculate() 실행
//    42             # buzz 출력
}

interface Element {
    val active: Boolean
}

class ActualElement constructor(
    override var active: Boolean = false
): Element
