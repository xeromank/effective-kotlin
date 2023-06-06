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


    var ss:String? = null

    if(ss != null){
        print(ss)
    }
}

fun aa(){
    var ss: Map<String, String>? = ss1()

    requireNotNull(ss)
    print(ss["123"])

    ss = ss2()
    print(ss["123"])
}
fun ss1(): Map<String, String>?{
    return null
}

fun ss2(): Map<String, String>?{
    return mapOf()
}
