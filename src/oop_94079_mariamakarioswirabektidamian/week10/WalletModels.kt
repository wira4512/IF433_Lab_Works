package oop_94079_mariamakarioswirabektidamian.week10

data class Coin(
    override val name: String,
    val balance: Double
) : Named

data class Transaction(
    val id: String,
    val amount: Double
)

// Interface untuk objek yang memiliki nama
interface Named {
    val name: String
}
