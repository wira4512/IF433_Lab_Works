package oop_94079_mariamakarioswirabektidamian.UTS_094079_mariamakarioswirabektidamian

import java.util.Scanner

fun main() {

    println("=== UMN CATERING MANAGER SYSTEM ===")

    // ==========================================
    // PHASE 1 - DATABASE SETUP
    // ==========================================

    println("[Database Setup] Adding Nasi Goreng Spesial...")

    val nasiGoreng = FoodMenu(
        name = "Nasi Goreng Spesial",
        menuCode = "nsg01",
        basePrice = -15000.0
    )

    // Test custom setter
    nasiGoreng.basePrice = 25000.0

    println("[Database Setup] Price updated to Rp 25.000")

    val ayamBakar = FoodMenu(
        name = "Ayam Bakar Madu",
        menuCode = "aym02",
        basePrice = 35000.0
    )

    val esTehLemon = DrinkMenu(
        name = "Es Teh Lemon",
        menuCode = "lem01",
        basePrice = 8000.0,
        isLargeSize = true
    )

    val menuCatalog: List<CateringMenu> = listOf(
        nasiGoreng,
        ayamBakar,
        esTehLemon
    )

    // ==========================================
    // PHASE 2 - CUSTOMER DATA INPUT
    // ==========================================

    val scanner = Scanner(System.`in`)

    println()
    println("--- CUSTOMER DATA INPUT ---")

    print("Enter Customer Name: ")
    val name = scanner.nextLine()

    print("Enter Phone Number: ")
    val phone = scanner.nextLine()

    print("Enter Delivery Address: ")
    val deliveryAddress = scanner.nextLine()

    val customer = Customer(
        name = name,
        phone = phone,
        deliveryAddress = deliveryAddress
    )

    val order = CateringOrder(customer)

    // ==========================================
    // PHASE 3 - ORDER INPUT
    // ==========================================

    while (true) {

        println()
        println("--- MENU CATALOG ---")

        println("1. Nasi Goreng Spesial")
        println("2. Ayam Bakar Madu")
        println("3. Es Teh Lemon")
        println("0. [FINISH & CHECKOUT]")

        print("Select Menu Number: ")
        val menuNumber = scanner.nextInt()

        if (menuNumber == 0) {
            println("Processing Checkout...")
            break
        }

        if (menuNumber !in 1..menuCatalog.size) {
            println("[Error] Invalid menu number!")
            continue
        }

        print("Enter Quantity: ")
        val quantity = scanner.nextInt()

        if (quantity <= 0) {
            println("[Error] Quantity must be greater than 0!")
            continue
        }

        val selectedMenu = menuCatalog[menuNumber - 1]

        order.addMenuToOrder(
            selectedMenu,
            quantity
        )

        println("Order successfully added!")
    }

    // ==========================================
    // PHASE 4 - CHECKOUT
    // ==========================================

    order.status = OrderStatus.COOKING

    println()

    order.printInvoice()

    scanner.close()
}