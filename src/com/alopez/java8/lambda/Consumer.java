package com.alopez.java8.lambda;

import com.alopez.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Consumer {

    public static void main(String[] args) {

        java.util.function.Consumer<String> consumidor = saludo -> {
            System.out.println("saludo");
        };
        //Consumer es una expresión lambda que permite pasar por argumento un solo parametro, un saludo que es del tipo String
        //El metodo no devuelve nada

        java.util.function.Consumer<Date> consumidorFecha = fecha -> { //Expresion lambda para pasar la fecha
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd"); //Definimos el formato para la fecha
            System.out.println(fecha); //Imprimimos la fecha
        };

        consumidor.accept(new String());
        consumidorFecha.accept(new Date()); //Para imprimir el metodo debemos usar accept

        BiConsumer<String, Integer> consumerBi = (nombre, edad) -> { //Los parentesis son necesarios por la cuestion de que son dos argumentos
            System.out.println(nombre + ", tiene " + edad + " años");
        };

        consumerBi.accept("Alex", 20); //En el accept, podemos pasar por argumento los datos que queremos que se impriman


        java.util.function.Consumer<String> consumidorDos = System.out::println;
        consumidorDos.accept("Imprimiendo con lambda");
        //Las expresiones lambda se utilizan mucho en API's, propiamente de Java, en los ForEach

        List<String> nombres = Arrays.asList("Daniel","Alejandro","Lopez","Delgado"); //Creamos una lista de nombres
        nombres.forEach(consumidorDos); //Usamos el forEach de Java8 para imprimir la lista usando el metodo de ConsumidorDos

        Supplier<Usuario> creaUsuario = Usuario::new; //Este es igual al de abajo, solo que simplificado con el metodo de referencia
//        Supplier<Usuario> creaUsuario = () -> new Usuario(); //Creamos un usuario con supplier, ya que este devuelve el objeto
        //Supplier<Tipo, que en este caso es Usuario>


        Usuario usuario = new Usuario(); //Creamos la instancia para tener un nuevo usuario

/*        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) ->{ //BiConsumer con dos atributos, uno del tipo usuario y otro del tipo String
            //(persona, nombre) para los argumentos se le puede dar cualquier nombre
            persona.setNombre(nombre);
        };*/

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre; //Este es igual al que está comentado, solo esta
        //simplificado con el metodo de referencia

        asignarNombre.accept(usuario, "Alex"); //Con accept asignamos un nombre, pero no hace nada, porque el metodo solo es para
        //asignar un nombre al usuario
        System.out.println("Nombre usuario: " + usuario.getNombre()); //Obtenemos el nombre del usuario con getNombre() e imprimimos el resultado


        Supplier<String> proveedor = () -> { //Supplier no recibe argumentos, solo retorna
            return "Hola mundo con lambda supplier";
        };

        Supplier<String> proveedorDos = () -> "Hola mundo con lambda supplier"; //Este es igual al de arriba, solo que está simplificado

        System.out.println(proveedor.get()); //Obtenemos el valor que retorno el supplier

    }

}