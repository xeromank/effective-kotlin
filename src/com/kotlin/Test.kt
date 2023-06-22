package com.kotlin

import java.lang.IllegalStateException
import java.time.LocalDateTime
import kotlin.random.Random

class Test {
}

fun main() {
    val account: Account = CompanyLifeProxy()
    account.deposit(118)
}

interface Account {
    fun deposit(won: Int)

    fun withdraw(won: Int, credit: String)
}

class CompanyLife(
    private var balance: Int = 0
) : Account {
    override fun deposit(won: Int) {
        println("입금 - $won ₩ - 월급 - ${LocalDateTime.now()}")
        balance += won
        println("잔고 - $balance ₩")
    }

    override fun withdraw(won: Int, credit: String) {
        println("출금 - $won ₩ - $credit - ${LocalDateTime.now()}")
        balance -= won
        if(balance < 0){
            throw IllegalStateException("잔고가 부족합니다.")
        }
        println("잔고 - $balance ₩")
    }
}

class CompanyLifeProxy : Account{
    private val account: Account = CompanyLife()
    override fun deposit(won: Int) {
        account.deposit(won)
        withdraw()
    }
    private fun withdraw(){

        withdraw(Random.nextInt(30, 41), Cards.findByIdx(1).cardName)
        withdraw(Random.nextInt(30, 41), Cards.findByIdx(2).cardName)
        withdraw(Random.nextInt(30, 41), Cards.findByIdx(3).cardName)
        withdraw(Random.nextInt(30, 41), Cards.findByIdx(0).cardName)
    }

    override fun withdraw(won: Int, credit: String) {
        account.withdraw(won, credit)
    }
}

enum class Cards(
    val cardName: String
) {

    K("K카드"),
    H("H카드"),
    N("N카드"),
    W("W카드");

    companion object{
        fun findByIdx(idx: Int): Cards {
            return Cards.values()[idx]
        }
    }
}