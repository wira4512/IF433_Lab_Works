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
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {

        print("Masukkan Jurusan (Kosongkan jika belum memilih): ")
        val inputMajor = scanner.nextLine()

        // Default jurusan jika mahasiswa belum memilih jurusan
        val major: String

        if (inputMajor.isBlank()) {
            major = "Non-Matriculated"
        } else {
            major = inputMajor
        }

        val s1 = Student(name, nim, major)

        println("\nStatus: Pendaftaran Selesai.")
        println("Nama: ${s1.name}")
        println("NIM: ${s1.nim}")
        println("Jurusan: ${s1.major}")
    }
}