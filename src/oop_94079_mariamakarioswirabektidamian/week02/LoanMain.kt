package oop_94079_mariamakarioswirabektidamian.week02

import java.util.Scanner

// Class Loan sesuai spesifikasi sebelumnya
class LoanMain(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    fun printLoanInfo() {
        println("\n=== DETAIL PEMINJAMAN ===")
        println("Judul Buku     : $bookTitle")
        println("Peminjam       : $borrower")
        println("Durasi Pinjam  : $loanDuration hari")
        println("Total Denda    : Rp ${calculateFine()}")
        println("==========================")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== INPUT PEMINJAMAN BUKU ===")

    // 1. Minta input Judul, Peminjam, dan Lama Pinjam
    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // 2. Validasi: Jika lama pinjam minus, ubah menjadi 1 hari
    if (duration < 0) {
        println("\n[Peringatan] Lama pinjam tidak boleh minus. Otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    // 3. Buat objek Loan dan cetak detail peminjaman
    val loan = Loan(bookTitle = title, borrower = borrower, loanDuration = duration)
    loan.printLoanInfo()
}