package com.example.kotlinfundamentos

fun main() {
    // Convertir de Celsius a Fahrenheit
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    
    // Convertir de Kelvin a Celsius
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    
    // Convertir de Fahrenheit a Kelvin
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}

// Función para imprimir la temperatura convertida
fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // dos decimales
    println("$initialMeasurement grados $initialUnit son $finalMeasurement grados $finalUnit.")
}
