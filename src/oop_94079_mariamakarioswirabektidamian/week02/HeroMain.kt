package oop_94079_mariamakarioswirabektidamian.week02

import java.util.Scanner

class HeroMain(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("\n⚔️  $name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== GAME TURN-BASED SIMULATION ===")

    // 1. Input nama Hero & stat Damage, lalu buat Objeknya
    print("Masukkan Nama Hero   : ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage : ")
    val heroDamage = scanner.nextInt()

    val hero = Hero(name = heroName, baseDamage = heroDamage)

    // 2. Variabel bantuan untuk Musuh
    var enemyHp = 100
    val enemyName = "Goblin"

    println("\n👾 Musuh ($enemyName) muncul dengan HP: $enemyHp!")

    // 3. Loop utama (Berjalan selama Hero hidup DAN Musuh hidup)
    while (hero.isAlive() && enemyHp > 0) {
        println("\n----------------------------------")
        println("Status saat ini:")
        println("• ${hero.name} HP : ${hero.hp}")
        println("• $enemyName HP : $enemyHp")
        println("----------------------------------")
        println("Pilih Aksi:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan Anda (1/2): ")

        when (scanner.nextInt()) {
            1 -> {
                // Hero menyerang musuh
                hero.attack(enemyName)
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("💥 $enemyName menerima ${hero.baseDamage} damage! (Sisa HP $enemyName: $enemyHp)")

                // Jika musuh masih hidup, musuh membalas serangan
                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("\n👹 $enemyName membalas serangan!")
                    hero.takeDamage(enemyDamage)
                    println("🛡️  ${hero.name} menerima $enemyDamage damage! (Sisa HP ${hero.name}: ${hero.hp})")
                }
            }
            2 -> {
                println("\n🏃 ${hero.name} memilih untuk kabur dari pertarungan!")
                break // Paksa loop berhenti
            }
            else -> {
                println("\n⚠️ Pilihan tidak valid! Silakan pilih 1 atau 2.")
            }
        }
    }

    // 4. Pengumuman Pemenang di luar loop
    println("\n==================================")
    println("      PERTARUNGAN BERAKHIR       ")
    println("==================================")

    if (enemyHp == 0) {
        println("🎉 SELAMAT! ${hero.name} berhasil mengalahkan $enemyName!")
    } else if (!hero.isAlive()) {
        println("☠️ GAME OVER! ${hero.name} telah gugur dalam pertarungan.")
    } else {
        println("🏳️ Pertarungan berakhir karena ${hero.name} kabur.")
    }
}