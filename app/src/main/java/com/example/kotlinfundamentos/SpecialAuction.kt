package com.example.kotlinfundamentos

class Bid(val amount: Int, val bidder: String)

// Función para determinar el precio de la subasta
fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}

fun main() {
    val winningBid = Bid(5000, "Coleccionista Privado")
    
    // Probar la función auctionPrice con y sin oferta
    println("El artículo A se vende por ${auctionPrice(winningBid, 2000)}.")
    println("El artículo B se vende por ${auctionPrice(null, 3000)}.")
}
