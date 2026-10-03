package oop_94079_mariamakarioswirabektidamian.week06

class Smartphone : Camera, Phone {
    override fun turn0n() {
        super<Camera>.turn0n()
        super<Phone>.turn0n()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}