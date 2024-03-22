package com.example.calculadora_mixta

import junit.framework.TestCase.assertEquals
import org.junit.Test

class MainActivity3Test {

    @Test
    fun calcularFactorial() {
        val test = Test_FactorialYFibonacciJava()
        val resultado = test.calcularFactorial(5)
        assertEquals(120, resultado)
        println(resultado)
    }

    @Test
    fun calcularMetodoFibonacci() {
        val test = Test_FactorialYFibonacciJava()
        val resultado = test.calcularMetodoFibonacci(2)
        assertEquals(2, resultado)
        println(resultado)
    }

    @Test
    fun fibonacci() {
        val test = Test_FactorialYFibonacciJava()
        val resultado = test.fibonacci(10)
        assertEquals(55, resultado)
        println(resultado)
    }
}