package oop_94079_mariamakarioswirabektidamian.week10

class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
    fun searchByName(query: String): List<T> {
        return items.filter { item ->
            item is Named &&
                    item.name.contains(query, ignoreCase = true)
        }
    }
}