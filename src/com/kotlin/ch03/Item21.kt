package com.kotlin.ch03

import kotlin.reflect.KProperty

class Item21 {

}

class ChangeBefore {

    var token: String? = null
        get() {
            print("token returned value $field")
            return field
        }
        set(value) {
            print("token changed from $field to $value")
            field = value
        }

    var attempts: Int = 0
        get() {
            print("attempts returned value $field")
            return field
        }
        set(value) {
            print("attempts changed from $field to $value")
            field = value
        }

}

class ChangeAfter {
    var token: String? by LoggingProperty(null)
    var attempts: Int by LoggingProperty(0)
}

class LoggingProperty<T>(private var value: T){
    operator fun getValue(
        thisRef: Any?,
        prop: KProperty<*>
    ): T {
        print("${prop.name} returned value $value")
        return value
    }

    operator fun setValue(
        thisRef: Any?,
        prop: KProperty<*>,
        newValue: T
    ) {
        print("${prop.name} changed from $value to $newValue")
        value = newValue
    }

}

fun main() {

}