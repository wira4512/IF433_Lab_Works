package oop_94079_mariamakarioswirabektidamian.week04

fun main() {
    println("-----Testing Vehicle-------")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ----")
    val myCar = Car("Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}