package oop_94079_mariamakarioswirabektidamian.week03

fun main() {
    val e = Employee("Budi")
    println("-----Test Error------")
    e.salary = 5000 // Ini akan meledakkan program Anda
}