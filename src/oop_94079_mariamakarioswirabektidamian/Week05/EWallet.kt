package oop_94079_mariamakarioswirabektidamian.Week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("$accountName: Pembayaran sebesar Rp$amount berhasil.")
            println("Saldo tersisa: Rp$balance")
        } else {
            println("$accountName: Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName: Top Up sebesar Rp$amount berhasil.")
        println("Saldo sekarang: Rp$balance")
    }
}