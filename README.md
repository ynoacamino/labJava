# Cosas que voy aprendiendo del lenguaje Java

Aqui voy a ir poniendo todo lo que vaya aprendiendo.

## Estructura general del lenguaje

Java es un lengauje que sus sientos estan en relacion al paradigma POO(programacion orientada a objetos), de modo que cuando creoamos un archivo .java este debe llevar el mismo nombre que la clase principal q contiene. De esta manera:

`public class NombreDelArchivo { }`

Habremos declarado una clase, la cual podemos ejecutar, para esto nesesitamos declara el metodo `main`, esto es muy importante ya que siempre se iniciara por este metodo. Se declara de la siguiente manera:

`public static void main(String[] args) { }`

## Declarar variables y constantes

Podemos declara variables de la siguiente manera:

`int myNumber = 1`

Como primer parametro pasamos el tipo de dato, en este caso `int`, tambien puede ser `String`, `char`, `doble`, etc.
A su vez como segundo parametro pasamos el nombre de la variable, en mi caso `myNumber`.
Por ultimo pasamos el valor. ❗Tenemos que pasar un valor que cumpla con el tipo de dato que declaramos previamente.

Para declarar constantes es lo mismo pero anteponiendo `final`, de esta manera:

`final int myNumber = 1`

## Salida a consola

La forma correcta seria de la sigueinte manera:

`System.out.println("Hello World!")`

De modo que imprime `Hello World` en consola. Una forma mas rapida es escribir `Sysout`, y esperar a que nuestro editor de codigo lo autocomplete.

A mi no me gusta esta manera, ya que aun no me constumbro. Que solucion encontre? Esta:

    public static void consoleLog(String imp) {
      System.out.println(imp);
    }

1. Primero declaramos un metodo, le decimos que sea publico `public`
2. Luego que sea estatico `static`
3. Le decimosuqe no devolvera nada `void`
3. Que se llame `consoleLog`
4. Por ultimo definimos y le decimos que tipo de dato aceptara como argumento `(String imp)`, es nuestro caso, el tipo sera un `String` y el nombre sera `imp`

# Cuando tenga mas tiempo continuo
