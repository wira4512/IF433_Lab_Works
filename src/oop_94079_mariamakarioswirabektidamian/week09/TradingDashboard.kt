package oop_94079_mariamakarioswirabektidamian.week09

import java.util.Locale

fun main() {

    // ==================== INISIALISASI DATA ====================

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.3, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, -12.7, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, 3.6, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 8, -2.4, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 10, 6.1, "CLOSED")
    )
}