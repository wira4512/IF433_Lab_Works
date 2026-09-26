package oop_94079_mariamakarioswirabektidamian.Week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("$accountName: Pembayaran sebesar Rp$amount berhasil.")
            println("Total penggunaan: Rp$usedAmount")
        } else {
            println("$accountName: Transaksi ditolak")
        }
    }
}