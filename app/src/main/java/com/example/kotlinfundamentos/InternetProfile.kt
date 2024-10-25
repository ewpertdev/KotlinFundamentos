package com.example.kotlinfundamentos

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    // Método para mostrar el perfil de la persona
    fun showProfile() {
        println("Nombre: $name")
        println("Edad: $age")
        if (hobby != null) {
            println("Le gusta $hobby.")
        }
        if (referrer != null) {
            println("Tiene un referente llamado ${referrer.name}, a quien le gusta ${referrer.hobby}.")
        } else {
            println("No tiene referente.")
        }
        println()
    }
}

fun main() {    
    // Crear instancias de Person y mostrar sus perfiles
    val amanda = Person("Amanda", 33, "jugar tenis", null)
    val atiqah = Person("Atiqah", 28, "escalar", amanda)
    
    amanda.showProfile()
    atiqah.showProfile()
}
