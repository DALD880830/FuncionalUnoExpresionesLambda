package com.alopez.java8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {

    public double computar(double a, double b, Aritmetica lambda){ //Metodo que recibe double a, double b y la interfaz Aritmetica
        return lambda.operacion(a, b);
    }

    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda){ //Metodo que recibe double a, double b y la interfaz Aritmetica
        return lambda.apply(a, b);
    }
    //Con expresiones lambda no acepta sobrecarga de metodos

}