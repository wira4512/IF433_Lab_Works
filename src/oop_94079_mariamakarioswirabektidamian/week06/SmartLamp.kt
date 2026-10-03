package oop_94079_mariamakarioswirabektidamian.week06


class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name dinyalakan.")
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }
}