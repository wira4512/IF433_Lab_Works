package oop_94079_mariamakarioswirabektidamian.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)
}