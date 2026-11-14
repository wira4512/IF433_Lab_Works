package oop_94079_mariamakarioswirabektidamian.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("================================")
    println("       CRYPTO WALLET")
    println("================================")
    println("Response Status: ${response.status}")
    println("\nCoin Balance:")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}")
        println("Balance: ${coin.balance}")
        println("----------------------------")
    }

    println("\nSearch Coin: BTC")

    val searchResult = coinRepo.searchByName("BTC")

    searchResult.forEach { coin ->
        println("Found: ${coin.name}, Balance: ${coin.balance}")
    }

    // 6. Inisialisasi Transaction Repository
    val txRepo = WalletRepository<Transaction>()

    // 7. Menambahkan data transaksi
    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 250.0))
    txRepo.add(Transaction("TX003", 1000.0))

    // 8. Menampilkan transaksi
    println("\n================================")
    println("       TRANSACTION HISTORY")
    println("================================")

    txRepo.getAll().forEach { transaction ->
        println("Transaction ID: ${transaction.id}")
        println("Amount: ${transaction.amount}")
        println("----------------------------")
    }
}