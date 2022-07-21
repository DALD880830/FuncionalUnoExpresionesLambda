package com.alopez.java8.lambda;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {

        Function<String, String> funcionUno = param -> "Hey, que onda " + param;
        //Function, recibe un argumento y devuelve un valor, es una combinacion entre Consumer y Supplier
        //<Tipo que recibe, Tipo que devuelve>

        String resultado = funcionUno.apply("Alejandro"); //Copn apply, el argumento que ponemos se aplica al parametro de Function
        System.out.println(resultado); //Imprimimos el resultado
        //Function se utiliza mucho en el API Stream de Java, programacion funcional y en clases que utilicen expresiones lambda

//        Function<String, String> funcionDos = param -> param.toUpperCase(); //Funcion, en la que el String
        Function<String, String> funcionDos = String::toUpperCase; //Este es igual que el de arriba
        System.out.println(funcionDos.apply("alejandro"));

        BiFunction<String, String, String> funcionTres = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        //<Tipo argumento 1, Tipo argumento 2, Tipo que retorna>
        //(argumento1, argumento2) El argumento 1 lo pasamos a mayusculas y lo concatenamos con el argumento2 el cual tambien ponemos en mayusculas

        String resultadoDos = funcionTres.apply("Daniel ", "Alejandro");
        System.out.println(resultadoDos);

//        BiFunction<String, String, Integer> funcionCuatro = (a, b) -> a.compareTo(b); //Compara si a es igual a b y retorna un entero
        BiFunction<String, String, Integer> funcionCuatro = String::compareTo;
        System.out.println(funcionCuatro.apply("Alex", "alex"));



    }

}