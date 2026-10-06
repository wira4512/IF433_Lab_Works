package oop_94079_mariamakarioswirabektidamian.UTS_094079_mariamakarioswirabektidamian

abstract class CateringMenu(
    val name: String,
    menuCode: String,
    basePrice: Double
) : IBillable {

    var menuCode: String = menuCode
        set(value) {
            field = value.uppercase()
        }
        get() = "UMN-$field"

    var basePrice: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price!")
            }
        }

    init {
        this.basePrice = basePrice
    }

    abstract override fun calculateSubtotal(quantity: Int): Double

    abstract override fun printMenuDetails(quantity: Int)
}