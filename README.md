# JAVAfirst

## funciones

cadena.charAr(indice) esto hace que muestre la letra en la pocision del indice

equals: es para comparar ignoranco mayusculas y minusculas

valueOf() convierte en otro yipo un dato


substring(indice): es para coger una cadena y apartir de 0 hasat el lindice y convierte en subcadena
o tambien se puede substring(desde,hasta) y es algo parecido
a sql


- wrappers(envolvents)


## ARRAYS

* EN LLAVA LAS LISTAS NO PUEDEN SER DE DIFERENTE TIPO


package com.intro;

public class Main {
    public static void main(String[] args) { 
        System.out.println("Hello world!");
    }
}

--void es para saber que solo bota un valor--
--System.out.println("Hello world!"); -- imprime


// ejemplo

package com.intro;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int edad = 12;
       double precio = 20000; /* ACA DE DECLARA QUE PRECIO TIENE UN VALOR Y ES 2000 */
       String nombre = "Juan";/*declarar con string pero con MAYUSCULA */
       float grado = 23.5F; //al float se le pone el F al final para ceerrar
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ingrese la edad");
            edad = sc.nextInt();
            sc.nextLine();/*para limpiar el buffet y pasar a la siguiente SOUT */
            System.out.println("ingrese el nombre");
            nombre = sc.nextLine();
            sc.close();
        }
       
       System.out.println(nombre + " tiene " + edad); /* CONCATENAR */
       System.out.println(MessageFormat.format("{0} tiene {1} años",nombre,edad));


       //EJEMPLO

       String mensaje = "Hola\nMundo"; // salto de linea entre "Hola" y "Mundo"
        String tabla = "Nombre\tApellido\tEdad\tApellido12"; //tabuladores entre las palabras
        String retroceso = "123\b45"; //Se elimia el 3 con el retroceso
        String ruta = "C:\\Users\\Usuario\\Documentos"; // incluyendo una barra invertida es una ruta
        String comillas = "\"esto es una cita\"" ; //incluyendo las comillas dobles es un texto
        System.out.println(mensaje);
        System.out.println(tabla);
        System.out.println(retroceso);
        System.out.println(ruta);
        System.out.println(comillas);
    


    }



}

## if and try catch

public class Main {

    public static void main(String[] args) {

      try (Scanner sc = new Scanner(System.in)){
        int edad = 0;
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        if(edad >= 18){
            System.out.println("Persona mayor de edad");
        }
        else{
         System.out.println("Persona menor de edad");   
        }
        sc.close();
      }
      catch(InputMismatchException e){
        System.out.println("accion invalida " + e);
      }
      ;
    }



}

##  case switch

public class Main {

    public static void main(String[] args) {

     switch (expresion) {
        case valor1:
           // bloque1
            break;

            case valor2:
           // bloque2
            break;

            case valor3:
           // bloque3 aqui puede haber un sout
            break;
     
        default:
            break;
     }
    }



}


## while

public class Main {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }



}

## otro ejemplo con acumulador

public static void main(String[] args) {
        int valor = 0;
        int acum = 0;
        try(Scanner sc = new Scanner(System.in)){
            while (valor >=0) {
                System.out.println("Ingrese un valor mayor a 0");
                valor = sc.nextInt();
                sc.nextLine();
                if(valor < 0) continue;
                acum += valor;
            }
        }
        System.out.println(MessageFormat.format("la suma de los numero es de {0}", acum));
    }


## do while

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        System.out.println("Ha ingresado un número válido: " + numero);
    }
}

## ciclos for 
public class Main {

    public static void main(String[] args) {
        int valor = 0;
        int acum = 0;
        int numeroInv = 0;
        int numeroVali = 0;
        try(Scanner sc = new Scanner(System.in)){
            for(int i = 0;i <= 3;i++){
                System.out.println("ingrese el valor mayor a 0");
                valor = sc.nextInt();
                sc.nextLine();
                if(valor < 0){
                    numeroInv ++;
                    continue;
                }
                numeroVali ++;
                acum += valor;
            }

        }
        System.out.println(MessageFormat.format("la suma de los numero ingresados es de {0} fueron {1} numers ingresados y de lo numero invalidos es de {2}",acum,numeroVali, numeroInv));
    }


}


