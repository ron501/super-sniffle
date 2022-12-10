package com.mifen.zadanie1

data class Carnivores(
    val name: String,
    val size: Int
) {
    fun printName() {
        println(name)
    }

    fun eatSmth(eat: String) {
        println("$name ate $eat")
    }
}