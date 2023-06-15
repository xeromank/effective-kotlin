package com.kotlin.ch03

class Item24 {

}

open class Ad(
    var name: String
) {

    var price: Int = 0
    var displayCount: Int = 0
    var amount: Int = 0
}

class CommerceAd(name: String) : Ad(name) {

}

class SmallHomeOfficeMallAd(name: String) : Ad(name) {

}

fun commerceCalc() {
    val list = mutableListOf(CommerceAd("name"))
    calcAmount(list)
}

fun smallHomeOfficeMallCalc() {
    val list = mutableListOf(SmallHomeOfficeMallAd("name"))
    calcAmount(list)
}

private fun calcAmount(list: MutableList<out Ad>): MutableList<out Ad> {
    list.map {
        it.amount = it.price * it.displayCount
    }

    return list
}

fun main() {
    val list = mutableListOf(CommerceAd("name"))
    val possibleRead = calcAmount(list)
    possibleRead.add(CommerceAd("name"))

    val possibleWrite: MutableList<in Ad> = mutableListOf()
    possibleWrite.add(CommerceAd("name"))
    possibleWrite.map {
        it.amount
    }
}