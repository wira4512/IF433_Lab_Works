package oop_94079_mariamakarioswirabektidamian.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // Default argument = 100, `var` agar state HP bisa berubah
) {
    // 1. Method Simulasi Serangan
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    // 2. Method Kurangi HP (Mutasi State) dengan Validasi Minimal 0
    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0 // Paksa agar HP tidak minus
        }
        println("$name menerima $damage damage! (Sisa HP: $hp)")
    }

    // 3. Method Cek Status Hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    // Contoh Simulasi Pertarungan Singkat
    val hero1 = Hero(name = "Arthur", baseDamage = 35)
    val hero2 = Hero(name = "Morgoth", baseDamage = 50, hp = 80)

    println("=== PERTARUNGAN DIMULAI ===")
    println("${hero1.name} (HP: ${hero1.hp}) vs ${hero2.name} (HP: ${hero2.hp})\n")

    // Hero 1 menyerang Hero 2
    hero1.attack(hero2.name)
    hero2.takeDamage(hero1.baseDamage)

    // Hero 2 menyerang balik
    hero2.attack(hero1.name)
    hero1.takeDamage(hero2.baseDamage)

    // Hero 1 menyerang Hero 2 lagi dengan damage besar
    hero1.attack(hero2.name)
    hero2.takeDamage(60) // HP Morgoth harusnya minus, tapi ditahan di 0

    println("\n=== STATUS AKHIR ===")
    println("${hero1.name} Hidup? ${hero1.isAlive()}")
    println("${hero2.name} Hidup? ${hero2.isAlive()}")
}