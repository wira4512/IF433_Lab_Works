package oop_94079_mariamakarioswirabektidamian.week04

fun main() {
    val manager = Manager(
        name = "Budi",
        baseSalary = 10000000
    )

    val developer = Developer(
        name = "Andi",
        baseSalary = 8000000,
        programmingLanguage = "Kotlin"
    )

    // Manager
    manager.work()
    println("Bonus Manager: Rp${manager.calculateBonus()}")

    println()

    // Developer
    developer.work()
    println("Bonus Developer: Rp${developer.calculateBonus()}")
}