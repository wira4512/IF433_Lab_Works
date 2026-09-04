package oop_94079_mariamakarioswirabektidamian.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000

    val discount = calculateDiscount(price)
}

fun calculateDiscount(price: Int) = if (price > 500000) {
    20
} else {
    10
}