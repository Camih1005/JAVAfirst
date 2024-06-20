package com.intro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Main method = new Main();
        method.concatenar();
        method.arrayListss();
        method.Matriz();
        method.listadd();
    //cxzcxcxcxcx
    }
    
    ArrayList<String> agregar = new ArrayList<>();
        
        private  void concatenar(){
        String inmutableStr = "Hola";
        inmutableStr = inmutableStr.concat(" Mundo");
        System.out.println(inmutableStr);
        }
        private  void arrayListss(){
            agregar.add("camilo");
            System.out.println(agregar);
        }
        private  void Matriz(){
           String [] colores = {"Amarrilo","Rojo","Verde"};
           System.out.println(colores);
        }
        private  void listadd(){
            agregar.add("carlos");
            agregar.add(1,"christian");
            System.out.println(agregar);
         }
         private  void gets(){
            
            agregar.add(1,"christian");
            System.out.println(agregar);
         }
        
}
    
     




