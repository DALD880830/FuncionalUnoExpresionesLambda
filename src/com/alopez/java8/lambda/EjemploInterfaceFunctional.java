package com.alopez.java8.lambda;

import com.alopez.java8.lambda.aritmetica.Aritmetica;
import com.alopez.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {

    public static void main(String[] args) {

        Aritmetica suma = (a, b) -> a + b; //Expresion lambda para sumar
        Aritmetica resta = (a, b) -> a - b; //Expresion lambda para restar
        Aritmetica multi = (a, b) -> a * b; //Expresion lambda para multiplicar
//        Aritmetica divi = (a, b) -> a / b; //Expresion lambda para dividir

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10, 5, suma)); //Pasamos por parametro los numeros para la suma
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5, multi));
        System.out.println(cal.computar(10, 5, (a, b) -> a / b)); //Pasamos por parametro los numeros para la division
        //y pasamos una expresion lambda especifica que no este declarada

        System.out.println(cal.computarConBiFunction(10, 5, (a, b)-> a+b));
    }

}