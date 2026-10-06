package oop_94079_mariamakarioswirabektidamian.UTS_094079_mariamakarioswirabektidamian

class CateringOrder(
    val customer: Customer
) {

    var status: OrderStatus = OrderStatus.WAITING_LIST

    private val orderItems: MutableList<Pair<CateringMenu, Int>> =
        mutableListOf()

    fun addMenuToOrder(
        menu: CateringMenu,
        qty: Int
    ) {
        orderItems.add(Pair(menu, qty))
    }

    fun printInvoice() {

        println("================ INVOICE ================")

        println(
            "Customer: ${customer.name} (${customer.phone})"
        )

        println(
            "Delivery Address: ${customer.deliveryAddress}"
        )

        println(
            "Order Status: $status"
        )

        println()

        var grandTotal = 0.0

        for ((index, item) in orderItems.withIndex()) {

            val menu = item.first
            val quantity = item.second

            val category = when (menu) {
                is FoodMenu -> "FOOD"
                is DrinkMenu -> "DRINK"
                else -> "MENU"
            }

            val sizeText = when (menu) {
                is DrinkMenu -> {
                    if (menu.isLargeSize) {
                        " (Large)"
                    } else {
                        " (Regular)"
                    }
                }

                else -> ""
            }

            val unitText = when (menu) {
                is FoodMenu -> "portions"
                is DrinkMenu -> "cups"
                else -> "items"
            }

            val subtotal = menu.calculateSubtotal(quantity)

            println(
                "${index + 1}. [$category] ${menu.menuCode} - " +
                        "${menu.name}$sizeText"
            )

            println(
                " Qty: $quantity $unitText | " +
                        "Subtotal: Rp ${formatRupiah(subtotal)}"
            )

            grandTotal += subtotal
        }

        println("-----------------------------------------")
        println(
            "GRAND TOTAL: Rp ${formatRupiah(grandTotal)}"
        )
        println("=========================================")
    }

    private fun formatRupiah(amount: Double): String {
        return String.format(
            "%,.0f",
            amount
        ).replace(",", ".")
    }
}