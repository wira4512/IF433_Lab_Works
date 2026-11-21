package oop_94079_mariamakarioswirabektidamian.week11

fun main() {

    // Menampung seluruh perangkat Smart Home
    val homeDevices = mutableListOf<SmartDevice>()


    // Konfigurasi lampu pintar menggunakan apply dan also
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}