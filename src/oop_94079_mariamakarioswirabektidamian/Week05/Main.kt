package oop_94079_mariamakarioswirabektidamian.Week05

fun main() {

    val eWallet = EWallet(
        accountName = "Wira E-Wallet",
        balance = 50000.0
    )

    val creditCard = CreditCard(
        accountName = "Wira Credit Card",
        limit = 100000.0
    )

    val paymentMethods: List<PaymentMethod> = listOf(
        eWallet,
        creditCard
    )

    for (paymentMethod in paymentMethods) {

        println("\nMemproses pembayaran untuk ${paymentMethod.accountName}")

        paymentMethod.processPayment(75000.0)
    }
}