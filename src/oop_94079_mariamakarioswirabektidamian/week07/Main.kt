
package oop_94079_mariamakarioswirabektidamian.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")

    DatabaseManager.connect()
    DatabaseManager.connect()

    println("Status: ${DatabaseManager.connectionStatus}")

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)

    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse =
        ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is ApiResponse.Loading -> "Tampilkan Spinner"
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Failure ->
            "Munculkan Alert: ${response.message}"
    }

    println(uiMessage)

    println("\n=== TEST GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== ITEM RARITY ===")
    println(
        "Legendary Drop Chance: " +
                "${ItemRarity.LEGENDARY.dropChance}%"
    )

    val starterSword = Weapon.forgeStarterSword()

    println("\n=== STARTER WEAPON ===")
    println("Nama: ${starterSword.item.name}")
    println("Damage: ${starterSword.item.damage}")
    println("Rarity: ${starterSword.item.rarity}")
    println("Durability: ${starterSword.durability}")

    // Test Epic Sword Factory
    val epicSword = Weapon.forgeEpicSword()

    println("\n=== EPIC WEAPON ===")
    println("Nama: ${epicSword.item.name}")
    println("Damage: ${epicSword.item.damage}")
    println("Rarity: ${epicSword.item.rarity}")
    println("Durability: ${epicSword.durability}")
}
