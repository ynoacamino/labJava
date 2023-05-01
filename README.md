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

## Metodos utiles para los ArrayList

`public int size()`

Retorna el número de elementos en la lista.

`public void add(int index, E elem)`

Inserta el elem en la posición index indicada. Desplazando los elementos originales a posiciones mayores.

`public void clear()`

Borra todos los elementos del ArrayList.

`public int indexOf (E elem)`

Busca la primera ocurrencia del parámetro elem dentro del ArrayList. Si lo encuentra retorna la posición correspondiente dónde lo encontró, si no devuelve -1.

`public boolean isEmpty()`

Retorna true si la lista no contiene elementos.

`public E remove (int index)`

Quita el elemento ubicado en la posición indicada index, desplaza todos los elementos con indice mayor a posiciones menores, además retorna el elemento borrado (elemento que puede ser capturado en variable o no).

`public boolean contains (E elem)`

Retorna true si la lista contiene al parámetro elem.

`public int lastIndexOf (E elem)`

Busca la última ocurrencia del parámetro elem dentro del ArrayList. Si lo encuentra retorna la posición correspondiente dónde lo encontró, si no devuelve -1.

## Usar tipos primitivos en ArrayList

De primer si intentamos hacer esto:

`Arraylist<int> myArrayList = new ArrayList<int>()`

Nos saltara error ya que no acepta tipos primitivos, por lo que tenemos que pasarle como parametro lo siguiente, dependiendo que tipo de datos queremos que almacene.

| Tipo primitivo | Wrapper Class |
|----------|----------|
| int      | Integer  |
| double   | Double   |
| char     | Character|
| boolean  | Boolean  |

Arreglando el erro anterior el codigo quedaria de la siguiente manera

`Arraylist<Integer> myArrayList = new ArrayList<Integer>()`


## Declarar clases y sus constructores
Usamos las clases como moldes para los objetos, estas normalmente se encuentran en carpetas apartes a las cuales se les llama `package`, debio a esto en la primera linea tenemos que definir de la siguiente manera:

`package nombreDeLaCarpeta;`

Luego declaramos la clase y su acceso publico:

`public class className { }`

De esta manera ya podemos comenzar a declarar los valores que tendran nuestras variables, es muy importante que estas tenga un dominio `privated`, de la siguiente manera:

    private int old;
    private String name;
    private String lastName;

Procedemos a declarar un constructor, en caso de no declarar uno java crea el suyo, este se declara como un metodo con el mismo nombre que la clase y pasandole los parametos iniciales, ademas de hacer uso de los metodos `set()` que ya debimos haber declarado:

    public ClassName(int age, String name, String lastName) {
      setName(name);
      setLastName(lastname);
      setAge(age);
    }

Es muy importante anteponer `public` ya que sino nos saldra el sigueinte error:

    The constructor ClassName is not visible



# Cuando tenga mas tiempo, continuo
