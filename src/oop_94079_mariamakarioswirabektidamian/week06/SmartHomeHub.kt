package oop_94079_mariamakarioswirabektidamian.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== Mematikan Semua Perangkat ===")

        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}