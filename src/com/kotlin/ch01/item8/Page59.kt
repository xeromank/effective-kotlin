package com.kotlin.ch01.item8

import java.lang.Exception
import kotlin.properties.Delegates

class LateInitTarget(
    val t: String
)

class LateInitTest(
){
    private lateinit var lateInitTarget : LateInitTarget
    private var intId: Int by Delegates.notNull()

    fun printLateInitTarget(){
        print(lateInitTarget.t.length)
    }

    fun printIntId(){
        print(intId.toLong())
    }
}

fun main(){
    val lateInitTest: LateInitTest = LateInitTest()

    // 오류가 나면 환영해라, lazy init 을 목적에 맞지 않게 사용했다는 증거니까
    try {
        lateInitTest.printIntId()
    }catch (e: Exception){
        e.printStackTrace()
    }

    try {
        lateInitTest.printLateInitTarget()
    }catch (e: Exception){
        e.printStackTrace()
    }

}
