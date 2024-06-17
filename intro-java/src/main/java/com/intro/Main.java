package com.intro;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


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