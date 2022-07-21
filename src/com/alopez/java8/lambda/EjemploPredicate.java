package com.alopez.java8.lambda;

import com.alopez.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;//Predicate siempre retorna un boolean,
        // no es necesario indicar el tipo de retorno, recibe un valor de cualquier tipo
        //Despues de la expresion lambda evaluamos si el numero que pasemos por argumento es mayor a 10
        boolean resultado = test.test(7); //De test invocamos el metodo test y le pasamos por argumento un numero a evaluar
        System.out.println("resultado = " + resultado); //Imprimimos el valor de resultado, el cual puede ser true o false


        Predicate<String> testDos = role -> role.equals("ROLE_ADMIN"); //Evalua si el role que pasamos es iguala al del predicate
        System.out.println("Tests dos = " + testDos.test("ROLE_ADMIN")); //Pasamos el role por argumento


//        BiPredicate<String, String> testTres = (a, b) -> a.equals(b);
        BiPredicate<String, String> testTres = String::equals;
        System.out.println("Test tres: " + testTres.test("alex","Alex")); //Pasamos los nombres por argumento

        BiPredicate<Integer, Integer> testCuatro = (i, j) -> j > i; //Evalua si de los numeros que pasamos por argumento, uno es mayor que otro
        boolean resultadoDos = testCuatro.test(5,10); //Pasarmos los numeros por argumento
        System.out.println("Test cuatro: " + resultadoDos);

        Usuario a = new Usuario(); //Agregamos un nuevo usuario a
        Usuario b = new Usuario();//Agregamos un nuevo usuario b
        a.setNombre("Daniel"); //Asignamos un nombre a usuario a
        b.setNombre("Alejandro"); //Asignamos un nombre a usuario b
        BiPredicate<Usuario, Usuario> testCinco = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        //Comparamos los nombres con equals, los cuales obtenemos con getNombre
        //En BiPredicate pasamos en <> los tipos de datos
        System.out.println(testCinco.test(a, b)); //Imprimimos la comparacion de usuario a con usuario b


    }

}