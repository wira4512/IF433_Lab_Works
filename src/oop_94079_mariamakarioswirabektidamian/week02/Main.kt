package oop_94079_mariamakarioswirabektidamian.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("------APLIKASI PBB UMN-------")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM hraus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.next()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}