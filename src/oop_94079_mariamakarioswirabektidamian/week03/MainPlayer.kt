package oop_94079_mariamakarioswirabektidamian.week03

fun main() {
    val player = Player("Wira")

    // player.xp
    // Error karena xp bersifat private

    player.addXp(50)
    println("XP belum bisa diakses langsung dari luar class")
    println("Level: ${player.level}")

    player.addXp(60)
    println("Level: ${player.level}")
}