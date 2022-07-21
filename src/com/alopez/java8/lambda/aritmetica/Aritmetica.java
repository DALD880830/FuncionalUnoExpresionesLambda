package com.alopez.java8.lambda.aritmetica;

@FunctionalInterface //Semantica, descriptivo de documentacion, aunque no aporta nada
public interface Aritmetica {

    double operacion(double a, double b); //Metodo abstracto, que recibe dos double
    //Aqui creamos nuestras propias expresiones lambda, aunque se pueden personalizar, es recomendable utilizar
    //las que ya son propias del lenguaje java

}
