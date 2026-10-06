package oop_94079_mariamakarioswirabektidamian.UTS_094079_mariamakarioswirabektidamian

class FoodMenu(
    name: String,
    menuCode: String,
    basePrice: Double
) : CateringMenu(name, menuCode, basePrice) {

    val packagingFee: Double = 3000.0

    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        println("Food  : $name")
        println("Code  : $menuCode")
        println("Qty   : $quantity")
        println("Price : Rp${basePrice}")
        println("Packaging Fee : Rp${packagingFee}")
        println("Subtotal : Rp${calculateSubtotal(quantity)}")
    }
}