package oop_94079_mariamakarioswirabektidamian.UTS_094079_mariamakarioswirabektidamian

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val finalPrice = if (isLargeSize) {
            basePrice + 5000
        } else {
            basePrice
        }

        return finalPrice * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val size = if (isLargeSize) "Large" else "Regular"

        println("Drink : $name")
        println("Code  : $menuCode")
        println("Size  : $size")
        println("Qty   : $quantity")
        println("Subtotal : Rp${calculateSubtotal(quantity)}")
    }
}