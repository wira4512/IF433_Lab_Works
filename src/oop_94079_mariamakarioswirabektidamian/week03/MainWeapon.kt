package oop_94079_mariamakarioswirabektidamian.week03

fun main() {
    val weapon = Weapon("Excalibur", 500)

    weapon.damage = -50
    println("Damage: ${weapon.damage}")

    weapon.damage = 9999
    println("Damage: ${weapon.damage}")

    println("Tier: ${weapon.tier}")
}