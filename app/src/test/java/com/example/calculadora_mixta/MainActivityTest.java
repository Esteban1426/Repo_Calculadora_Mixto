package com.example.calculadora_mixta;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainActivityTest {


    @Test
    public void Suma() {
        Test_CalculadoraKotlin test = new Test_CalculadoraKotlin();
        int resultado = test.suma(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void Resta() {
        Test_CalculadoraKotlin test = new Test_CalculadoraKotlin();
        int resultado = test.resta(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void Multiplicar() {
        Test_CalculadoraKotlin test = new Test_CalculadoraKotlin();
        int resultado = test.multiplicar(4, 6);

        assertEquals(24, resultado);

    }

    @Test
    public void Dividir() {
        Test_CalculadoraKotlin test = new Test_CalculadoraKotlin();
        int resultado = test.dividir(8, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void Potenciar() {
        Test_CalculadoraKotlin test = new Test_CalculadoraKotlin();
        long resultado = test.potenciar(2, 3);
        assertEquals(8, resultado);
    }
}