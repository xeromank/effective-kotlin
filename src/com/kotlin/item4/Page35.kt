package com.kotlin.item4

// 아이템3과 유사한 내용이긴 하다
// 결과적으로 타입을 꼭 지정 하라는 얘기인데
// 전혀 엉뚱한 결과를 만드는..
// 자바를 하던 입장에서는 가능하다는 생각조차 못 할 코드인것 같은..


interface Car
class Fiat126P (): Car

val DEFAULT_CAR:Car = Fiat126P()
interface CarFactory {
    fun produce(): Car
}
class CarFactoryImpl():CarFactory{
    override fun produce(): Car {
        return DEFAULT_CAR
    }
}

val SECOND_CAR = Fiat126P()
interface SecondCarFactory {
    fun produce() = SECOND_CAR
}
class SecondCarFactoryImpl():SecondCarFactory{
}


