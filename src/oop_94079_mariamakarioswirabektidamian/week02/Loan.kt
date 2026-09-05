package oop_94079_mariamakarioswirabektidamian.week02

// Definition class Loan dengan Primary Constructor dan Default Argument
class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1 // Default argument = 1 hari
) {
    // Method untuk menghitung denda keterlambatan
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    // Helper method untuk menampilkan informasi peminjaman
    fun printLoanInfo() {
        println("Judul Buku     : $bookTitle")
        println("Peminjam       : $borrower")
        println("Durasi Pinjam  : $loanDuration hari")
        println("Total Denda    : Rp ${calculateFine()}")
        println("-----------------------------------")
    }
}

fun main() {
    // 1. Menggunakan default argument untuk loanDuration (1 hari)
    val loan1 = Loan(bookTitle = "Laskar Pelangi", borrower = "Andi")

    // 2. Meminjam 3 hari (Batas maksimal, tidak kena denda)
    val loan2 = Loan(bookTitle = "Bumi Manusia", borrower = "Budi", loanDuration = 3)

    // 3. Meminjam 6 hari (Terlambat 3 hari, denda: 3 * 2000 = Rp 6.000)
    val loan3 = Loan(bookTitle = "Filosofi Teras", borrower = "Cici", loanDuration = 6)

    // Menampilkan hasil
    println("=== DAFTAR PEMINJAMAN BUKU ===\n")
    loan1.printLoanInfo()
    loan2.printLoanInfo()
    loan3.printLoanInfo()
}