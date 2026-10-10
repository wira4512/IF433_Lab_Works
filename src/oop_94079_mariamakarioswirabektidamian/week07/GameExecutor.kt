package oop_94079_mariamakarioswirabektidamian.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> {
            println("Pemain berada di zona aman.")
        }

        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}!")
            println("Bersiap untuk bertarung!")
        }

        is BattleState.LootDropped -> {
            println("Loot ditemukan!")
            println("Nama item: ${event.item.name}")
            println("Damage: ${event.item.damage}")
            println("Rarity: ${event.item.rarity}")
        }

        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
    }
}

