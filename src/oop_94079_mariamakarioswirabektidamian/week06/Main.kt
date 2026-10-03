package oop_94079_mariamakarioswirabektidamian.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout....")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showtime()

    val myPhone = Smartphone()
    myPhone.turn0n()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== Testing Checkout ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)
}