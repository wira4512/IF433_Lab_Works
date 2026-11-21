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

    // Konfigurasi kamera keamanan
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // Konfigurasi AC menggunakan run
    val acDevice = run {
        val device = SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )

        device
    }

    homeDevices.add(acDevice)

// Konfigurasi alat pakan otomatis
    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )
}