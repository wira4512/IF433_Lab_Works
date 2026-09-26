package oop_94079_mariamakarioswirabektidamian.Week05

fun main() {

    val mathHelper = MathHelper()

    // Luas persegi
    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas persegi = $luasPersegi")

    // Luas persegi panjang
    val luasPersegiPanjang = mathHelper.hitungLuas(10, 5)
    println("Luas persegi panjang = $luasPersegiPanjang")

    // Luas lingkaran
    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas lingkaran = $luasLingkaran")
}