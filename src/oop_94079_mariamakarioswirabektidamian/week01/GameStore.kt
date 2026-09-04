package oop_94079_mariamakarioswirabektidamian.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - (price * discount / 100)

    printReceipt(
        title = gameTitle,
        price = price,
        finalPrice = finalPrice,
        note = userNote ?: "Tidak ada catatan"
    )
}

fun calculateDiscount(price: Int) = if (price > 500000) {
    20
} else {
    10
}

fun printReceipt(title: String, price: Int, finalPrice: Int, note: String) {
    println("Judul: $title")
    println("Harga Asli: Rp$price")
    println("Harga Akhir: Rp$finalPrice")
    println("Catatan: $note")
}