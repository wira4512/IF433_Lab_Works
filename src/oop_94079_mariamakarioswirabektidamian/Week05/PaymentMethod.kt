package oop_94079_mariamakarioswirabektidamian.Week05

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}