package oop_94079_mariamakarioswirabektidamian.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - (price * discount / 100)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) = if (price > 500000) {
    20
} else {
    10
}

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul: $title")
    println("Harga Akhir: Rp$finalPrice")
}