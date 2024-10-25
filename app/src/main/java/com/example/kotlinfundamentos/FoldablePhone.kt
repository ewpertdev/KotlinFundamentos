package com.example.kotlinfundamentos

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }
    
    fun switchOff() {
        isScreenLightOn = false
    }
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "encendida" else "apagada"
        println("La luz de la pantalla del teléfono está $phoneScreenLight.")
    }
}

// Clase para teléfonos plegables que hereda de Phone
class FoldablePhone(var isFolded: Boolean = true) : Phone() {
    // Sobrescribe el método switchOn para considerar si está plegado
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    // Método para desplegar el teléfono
    fun unfold() {
        isFolded = false
    }

    // Método para plegar el teléfono
    fun fold() {
        isFolded = true
        isScreenLightOn = false
    }
}

fun main() {
    // Probar la funcionalidad del teléfono plegable
    val myPhone = FoldablePhone()
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight()  // Debería estar apagada
    myPhone.unfold()
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight()  // Debería estar encendida
    myPhone.fold()
    myPhone.checkPhoneScreenLight()  // Debería estar apagada
}
