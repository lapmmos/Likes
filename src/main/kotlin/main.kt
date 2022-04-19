package ru.netology

fun main() {
    print("Введите количество лайков: ")
    val likes = readln().toInt()
    val variant:Int = (likes%10)
    val note: String =if(variant==1) "человеку" else "людям"


    println("Понравилось $likes $note")
}