package com.example.kotlinfundamentos

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    var playCount: Int
) {
    // Propiedad calculada para determinar si la canción es popular
    val isPopular: Boolean
        get() = playCount >= 1000

    // Método para imprimir la descripción de la canción
    fun printDescription() {
        println("$title, interpretada por $artist, fue lanzada en $yearPublished.")
    }
}

fun main() {
    // Crear una instancia de Song y probar sus métodos
    val song = Song("Bohemian Rhapsody", "Queen", 1975, 1_000_000)
    song.printDescription()
    println("¿Es popular? ${song.isPopular}")
}
