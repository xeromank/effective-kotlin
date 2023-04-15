package com.kotlin.ch01.item1

data class User2 constructor(
    val name: String,
)

class User2Repo {
    private val storedUsers: MutableMap<Int, String> =
        mutableMapOf()

    fun loadAll(): MutableMap<Int, String> {
        return storedUsers
    }
//    아래처럼 리턴 형태를 읽기 전용 슈퍼타입(상위타입)으로 업캐스팅하면 불변
//    fun loadAll(): Map<Int, String> {
//        return storedUsers
//    }

    fun input4(s: String) {
        storedUsers[4] = "K"
    }

    init {
//        storedUsers[0] = "0"
//        storedUsers[1] = "1"
//        storedUsers[2] = "2"
//        storedUsers[3] = "3"
//        storedUsers[4] = "4"
    }
}

fun main(){
    val user2Repo = User2Repo()

    // private 인 변경 가능 컬렉션을 메서드에서 리턴해주면;;
    val storedUsers = user2Repo.loadAll()

    // userRepository 의 private 상태인 속성을 수정 할 수 있음
    // 근데 아래는 해당 객체밖에서의 명령형 프로그래밍 구조이기도해서 지양해야함
    storedUsers[4] = "K"

    user2Repo.input4("K")

    println(user2Repo.loadAll())
}
